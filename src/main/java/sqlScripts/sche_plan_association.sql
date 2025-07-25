



-- sche_plan_association


select
	car.name as cargoName,
	t1.*
from
	sche_plan_association t1
left join pty_relationship relat on
	relat.party_id_from = t1.org_id
	and relat.role_type_from = 'company'
	and relat.object_state = 'enabled'
left join tos_cargo car on
	car.id = t1.business_key
	and t1.business_type = 'tosCargo'
left join ins_checkform form on
	form.id = t1.object_id
	and t1.business_type = 'tosCargo'
where
	1 = 1
	and t1.business_type = "tosEventPlan"
	and t1.business_key = "76000039"
	
;

select
	t1.business_key,
	count(t1.id)
from
	sche_plan_association t1
where
	1 = 1
	and business_type = "operationInspection"
group by
	t1.business_key
;







select *
from
	sche_plan_association t1 
where 1 = 1
and t1.business_type= "tosEventPlan"
and t1.plan_id =127











