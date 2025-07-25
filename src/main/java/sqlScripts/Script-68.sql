select
	t1.id,
	t1.frequency,
	t1.frequency_time,
	t1.frequency_unit,
	t1.frequency_number,
	t1.holiday_flag,
	t1.receive_way,
	t1.department_id,
	t1.post_id,
	t1.person_id,
	t1.ahead_start_minute,
	t1.ahead_end_minute,
	t1.plan_start_date,
	t1.plan_finish_date,
	t1.status,
	t1.previous_time,
	t1.business_type,
	t1.form_flag,
	t1.form_id,
	t1.document_id,
	t1.pic_document_id,
	t1.org_id,
	relat.code as relationshipCode,
	t1.classes_id,
	cla.classes as classesName,
	pty1.name as personName,
	roles.name as postName,
	t1.event_status,
	ref1.data_name as eventStatusName,
	ins.name as formName,
	ct.name as cargoTypeName,
	t1.cargo_type_id,
	t1.description,
	t1.line,
	t1.business_key,
	t1.plan_start_time,
	t1.start_way,
	t1.random_number,
	region.name as regionName,
	ref2.data_name as typeName,
	ref3.data_name as receiveWayName,
	t1.name,
	ref4.data_name as lineName,
	t1.special_patrol_category,
	ref5.data_name as specialPatrolCategoryName,
	t1.object_type,
	t1.type,
	t1.plan_end_time,
	pty2.name as groupName,
	t1.photo_way,
	t1.combined_inspections_flag,
	t1.work_status_name,
	t1.plan_type
from
	sche_plan t1
left join pty_relationship relat on
	relat.party_id_from = t1.org_id
	and relat.role_type_from = 'company'
	and relat.object_state = 'enabled'
left join sch_scheduling_classes cla on
	cla.id = t1.classes_id
left join pty_party pty1 on
	pty1.id = t1.person_id
left join pty_role_type roles on
	t1.post_id = roles.id
left join ins_checkform ins on
	ins.id = t1.form_id
left join tos_cargo_type ct on
	ct.id = t1.cargo_type_id
	and t1.type = 'trigger'
left join ref_reference ref1 on
	ref1.element_code = 'tosTriggerEventPlanTrends'
	and ref1.data_code = t1.event_status
left join ref_reference ref2 on
	ref2.element_code = 'patrolPlanType'
	and ref2.data_code = t1.type
	and t1.business_type = 'patrol'
left join ref_reference ref3 on
	ref3.element_code = 'planReceiveWay'
	and ref3.data_code = t1.receive_way
	and t1.business_type = 'patrol'
left join ref_reference ref4 on
	ref4.element_code = 'patrolLine'
	and ref4.data_code = t1.line
	and t1.business_type = 'patrol'
left join ref_reference ref5 on
	ref5.element_code = 'specialPatrolCategory'
	and ref5.data_code = t1.special_patrol_category
	and t1.business_type = 'patrol'
left join ope_operation_region region on
	region.id = t1.business_key
	and t1.business_type = 'patrol'
	and (t1.type = 'trigger'
		or t1.type = 'cycle' )
	-- left join ope_operation_region_type ope on ope.id =region.type 
left join pty_party pty2 on
	pty2.id = region.department_id
left join pty_person_contact con on
	con.business_key = t1.id
	and con.business_type = 'patrolPersonPlan'
left join pty_party pty3 on
	pty3.id = con.person_id
where
	1 = 1
	and t1.org_id = 27009365
	and t1.type like "%trigger%"
	and DATE_FORMAT(t1.plan_start_date, '%Y-%m-%d') <= "2024-08-13"
	and DATE_FORMAT(t1.plan_finish_date, '%Y-%m-%d') >= "2024-08-13"
	and t1.event_status like "%SMMS_VSL_DEPARTURE%"
	and t1.status = true
-- 	and t1.business_type like "%operationInspection%"
group by
	t1.id
order by
	t1.id desc 
	;
==> Parameters: 27009365(long),
	trigger(String),
	2024-08-13(String),
	2024-08-13(String),
	SMMS_VSL_DEPARTURE(String),
	true(Boolean),
	operationInspection(String)