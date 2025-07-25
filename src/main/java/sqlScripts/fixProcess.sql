-- 27062081
select * from pty_party where name = '蒙斌';


-- 修复无头流程脚本

select wc.proc_instance_id, wc.* from work_center wc where wc.business_key = 61000001;
select * from pty_party where id = 735000216;


-- add task user id
-- 27061943
-- 
-- 13307673186
select
	t1.task_user_id ,
	t1.pro_instance_id ,
	t1.business_key ,
	t1.*
from
	sf_task_instance t1
where
	1 = 1
-- 	and t1.task_name = "分管安全副经理"
-- 	and t1.business_type = "relatedSafety"
	and t1.business_key in (
1118000042
)
-- 	and t1.task_user_id = 27064563
-- 	and t1.business_type = "specialHot"
-- 	and t1.pro_instance_id = "460c6a79-c1a8-11ef-afa3-0255c0a8443c"
-- 	and t1.org_id = 27009237
	and t1.status = 'approving'
	order by t1.id asc
;



-- add assignee_
-- 27061943
select t1.ASSIGNEE_, t1.* from act_ru_task t1
where 1 = 1
and t1.PROC_INST_ID_  in (
'52cbadab-5885-11f0-a172-0255c0a8443c'
)
;




-- 代办
select wc.* from work_center wc
left join act_ru_task art on wc.proc_instance_id = art.PROC_INST_ID_
where 1 = 1
and wc.business_key = 4368
-- and wc.proc_instance_id = "528d64e2-c28d-11ef-9c69-0255c0a8443c"
order by wc.created_time desc



-- ACT_RU_IDENTITYLINK

select t1.USER_ID_, t1.* from ACT_RU_IDENTITYLINK t1
where 1 = 1
and t1.TASK_ID_ in (
'65111256-42a5-11f0-87ac-0255c0a8443c'
)
;






