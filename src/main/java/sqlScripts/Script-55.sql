select
	t1.id,
		device_item_info.device_item_id,
t1.name,
	t1.type,
	t1.business_key,
	t1.business_type,
	t1.releaser,
	t1.release_date,
	t1.status,
	t1.org_id,
	act.ID_ as taskId,
	t2.name as assignerName,
	t3.data_name as typeName,
	t1.due_date,
	t4.name as releaserName,
	t1.proc_instance_id,
	sf.task_name as taskName,
	device_item_info.device_item_id,
	sf.form_key as formKey,
	t1.check_category,
	t5.issue_jituan_id,
	t5.issue_jituan_name
from
	(
	select
		t1.*
	from
		ACT_RU_TASK t1
	left join ACT_RU_IDENTITYLINK t2 on
		t1.ID_ = t2.TASK_ID_
	where
		t1.ASSIGNEE_ = 27064550
		or (( t1.ASSIGNEE_ is null
			or t1.ASSIGNEE_ = '' )
		and ( t2.USER_ID_ = 27064550))) act
left join sf_task_instance sf on
	sf.task_code = act.ID_
	and sf.pro_instance_id = act.PROC_INST_ID_
left join work_center t1 on
	sf.business_key = t1.business_key
	and sf.business_type = t1.business_type
left join pty_party t2 on
	t2.id = t1.assigner
left join pty_party t4 on
	t4.id = t1.releaser
left join ref_reference t3 on
	t3.element_code = 'workType'
	and t3.data_code = t1.type
left join ins_issue t5 on
	t5.id = t1.business_key
	and t1.business_type = 'issue'
left join (
	select
		pw.id,
		ddi.id as device_item_id
	from
		(
		select
			*
		from
			pfm_work pi
		where
			pi.business_type = 'periodicInspection'
			and pi.type = 'periodicInspection' ) pw
	left join (
		select
			*
		from
			dev_device_item
		where
			id = 214
			and responsible_person_id = 27064550
			) ddi on
		pw.business_key = ddi.parent_area_id ) device_item_info on
	device_item_info.id = t1.business_key
left join pty_relationship relat on
	relat.party_id_from = t1.org_id
	and relat.role_type_from = 'company'
	and relat.relationship_type = 'organizational_structure'
where
	1 = 1
	and t1.type != 'responsibility'
	and t1.object_state = 'enabled'
	and device_item_info.device_item_id = 214
group by
	t1.id
order by
	t1.id desc 
	
	select * from pfm_work t1
	where t1.id = 1793447
	
	select * from dev_device_item t1
-- 	where t1.area_id = 25
