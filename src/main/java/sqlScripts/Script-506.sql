




select t1.trigger_event_id, t1.* from pfm_work t1
where work_code in ('007851', '007852');


select * from tos_trigger_event t1
where id in (200000025,200000026
);


select t1.id from tos_trigger_event t1
where 1 = 1
and t1.id != 200000026 and t1.berth_id = 1000092 and t1.vsl_name = '徽荣启航' and t1.flight = '241212/241211' and t1.trends = 'SMMS_VSL_DEPARTURE' and t1.cancel_flag = null; 
==> Parameters: 248(Long), 1000003(Long), 测试船只-1209-0001(String), 2412090001(String), SMMS_VSL_WORKING(String), null