select * from ins_inspection t1
where 1 = 1
order by t1.id desc



select * from dev_device t1
where 1 = 1
order by t1.id desc

select * from dev_device t1
where 1 = 1
order by t1.id desc


select * from ins_inspection t1
where 1 = 1
-- group by t1.status
order by t1.id desc

select t1.id, dev.name 
from dev_device t1
right join dev_device_category dev on dev.id = t1.category
where dev.classify = 'specialDevice' and hierarchy = 2
-- and dev.org_id = 679001551
;

select * from dev_device_category t1
where t1.classify = 'specialDevice'


select * from ins_rectification t1




