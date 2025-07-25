



select * from tsk_task_assign t1
where t1.id = 346000009;



select t2.name, t1.* from tsk_task_assign_instance t1
left join pty_party t2 on t2.id = t1.receiver
where t1.task_id = 346000009