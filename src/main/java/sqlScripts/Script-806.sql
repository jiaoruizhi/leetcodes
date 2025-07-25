
select * from dev_device t1
where t1.code like 'HGL-142-%'



update dev_device t1
set t1.object_state = 'enabled'
where t1.code like 'HGL-142-%'