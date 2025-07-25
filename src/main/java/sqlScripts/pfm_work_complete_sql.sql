select
	*
from
	(
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
		if(t1.event_status_name is null
		or t1.event_status_name = '',
		ref3.data_name,
		t1.event_status_name) as eventStatusName,
		relat.code as relationshipCode,
		pty5.name as departmentName,
		t5.name as vehicleType,
		t5.car_number,
		t5.tonnage,
		t5.certificate,
		t5.producer,
		t5.model,
		t5.brand,
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
		work.proc_instance_id as procInstanceId,
		work.business_type as taskBusinessType,
		work.task_id as taskId,
		sft.task_name as taskName,
		group_concat(distinct sft.task_user_id) as taskUserId,
		group_concat(distinct act.USER_ID_) as actUserId,
		sft.form_key as formKey,
		t1.location,
		t1.approve_routes ,
		t6.ahead_days
	from
		(
		select
			*
		from
			pfm_work pw ) t1
	left join work_center work on
		work.business_key = t1.id
		and work.business_type in ('ope_inspection_work', 'trigger_inspection_work', 'patrol_special_inspection_work', 'patrol_temporary_inspection_work', 'specialOperationPatrol')
		and work.object_state = 'enabled'
	left join SF_TASK_INSTANCE sft on
		sft.business_key = t1.id
		and sft.business_type in ('ope_inspection_work', 'trigger_inspection_work', 'patrol_special_inspection_work', 'patrol_temporary_inspection_work', 'specialOperationPatrol')
		and sft.status = 'approving'
	left join ACT_RU_IDENTITYLINK act on
		sft.task_code = act.TASK_ID_
	left join pty_party p1 on
		p1.id = t1.complete_person
		and p1.name like CONCAT('%', 'completePersonName_0d2ffcd5e699', '%')
	left join pty_party p4 on
		p4.id = t1.assigner_person
	left join pty_party p2 on
		p2.id = t1.party_group_id
		and p2.name like CONCAT('%','partyGroupName_4474b9b14866', '%')
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
		and t1.business_type in ('deviceInspection', 'fireDeviceInspection')
	left join dev_device dev1 on
		dev1.id = t1.business_key
		and t1.business_type in ('deviceInspection', 'fireDeviceInspection')
		and dev1.name like CONCAT('%', 'deviceName_9c95b0a4c64e', '%')
	left join ope_operation_region region on
		region.id = t1.business_key
		and t1.business_type in ('operationInspection', 'patrol')
	left join ope_operation_location lo on
		lo.id = t1.location_id
		and lo.name like CONCAT('%', 'locationName_900098fe9dc7', '%')
	left join sch_scheduling_teams teams on
		teams.id = t1.teams_id
		and teams.name like CONCAT('%', 'teamName_37bd0d8621fa', '%')
	left join tos_trigger_event tr on
		tr.id = t1.trigger_event_id
		and tr.vsl_name like CONCAT('%', 'vslName_ef4a04e72a04', '%')
		and tr.flight like CONCAT('%', 'flight_96c38c302352', '%')
	left join ref_reference ref3 on
		ref3.data_code = tr.trends
		and ref3.element_code = 'tosTriggerEventTrends'
	left join dev_device_category cate on
		cate.id = dev1.category
		and cate.id = (0)
		and cate.classify in ('classifys_0c722dc47d2c')
	left join dev_device_type typ on
		typ.id = dev1.type
		and typ.id = 453
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
	left join pty_party pty8 on
		pty8.id = t1.cancel_id
	left join pfm_work_person_relation t3 on
		t3.work_id = t1.id
		and t3.assigner_person = 0
	left join warn_warning_rule t6 on
		t6.org_id = t1.org_id
		and t6.warning_code = 'warningDefinition_6c79171644cd'
		and t6.object_state = 'enabled'
	where
		1 = 1
		and (p4.name like CONCAT('%', 'assignerPersonName_0ce63f1cc4f4', '%')
			or t1.id in (0) )
		and ((ref3.data_name like CONCAT('%', 'eventStatusName_36da973dd220', '%')
			and t1.event_status_name is null)
		or (t1.event_status_name like CONCAT('%', 'eventStatusName_36da973dd220', '%')))
	group by
		t1.id ) t11
where
	1 = 1
	and 3 = 3
	and t11.status = 'statusName_36da973dd220'
	and t11.remark like CONCAT('%', 'remark_8630ef1bf80a', '%')
	and t11.status in ('statusList_c69093a5494d')
	and t11.due_status like CONCAT('%', 'dueStatus_da957b033fbf', '%')
	and t11.business_type like CONCAT('%', '123', '%')
	and t11.type in (123)
	and t11.party_group_id = 123
	and t11.org_id in (123)
	and t11.business_type in (123)
	and t11.post_id = 123
	and t11.classes_id = 123
	and t11.work_code like CONCAT('%', '123', '%')
	and t11.plan_id = 123
	and (t11.due_status is null
		or t11.due_status != 'overdue')
	and t11.type like CONCAT('%', '123', '%')
	and t11.name like CONCAT('%', '456', '%')
	and t11.type like CONCAT('%', '789', '%')
	and DATE_FORMAT(t11.created_time, '%Y-%m-%d') >= DATE_FORMAT('2021-09-10', '%Y-%m-%d')
	and DATE_FORMAT(t11.created_time, '%Y-%m-%d') <= DATE_FORMAT('2022-09-10', '%Y-%m-%d')
	and DATE_FORMAT(t11.created_time, '%Y-%m-%d') >= DATE_FORMAT('2023-09-10', '%Y-%m-%d')
	and DATE_FORMAT(t11.created_time, '%Y-%m-%d') <= DATE_FORMAT('2024-09-10', '%Y-%m-%d')
	and DATE_FORMAT(t11.due_time, '%Y-%m-%d') >= DATE_FORMAT('2023-09-10', '%Y-%m-%d')
	and DATE_FORMAT(t11.due_time, '%Y-%m-%d') <= DATE_FORMAT('2024-09-10', '%Y-%m-%d')
	and t11.complete_person = 21353451234
	and DATE_FORMAT(t11.start_time, '%Y-%m-%d') >= DATE_FORMAT('2021-09-10', '%Y-%m-%d')
	and DATE_FORMAT(t11.start_time, '%Y-%m-%d') <= DATE_FORMAT('2024-09-10', '%Y-%m-%d')
	and DATE_FORMAT(t11.due_time, '%Y-%m-%d') >= DATE_FORMAT('2021-09-10', '%Y-%m-%d')
	and DATE_FORMAT(t11.due_time, '%Y-%m-%d') <= DATE_FORMAT('2025-09-10', '%Y-%m-%d')
	and DATE_FORMAT(t11.complete_time, '%Y-%m-%d') >= DATE_FORMAT('2021-09-10', '%Y-%m-%d')
	and DATE_FORMAT(t11.complete_time, '%Y-%m-%d') <= DATE_FORMAT('2024-09-10', '%Y-%m-%d')
order by
	t11.id desc
	
	