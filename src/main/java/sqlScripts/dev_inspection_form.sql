

-- dev_inspection_form

select * from dev_inspection_form t1
where 1 = 1
-- and t1.work_id = 1074000015
order by t1.id desc
;




select t1.business_key, count(t1.id)  from sche_plan_association t1
where 1 = 1
and business_type = "operationInspection"
group by t1.business_key
;