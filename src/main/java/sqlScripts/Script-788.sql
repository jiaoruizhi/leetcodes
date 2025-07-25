


-- government external


select t1.previous_time , t1 .* from dev_device_item t1
where 1 = 1
and t1.org_id = 27009365
-- and t1.status = 'disabled'
and t1.phone = '13636597750'



select * from pty_role_type t1
where t1.org_id = 27009015
and t1.name ='部门负责人'