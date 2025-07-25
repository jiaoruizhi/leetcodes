

select * from pfm_work where id = 1161000901


select status, * from work_center
where business_key = 1161000901
;



select * from dev_device t1
where 1 = 1
-- and t1.external_code is not null
;

select t1.classify, count(t1.id) from dev_device_category t1
where 1 = 1
and t1.classify = "otherDevice"
group by t1.org_id 
;

select t1.* from dev_device_category t1
where 1 = 1
and t1.classify = "otherDevice"
and t1.org_id = 27009123
;
