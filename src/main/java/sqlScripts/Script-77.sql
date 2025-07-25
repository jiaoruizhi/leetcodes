select
	count(*)
from
	(
	select
		count(*)
	from
		pfm_work t1
	left join work_center work on
		work.business_key = t1.id
		and work.business_type in ('ope_inspection_work', 'trigger_inspection_work', 'patrol_special_inspection_work', 'patrol_temporary_inspection_work', 'specialOperationPatrol', 'periodicInspection')
		and work.object_state = 'enabled'
	left join SF_TASK_INSTANCE sft on
		sft.business_key = t1.id
		and sft.business_type in ('ope_inspection_work', 'trigger_inspection_work', 'patrol_special_inspection_work', 'patrol_temporary_inspection_work', 'specialOperationPatrol', 'periodicInspection')
		and sft.status = 'approving'
	left join ACT_RU_IDENTITYLINK act on
		sft.task_code = act.TASK_ID_
	left join pty_party p1 on
		p1.id = t1.complete_person
	left join pty_party p4 on
		p4.id = t1.assigner_person
	left join pty_party p2 on
		p2.id = t1.party_group_id
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
	left join ope_operation_region region on
		region.id = t1.business_key
		and t1.business_type in ('operationInspection', 'patrol')
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
	left join pty_party pty8 on
		pty8.id = t1.cancel_id
	where
		1 = 1
		and t1.business_type = "operationInspection"
	group by
		t1.id ) a