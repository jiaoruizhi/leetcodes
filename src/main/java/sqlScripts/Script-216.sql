

select t1.type, t1.* from dev_device_check_plan t1
where t1.id = 51000003

select t1.name, t1.* from pfm_work t1
where t1.id = 1161000901



select * from work_center t1
where 1= 1 
and  t1.assigner = "27061761"
-- and t1.org_id = 27009123

select * from pty_party pp 
where 1= 1
and pp.id = "27061761"