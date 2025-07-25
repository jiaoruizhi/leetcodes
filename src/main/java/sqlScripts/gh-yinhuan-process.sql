




select t1.unique_code, t1.description, t1.id,
t1.complete_date ,
t1.status ,
t1.overdue_status ,
t1.* from ins_issue t1
left join sf_task_instance t2 on t1.id = t2.business_key 
where 1 = 1
-- and t1.overdue_status = 'overdue'
and t1.status in ("submitted", "created")
and t2.id is null
and t1.data_source is null
;

