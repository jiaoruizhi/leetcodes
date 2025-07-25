

-- dev_device_category
-- 100000003 100000002
select * from dev_device_category t1
where t1.id in (100000003, 100000002, 8016618);


select t2.id, t2.name, t1.* from dev_device t1
left join dev_device_category t2 on t2.id = t1.category 
where t1.id in (
select t2.ganghang_id from dev_device_zy_copy t2
)
and t2.id in (100000003, 100000002);
;

select * from dev_device t1
where t1.code = 'GJGWB00001'





select t1.id from dev_device_zy_copy t1 where t1.ganghang_id is null;


select t1.code from dev_device_zy_copy t1 where t1.ganghang_id is not null;







