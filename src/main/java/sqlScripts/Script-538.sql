



select t1.cancel_id, t1.cancel_time, t1.* from pfm_work t1 
where 1 = 1
and t1.cancel_time is not null
order by t1.id desc



select * from ope_safety_measure t1
where 1 = 1
and t1.id = 2057;