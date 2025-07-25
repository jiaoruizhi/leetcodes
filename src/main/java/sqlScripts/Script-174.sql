



select
	t1.status,
	t1.org_id,
	case
		when ci.abbreviation is not null then ci.abbreviation
		else ci.name
	end as orgName
from
	ins_issue t1
left join ins_inspection_issue t2 on
	t2.issue_id = t1.id
left join ins_inspection_item t3 on
	t3.id = t1.inspection_item_id
left join ins_inspection t4 on
	t4.id = t1.inspection_id
left join company_info ci on
	ci.id = t1.org_id
left join pty_relationship relat on
	relat.party_id_from = t1.org_id
	and relat.role_type_from = 'company'
	and relat.relationship_type = 'organizational_structure'
where
	1 = 1
	and t1.status != 'draft'
	and t1.result != 'normal'
	and t1.status != 'beConfirmed'
	and t1.object_state = 'enabled'
	and t4.object_state = 'enabled'
	and t1.org_id = 27009365
	and t4.inspect_time >= '2024-07-01'
	and t4.inspect_time <= '2024-07-31'

	
