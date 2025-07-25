




select t1.plan_end_time , t1.start_time , t1.end_time , t1.* from tos_trigger_event t1
where 1 = 1
and t1.org_id = 27009123
order by t1.id desc