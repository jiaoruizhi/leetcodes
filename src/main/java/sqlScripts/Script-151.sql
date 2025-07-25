


-- 修复无头流程脚本

-- 27064563
-- 
-- 27064538
-- add task user id
select
	*
from
	sf_task_instance t1
where
	1 = 1
-- 	and t1.task_name = "检查组组长"
	and t1.business_key in (887000031)
-- 	and t1.business_type = "specialHot"
;

update sf_task_instance t1 set t1.task_user_id = 27061754 where t1.id = 887000031


-- add assignee_
select * from act_ru_task t1
where 1 = 1
and PROC_INST_ID_  = "76730d3e-4418-11ef-a238-0255c0a8445e"



-- 代办
select art.* from work_center wc
left join act_ru_task art on wc.proc_instance_id = art.PROC_INST_ID_
where 1 = 1
-- and wc.business_key = 887000031
-- and wc.task_id = "0340b101-47d2-11ef-b1b2-0255c0a8445e"
order by wc.created_time desc






