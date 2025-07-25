

select t1.created_by , t1.created_time ,t1.* from ins_issue t1
where 1 = 1
order by t1.id desc

select * from dev_device t1
where 1 = 1
-- and t1.external_code is not null


select * from acc_sensor_data t1 where t1.value >10;



select t2.operation_pass_flag, t2.org_id, t1.* from ins_issue t1
left join ins_inspection t2 on t1.inspection_id = t2.id 
left join ins_issue_object obj1 on t1.id = obj1.issue_id
where 1 = 1
and ((t2.check_category = 'checkOperation' or t2.business_type = 'operation' or obj1.business_type = 'operation') 
or ((t2.check_category = 'specialOperationPatrol' or t2.business_type = 'specialOperationPatrol') 
-- and t2.operation_pass_flag <> true
))

select * from pfm_work t1
left join ins_inspection t7 on t7.work_id = t1.id
where t7.id = 956000017


select * from ins_issue t1
where t1.inspection_id = 993000022


select operation_pass_flag, t1.check_category, t1.* from ins_inspection t1
where t1.id = 956000017