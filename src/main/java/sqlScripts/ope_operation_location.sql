

-- ope_operation_location

select * from ope_operation_location t1
where 1 = 1
-- and t1.org_id = in（27009094， 27009123)
-- and name = "二区化肥堆场"
-- and region_id = 1001
-- and name like "%20#%"
-- and t1.org_id = 27009094
order by t1.id desc
;

select region.code, region.name, region.org_id, region.id, t1.name, t1.org_id
from ope_operation_location t1
left join ope_operation_region region on region.id = t1.region_id
where 1 = 1
-- and t1.code = 1
-- and t1.org_id = in（27009094， 27009123)
-- and name = "20号东"
-- and region_id = 1001
-- and t1.name like "%18号南%"
-- and t1.org_id = region.org_id
-- and t1.org_id = 27009365
and region.code in ("1001", "2001")
;

select * from ope_operation_location t1
where 1 = 1
-- and t1.org_id = in（27009094， 27009123)
-- and name = "20号东"
-- and region_id = 1001
-- and name like "%20#%"
and t1.code = "me-xczbs"
;

select * from ope_operation_region t1
where 1 = 1
-- and t1.org_id = in（27009094， 27009123)
-- and name = "20号东"
and t1.code in (1001, 2001)
-- and t1.id in (11000002, 11000003)


-- and name like "%20#%"
-- and t1.code = "me-xczbs"
;
