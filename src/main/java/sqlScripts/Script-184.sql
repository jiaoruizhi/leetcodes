select party_group_id ,* from pfm_work where id = 1152000024



select
	*
from
	sf_task_instance t1
where
	1 = 1
-- 	and t1.task_name = "分管安全副经理"
-- 	and t1.business_type = "relatedSafety"
	and t1.business_key in (1152000024)
-- 	and t1.task_user_id = 27064563
-- 	and t1.business_type = "specialHot"
	
	
	select * from ope_special_operation t1
	where t1.id = 689000001