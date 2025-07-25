


select t1.* from work_center t1
where 1 = 1
-- and t1.name like '%整改%'
and t1.type like '%%'
order by t1.id desc


select* from tsk_task_assign_instance t1
order by t1.id desc




select * from ctr_invitation t1
where 1 = 1
and t1.org_id = 27009517