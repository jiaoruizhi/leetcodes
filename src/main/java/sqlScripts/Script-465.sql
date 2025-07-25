



-- 修复无头流程脚本

select t1.status, t1.* from ins_issue t1
where t1.unique_code = 'ISS00013132';

select wc.proc_instance_id, wc.* from 
work_center wc
where wc.business_key = 980000030;

-- 27064403
-- add task user id
-- 937000038 , 937000039
-- 50000001
-- 27062080
-- 
-- 13307673186
select
	*
from
	sf_task_instance t1
where
	1 = 1
-- 	and t1.task_name = "分管安全副经理"
-- 	and t1.business_type = "relatedSafety"
	and t1.business_key in (980000030)
-- 	and t1.task_user_id = 27064563
-- 	and t1.business_type = "specialHot"
-- 	and t1.pro_instance_id = "6a9b99c9-9743-11ef-9613-0255c0a8443c"
-- 	and t1.org_id = 27009237
-- 	and t1.status = 'approving'
	order by t1.id desc
;

