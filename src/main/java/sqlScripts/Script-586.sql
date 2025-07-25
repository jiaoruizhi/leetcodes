

select * from dev_device_zy_copy t1
where 1 = 1
and t1.type is not null



select * from dev_device_property t1
where t1.device_type_id in (
select t2.id from dev_device_zy_copy t2 where t2.ganghang_id is null
)

select * from dev_device_property_value t2
where 1 = 1
and t2.device_id in (
select t2.id from dev_device_zy_copy t2 where t2.ganghang_id is null
)



select * from dev_device_head t1
where 1 = 1
and t1.device_id in (
select t2.id from dev_device_zy_copy t2 where t2.ganghang_id is null
)



select * from dev_device_change_record ddcr 




