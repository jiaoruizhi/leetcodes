


select
	t1.id,
	t1.plan_id,
	t1.name,
	t1.type,
	dev1.name as deviceName,
	t1.business_key,
	t1.business_type,
	t1.party_group_id,
	t1.due_status,
	p2.name as partyGroupName,
	t1.assigner_person,
	t1.complete_person,
	p1.name as completePersonName,
	t1.start_time,
	t1.due_time,
	t1.complete_time,
	t1.status,
	t1.delay_flag,
	t2.data_name as statusName,
	t1.remark,
	t1.org_id,
	t1.frequency,
	t1.plan_start_time,
	t1.plan_end_time,
	t1.description,
	t1.post_id,
	t1.classes_id,
	tr.flight,
	tr.vsl_name,
	tr.start_time as berthingTime,
	tr.end_time as unberthingTime,
    ifnull(t1.event_status_name, ref3.data_name) as eventStatusName,
	relat.code as relationshipCode,
	relat.status as relationshipStatus,
	pty5.name as departmentName,
	t5.name as vehicleType,
	t5.car_number,
	t5.tonnage,
	t5.certificate,
	t5.producer,
	t5.model,
	t5.brand,
	dev1.id as device_id,
	f.name as formName,
	pla.plan_name as planName,
	p4.name as assignerPersonName,
	cate.name as deviceCategoryName,
	cate.classify as classify,
	typ.name as deviceTypeName,
	dev1.id as device,
	IFNULL(t1.last_updated_time, t1.created_time) as lastUpdatedTime,
	t1.created_time,
	t7.id as inspectionId,
	t7.inspect_time,
	t1.form_id,
	region.name as regionName,
	lo.name as locationName,
	t1.work_code,
	pty6.name as postName,
	sch.classes as classesName,
	t1.receive_manner,
	t1.receive_time,
	t1.review_id,
	pty7.name as reviewName,
	t1.review_time,
	t1.cancel_id,
	t1.cancel_time,
	pty8.name as cancelName,
	t1.combined_inspections_flag,
	ref1.data_name as typeName,
	ref2.data_name as receiveMannerName,
	t1.teams_id,
	teams.name as teamName,
-- 	work.proc_instance_id as procInstanceId,
-- 	work.business_type as taskBusinessType,
-- 	work.task_id as taskId,
	sft.task_name as taskName,
	sft.task_user_id as taskUserId,
	act.actUserId,
	sft.form_key as formKey,
	t1.location,
	t1.approve_routes,
	t7.result,
	t4.principle_id
from
	pfm_work t1
left join work_center work on
	work.business_key = t1.id
	and work.business_type in
        ('ope_inspection_work', 'trigger_inspection_work', 'patrol_special_inspection_work', 'patrol_temporary_inspection_work', 'specialOperationPatrol', 'periodicInspection')
	and work.object_state = 'enabled'
left join (
select
stii.*, 
group_concat(distinct stii.task_user_id) as taskUserId
from SF_TASK_INSTANCE stii
) sft on
	sft.business_key = t1.id
	and sft.business_type in
        ('ope_inspection_work', 'trigger_inspection_work', 'patrol_special_inspection_work', 'patrol_temporary_inspection_work', 'specialOperationPatrol', 'periodicInspection')
	and sft.status = 'approving'
left join (
select arii.*, group_concat(distinct arii.USER_ID_) as actUserId from ACT_RU_IDENTITYLINK arii
) act on
	sft.task_code = act.TASK_ID_
left join pty_party p1 on
	p1.id = t1.complete_person
	and p1.type = 'person'
left join pty_party p4 on
	p4.id = t1.assigner_person
	and p4.type = 'person'
left join pty_party p2 on
	p2.id = t1.party_group_id
	and p2.type = 'department'
left join ref_reference t2 on
	t2.data_code = t1.status
	and t2.element_code = 'work_status'
left join ref_reference ref1 on
	ref1.data_code = t1.type
	and ref1.element_code = 'work_type'
left join ref_reference ref2 on
	ref2.data_code = t1.receive_manner
	and ref2.element_code = 'work_receive_manner'
left join pty_relationship relat on
	relat.party_id_from = t1.org_id
	and relat.role_type_from = 'company'
	and relat.relationship_type = 'organizational_structure'
left join pty_party pty5 on
	t1.org_id = pty5.id
left join hc_vehicle_check_plan t4 on
	t4.business_key = t1.business_key
	and t1.business_type = 'vehicleCheck'
	and t1.type = t4.business_type
left join hc_vehicle t5 on
	t5.id = t4.vehicle_id
left join dev_device_check_plan pla on
	pla.id = t1.plan_id
	and t1.business_type in
        ('deviceInspection', 'fireDeviceInspection')
left join dev_device dev1 on
	dev1.id = t1.business_key
	and t1.business_type in
        ('deviceInspection', 'fireDeviceInspection')
left join ope_operation_region region on
	region.id = t1.business_key
	and t1.business_type in
        ('operationInspection', 'patrol')
left join ope_operation_location lo on
	lo.id = t1.location_id
left join sch_scheduling_teams teams on
	teams.id = t1.teams_id
left join tos_trigger_event tr on
	tr.id = t1.trigger_event_id
left join ref_reference ref3 on
	ref3.data_code = tr.trends
	and ref3.element_code = 'tosTriggerEventTrends'
left join dev_device_category cate on
	cate.id = dev1.category
left join dev_device_type typ on
	typ.id = dev1.type
left join ins_inspection t7 on
	t7.work_id = t1.id
left join ins_checkform f on
	t1.form_id = f.id
left join pty_role_type pty6 on
	pty6.id = t1.post_id
left join sch_scheduling_classes sch on
	sch.id = t1.classes_id
left join pty_party pty7 on
	pty7.id = t1.review_id
	and pty7.type = 'person'
left join pty_party pty8 on
	pty8.id = t1.cancel_id
	and pty7.type = 'person'


	
       
       select count(*) from work_center
       
       
       
-- --------
select
	*
from
	pfm_work t1
left join SF_TASK_INSTANCE sft on
	sft.business_key = t1.id
	and sft.business_type in
        ('ope_inspection_work', 'trigger_inspection_work', 'patrol_special_inspection_work', 'patrol_temporary_inspection_work', 'specialOperationPatrol', 'periodicInspection')
	and sft.status = 'approving'
        