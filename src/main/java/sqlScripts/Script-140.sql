select
	DATE_FORMAT(t1.inspect_time, '%Y-%m') as x,
	count(1) as y
from
	ins_inspection t1
left join pty_party p1 on
	p1.id = t1.inspect_by
left join pty_party p2 on
	p2.id = t1.party_group_id
left join pty_party p3 on
	p3.id = t1.inspect_depart_id
left join ope_special_operation op on
	t1.business_key = op.id
left join pty_party pty on
	t1.business_key = pty.id
	and t1.business_type in ('company', 'department')
left join ins_checkform f on
	t1.form_id = f.id
left join ref_reference ref3 on
	ref3.element_code = 'inspectionCheckResult'
	and ref3.data_code = t1.result
left join ref_reference ref on
	ref.element_code = 'checkCategory'
	and ref.data_code = t1.check_category
left join pty_relationship relat on
	relat.party_id_from = t1.org_id
	and relat.role_type_from = 'company'
	and relat.relationship_type = 'organizational_structure'
left join pty_party pty5 on
	t1.org_id = pty5.id
left join rsk_risk_assessment_limit lit on
	lit.risk_level = t1.level
	and lit.type = 'inspection_level'
left join idm_user idm on
	idm.id = t1.created_by
left join pty_party pty2 on
	idm.person_id = pty2.id
left join idm_user idm1 on
	idm1.id = t1.last_updated_by
left join pty_party pty3 on
	idm1.person_id = pty3.id
where 1 = 1
and ((t1.check_category ='checkOperation' or t1.business_type = 'operation') or ((t1.check_category ='specialOperationPatrol' or t1.business_type ='specialOperationPatrol')
            and t1.operation_pass_flag =true))
            and relat.code like  "001010%"  and  relat.status = 'enabled'
group by
	x
order by
	x