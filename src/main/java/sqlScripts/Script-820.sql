





select * from dev_device_category t1
where 1 = 1
and t1.name = '消防设备'
and t1.classify in ('otherDevice')


select * from pty_party where id = 40003153



select t1.status, t1 .* from ins_issue t1
where 1 = 1
and t1.id = 1063000085



select * from sf_task_instance t1
where 1 = 1
and t1.business_key = 1063000085



select * from work_center t1
where 1 = 1
and t1.business_key = 1063000085



