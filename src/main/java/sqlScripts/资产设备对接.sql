


select t1.category , t1.* from dev_device t1
where t1.external_code is not null
order by t1.id desc
;


select t1.device_check_repair_type , t1.* from ins_inspection t1
left join dev_device t2 on t2.id = t1.business_key
where t1.external_code is not null
order by t1.id desc

select * from ins_issue t1
where t1.external_code is not null
and t1.org_id = 27009123
order by t1.id desc
;


select t1.classify , t1.* from dev_device_category t1
where 1 = 1
-- and t1.id = 20058
and t1.org_id = 27009094
