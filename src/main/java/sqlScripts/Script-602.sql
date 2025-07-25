



select * from pfm_work t1
where t1.work_code = '11876';



select
	t1.business_key ,
	t1.*
from
	sf_task_instance t1
where
	1 = 1
-- 	and t1.task_name = "分管安全副经理"
-- 	and t1.business_type = "relatedSafety"
	and t1.business_key in (1349)
-- 	and t1.task_user_id = 27064563
-- 	and t1.business_type = "specialHot"
-- 	and t1.pro_instance_id = "460c6a79-c1a8-11ef-afa3-0255c0a8443c"
-- 	and t1.org_id = 27009237
-- 	and t1.status = 'approving'
	order by t1.id asc
;




-- add assignee_
select t1.ASSIGNEE_, t1.* from act_ru_task t1
where 1 = 1
and t1.PROC_INST_ID_  in (
'1117e236-cef2-11ef-8f56-0242ac110003'
)



select * from pfm_work t1
where t1.work_code = '11858';
-- 代办
select wc.* from work_center wc
left join act_ru_task art on wc.proc_instance_id = art.PROC_INST_ID_
where 1 = 1
and wc.business_key = 1349
-- and wc.proc_instance_id = "528d64e2-c28d-11ef-9c69-0255c0a8443c"
order by wc.created_time desc



-- ACT_RU_IDENTITYLINK

select t1.* from ACT_RU_IDENTITYLINK t1
where 1 = 1
and t1.TASK_ID_ in (
'22692c34-cef2-11ef-8f56-0242ac110003'
)
;


-- 蔡丁	18289745652	27064409
-- 蔡秉峻	18189848226	27061479
