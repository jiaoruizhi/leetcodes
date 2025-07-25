
-- 139000068
-- 139000069
-- 139000070
-- 139000072
-- 139000073
-- 139000074


select t1.* from pfm_work t1
where 1 = 1
and t1.trigger_event_id = 139000074


select t1.id, t1.name, t2.name, t2.code from ope_operation_location t1
left join ope_operation_region t2 on t1.region_id = t2.id 
where 1 = 1
and t1.org_id = 27009365
-- and t2.code = 1001
;


select t1.* from tos_trigger_event t1
where 1 = 1
and t1.id in (139000073,139000074, 139000072);





