

select t1.previous_time, t1.* from tos_trigger_event t1
where 1 = 1
and t1.org_id = 27009365
order by t1.id desc
;

select t1.previous_time, t1.* from sche_plan_association t1
where 1 = 1
and t1.business_key = 219;



select t1.complete_time, t1.* from pfm_work t1
where 1= 1
and t1.trigger_event_id = 219




select t1.previous_time, t1.* from sche_plan t1
where 1 = 1
and t1.id = 127
;


select * from hel_punish_record t1


select t1.id ,t2.description, t2.id from hel_violation_record t1
left join hel_punish_record t2 on  t1.id = t2.description 
-- where t1.id = 101;


