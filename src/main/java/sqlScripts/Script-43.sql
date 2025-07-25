

select t2.code, t1.name from ope_operation_location t1
left join ope_operation_region t2 on t1.region_id = t2.id 

