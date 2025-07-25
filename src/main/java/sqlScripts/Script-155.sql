select struct_code, t1.id, t2.name from pty_group t1
left join pty_party t2 on  t2.id = t1.id
where 1 = 1
and t1.struct_code = 10000000
-- and t1.id = 27009123


select * from tsk_task_assign t1
order by t1.id desc


select t1.status from dev_device t1
where 1 = 1
-- and t1.id = 1142000022
group by t1.status
order by t1.id desc



select * from video_alarm t1
order by t1.id desc

select * from ins_inspection t1
order by t1.id desc

select 
t3.* 
from ins_issue t1
left join ins_inspection t2 on t1.inspection_id = t2.id
left join pfm_work t3 on t2.work_id = t3.id
where 1 = 1
and t3.id is not null
order by t3.id desc