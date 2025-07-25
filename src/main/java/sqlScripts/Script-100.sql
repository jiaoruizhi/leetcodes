

select t1.code, t1.* from ope_operation_region t1
where 1 = 1
and t1.id = 3000004

select * from ope_operation_location t1
where 1 = 1
and t1.name like "%马村-TM02%"

 select
	t1.region_code, t2.control_level ,t2.*
from
	rsk_risk_region_link t1
left join rsk_risk t2 on
	t1.risk_code = t2.code
where t1.region_code = 3000120


select * from rsk_risk_region_link t1
where t1.region_code = 3000120