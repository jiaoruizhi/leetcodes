


select
	t1.business_type , sf.status, *
from
	(
	select
		art.*
	from
		ACT_RU_TASK art
	left join ACT_RU_IDENTITYLINK t2 on
		art.ID_ = t2.TASK_ID_
        ) act
left join sf_task_instance sf on
	sf.task_code = act.ID_
	and sf.pro_instance_id = act.PROC_INST_ID_
left join work_center t1 on
	sf.business_key = t1.business_key
	and sf.business_type = t1.business_type
where
	1 = 1
	and t1.org_id = 27009418
	and sf.status = 'approving'
	and t1.business_type = 'periodicInspection'
	;
	
	
	
	
	select t1.form_key, t1.* from sf_task_instance t1
	where 1 = 1
-- 	and t1.pro_instance_id = '888dd4d4-91b1-11ef-8522-0255c0a8443c'
		and t1.org_id = 27009418
		order by id desc

	
	
	
	
	