


select * from pfm_work t1
where 1 = 1
and t1.trigger_event_id = 163000041
;

select * from tos_trigger_event t1
where 1 = 1
and t1.id = 163000041
-- and t1.org_id = 27009123
order by t1.id desc


select t1.id as locationId, t1.name as planBerth,
-- t2.id as regionId, t2.id, t2.name as regionName,
t2.code as TermCode
from ope_operation_location t1
left join ope_operation_region t2 on t1.region_id = t2.id 
where 1 = 1
and t1.org_id = 27009123
-- and t2.code = 1001
-- and t1.name like "%工作船%"
;

select t1.code, t1.* from ope_operation_region t1
left join ope_operation_location t2 on t2.region_id = t1.id
where 1 = 1
and t2.org_id = 27009123
;




select t1.business_key, t1.business_type, count(t1.id) from ins_inspection t1
where 1= 1
-- and t1.business_type = 'company'
group by t1.business_type 
order by t1.id desc




select * from pty_relationship t1
where relationship_type = 'safety_officer'



select * from base_related_own_work
;



select * from pro_deployment t1
where 1 = 1
and t1.org_id = 27009365
-- and t1.id = 1174
;






select t1.* from pro_deployment t1
where 1 = 1
and t1.process_key = 'test_demo'
order by t1.id desc



select * from ins_rectification t1
order by t1.id desc

