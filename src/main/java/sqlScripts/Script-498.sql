
select t1.unique_code, t1.* from ins_inspection t1
where t1.id = 1082000168;




select t2.name, t1.* from dev_device_head t1
left join dev_device t2 on t1.device_id = t2.id
where 1 = 1
and t1.ganghang_id is not null



select t1.ganghang_id, t1.* from ins_inspection t1
where 1 = 1
and t1.business_type = 'specialOperationPatrol'
order by t1.ganghang_id asc