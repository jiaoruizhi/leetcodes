






-- 4302



select * from work_center t1
where t1.business_key = 4302




select
	t1.business_key ,
	t1.*
from
	sf_task_instance t1
where
	1 = 1
-- 	and t1.task_name = "分管安全副经理"
-- 	and t1.business_type = "relatedSafety"
	and t1.business_key in (
4302
)
-- 	and t1.task_user_id = 27064563
-- 	and t1.business_type = "specialHot"
-- 	and t1.pro_instance_id = "460c6a79-c1a8-11ef-afa3-0255c0a8443c"
-- 	and t1.org_id = 27009237
-- 	and t1.status = 'approving'
	order by t1.id asc
;

select t1.ASSIGNEE_, t1.* from act_ru_task t1
where 1 = 1
and t1.PROC_INST_ID_  in (
'613c67e3-19e1-11f0-aeab-0242ac110003'
);




-- ACT_RU_IDENTITYLINK

select t2.name, t1.USER_ID_, t1.* from ACT_RU_IDENTITYLINK t1
left join pty_party t2 on t1.USER_ID_ = t2.id
where 1 = 1
and t1.TASK_ID_ in (
'ace17d46-19e1-11f0-aeab-0242ac110003'
)
;



