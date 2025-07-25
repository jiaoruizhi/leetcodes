

select t1.previous_time, t1.* from sche_plan t1
where t1.id = 147
;

select * from ope_operation_region t1
where t1.id = 8000007;


periodicity

select * from sche_plan t1
left join ope_operation_region t2 on t1.business_key = t2.id 
where 1 = 1
and t1.`type` = 'periodicity'
and t2.id is null
;

delete from sche_plan t1
where t1.id in (10000013, 15000001);



select * from pro_deployment pd 
where 1 = 1
and process_key = "inspection_work"
and org_id = 27009418