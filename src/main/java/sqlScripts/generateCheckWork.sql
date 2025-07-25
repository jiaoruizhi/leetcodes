


select sp.work_status_name , sp.* from sche_plan sp 
where 1 = 1
and sp.event_status = "SMMS_VSL_WORKING"
and sp.org_id = 27009365
order by sp.id desc 
;

select * from pfm_work pw 
order by id desc
;

select * from ope_operation_location t1
where 1 = 1
and t1.org_id = 27009123
;



select
	t1.org_id,
	t2.direct_nam ,
	t1.*,
	t2.*
from
	tos_trigger_event t1
left join tos_trigger_event_dispatch t2 on
	t1.id = t2.trigger_event_id
where
	1 = 1
	and t1.generate_flag = 1
	and t1.status = "committed"
	and t1.vsl_name = "轩怡12"
-- 	and t1.id = 42000031
-- 	and t2.send_beg_tim is not null
-- 	and t2.send_end_tim is not null
-- 	and t2.send_beg_tim <= NOW()
-- 	and t2.send_end_tim >= NOW()
group by
	t1.id
;
	-- 89
select *
from tos_trigger_event t1
where 1 = 1
-- and t1.vsl_name = "信义玻璃1-2"
order by id desc
;

select
	t1.org_id,
	t1.*
from
	tos_trigger_event t1
where
	1 = 1
-- 	and t1.generate_flag = 1
	and t1.status = "committed"
	and t1.vsl_name = "宏翔669"
	and t1.berth = "过1#"
	and t1.flight = "240807"
group by
	t1.id
order by t1.id desc
;



select * from tos_trigger_event_dispatch t1
where 1 = 1
order by t1.id desc
-- and trigger_event_id = 91


select * from tos_trigger_event_dispatch t1
where 1 = 1
and t1.trigger_event_id = 42000031








select * from sche_plan_association t1
order by t1.id desc


describe dev_inspection ;

