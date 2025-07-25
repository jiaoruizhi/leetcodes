
-- issue search


select
	t3.warning_time,
	t4.alertPersonId,
	t1.id,
	t1.id as issueId,
	case
		when t1.overdue_status = 'overdue' then '是'
		else '否'
	end as overdueFlag,
	t1.score,
	case
		when t11.name is not null then t11.name
		when r.name is not null then r.name
		when c.name is not null then c.name
		when wh.name is not null then wh.name
		when op.name is not null then op.name
		when base.name is not null then base.name
		when info.abbreviation is not null then info.abbreviation
		when loc.name is not null then loc.name
		else pty.NAME
	end as riskName,
	ifnull(t1.data_source, '手工创建') as dataSource,
	t11.name as deviceInspectionName,
	pty4.name as principalName,
	c.name as majorHazardName,
	wh.name as chemicalWarehouseName,
	op.name as operationName,
	base.name as projectName,
	t2.inspection_person,
	t2.check_category,
	t1.chemical_flag,
	ref4.data_name as typeName,
	t1.inspection_id,
	t1.party_group_id,
	p.name as partyGroupName,
	t1.category,
	t1.department_person_id,
	t1.type,
	t1.level,
	t2.inspect_time,
	t1.delay_description,
	case
		when it1.picture_document_id is not null then it1.picture_document_id
		else t1.document_id
	end as pictureDocumentId,
	ref5.data_name as levelName,
	t1.location,
	t1.cost,
	t1.origin,
	t1.due_date,
	t1.complete_date,
	t1.overdue_status,
	t1.status,
	ref3.data_name as statusName,
	t1.description,
	t1.document_id,
	t1.video_document_id,
	t1.org_id,
	ref.data_name as rectifyTypeName,
	t1.result,
	ref2.data_name as issueSource,
	relat.code as relationshipCode,
	pty1.name as departmentName,
	t1.unit_type,
	t1.rectification_require,
	t1.major_defect_flag,
	t1.level_num,
	t2.party_group_name as inspectedDepartName,
	t1.inspect_object,
	t1.inspect_object_category,
	case
		when t1.last_updated_time is not null then t1.last_updated_time
		else t1.created_time
	end as lastUpdatedTime,
	t2.superior_entry_flag,
	t2.superior_confirm_flag,
	t1.remark,
	loc.name as locationName,
	pty2.name as createdPerson,
	pty3.name as lastUpdatedPerson,
	t1.unique_code,
	t2.unique_code as inspectionCode,
	ref6.data_name as resultName,
	p2.name as superiorName,
	t1.superior_confirm_flag
from
	ins_issue t1
left join ins_inspection t2 on
	t2.id = t1.inspection_id
left join ins_inspection_issue is1 on
	is1.issue_id = t1.id
left join ins_inspection_item it1 on
	it1.id = is1.inspection_item_id
left join pty_party p on
	p.id = t1.party_group_id
left join pty_party p2 on
	p2.id = t2.superior
left join rsk_risk r on
	t2.business_key = r.id
	and t2.business_type = 'risk'
left join base_project base on
	t2.business_key = base.id
	and t2.business_type = 'project'
left join che_major_hazard c on
	t2.business_key = c.id
	and t2.business_type in ('hazardRisk', 'majorHazard')
left join pty_party pty on
	t2.business_key = pty.id
	and t2.business_type in ('company', 'department')
left join hc_warehouse wh on
	t2.business_key = wh.id
	and t2.business_type = 'chemicalWarehouse'
left join ope_special_operation op on
	t2.business_key = op.id
	and t2.business_type = 'operation'
left join company_info info on
	info.id = pty.id
left join ref_reference ref on
	ref.element_code = 'rectifyType'
	and t1.rectify_type = ref.data_code
left join ref_reference ref2 on
	ref2.element_code = 'checkCategory'
	and t2.check_category = ref2.data_code
left join pty_relationship relat on
	relat.party_id_from = t1.org_id
	and relat.role_type_from = 'company'
	and relat.relationship_type = 'organizational_structure'
left join pty_party pty1 on
	pty1.id = t1.org_id
left join ref_reference ref3 on
	ref3.element_code = 'issueStatus'
	and t1.status = ref3.data_code
left join ref_reference ref4 on
	ref4.element_code = 'issueCategory'
	and t1.type = ref4.data_code
left join ref_reference ref5 on
	ref5.element_code = 'issueLevel'
	and t1.level = ref5.data_code
left join ref_reference ref6 on
	ref6.element_code = 'checkResult'
	and t1.result = ref6.data_code
left join idm_user idm on
	idm.id = t1.created_by
left join pty_party pty2 on
	idm.person_id = pty2.id
left join idm_user idm1 on
	idm1.id = t1.last_updated_by
left join pty_party pty3 on
	idm1.person_id = pty3.id
left join dev_device t11 on
	t2.business_key = t11.id
	and t2.business_type in ('deviceInspection', 'fireDeviceInspection')
left join dev_device_category cate on
	cate.id = t11.category
left join dev_device_type typ on
	typ.id = t11.type
left join warn_warning_event t3 on
	t3.warning_code = 'issue_overdue'
	and t3.business_key = t1.id
	and t3.status = 'unclose'
left join ope_operation_location loc on
	loc.id = t1.location_id
left join ins_rectification rect on
	rect.issue_id = t1.id
left join pty_party pty4 on
	pty4.id = rect.rectification_person_id
left join (
	select
		t1.issue_id,
		case
			when t1.rectification_person_id is not null then t1.rectification_person_id
			when t1.approve_person_id is not null then t1.approve_person_id
			else t1.assignee
		end as alertPersonId
	from
		ins_rectification t1 ) t4 on
	t4.issue_id = t1.id
where
	exists(
	select
		1
	from
		( (
		select
			t1.id
		from
			ins_issue t1
		left join ins_inspection t2 on
			t2.id = t1.inspection_id
		left join pty_relationship relat on
			relat.party_id_from = t1.org_id
			and relat.role_type_from = 'company'
			and relat.relationship_type = 'organizational_structure'
		left join ins_issue_object obj1 on
			t1.id = obj1.issue_id
		where
			1 = 1
			and t1.status != 'draft'
			and t1.result != 'normal'
			and t1.status != 'beConfirmed'
			and t1.object_state = 'enabled'
			and (t2.object_state = 'enabled'
				or t1.external_code is not null)
-- 			and relat.code like '001010%'
-- 				and relat.status = 'enabled'
				and t1.org_id = 27009169
				and t1.status in ( 'submitted' , 'created','completed','resolved')
--                 and DATE_FORMAT(t2.inspect_time,'%Y-%m-%d') >= '2024-01-01'
--                 and DATE_FORMAT(t2.inspect_time,'%Y-%m-%d') <= '2024-12-31'
							and t1.level_num = 'four'
						order by
							t1.created_time desc ) )b
	where
		b.id = t1.id )
	and t1.object_state = 'enabled'
	and (t2.object_state = 'enabled'
		or t1.external_code is not null)
	and t1.level_num = 'four'
order by
	t1.created_time desc
;





-- 977000055
select * from ins_rectification t1
where t1.issue_id = 977000055
;






