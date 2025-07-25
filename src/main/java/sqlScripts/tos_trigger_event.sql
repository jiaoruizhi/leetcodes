


-- tos_trigger_event



select t1.cargo_txt, t1.* from tos_trigger_event t1
where 1 = 1
-- and t1.trends = "SMMS_VSL_WORKING"
-- and t1.org_id = 27009365
and t1.vsl_name = "昌汇6"
order by t1.id desc
;


select * from tos_trigger_event_dispatch t1
-- where t1.trigger_event_id = 178
order by t1.id desc
;


select* from pfm_work t1
order by t1.created_time desc