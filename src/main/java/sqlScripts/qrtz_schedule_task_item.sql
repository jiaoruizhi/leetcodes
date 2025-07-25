



-- qrtz_schedule_task_item
-- 定时器执行记录

select * from qrtz_schedule_task_item t1
where 1 = 1
-- and t1.name like "%tosTriggerEventWorkJob%"
order by t1.id desc



select * from ins_inspection_item t1
where 1 = 1
order by t1.id desc
;

select * from sche_plan where id = 127

select * from sche_plan_association where plan_id = 127
