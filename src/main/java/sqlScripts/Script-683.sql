
select * from pro_deployment t1
where t1.id = 1276


select t1.* from pty_party t1 where 1 = 1
and t1.name = '焦锐志'
;

-- 607001639

select * from ins_issue t1 order by t1.id desc


select * from tsk_task_assign t1
order by t1.id desc

select * from tsk_task_assign_instance t1
order by t1.id desc


select t1.status, t1.* from work_center t1
where 1 = 1
-- and t1.`type` = 'fileNotification'
order by t1.id desc
 