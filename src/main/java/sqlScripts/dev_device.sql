-- dev_device

-- {
--     "page": 1,
--     "size": 30,
--     "orgId": "27000133",
--     "containFlag": true,
--     "classifys": [
--         "fireDevice",
--         "miniFireStationDevice"
--     ]
-- }


select
	t1.id
from
	dev_device t1
left join dev_device_category t3 on
	t1.category = t3.id
where
	1 = 1
	and t1.org_id = 27009123
	and t3.classify in ('fireDevice', 'miniFireStationDevice')
;



insert into dev_device_zy_copy
select
	t1.*
from
	dev_device t1
left join dev_device_category t3 on
	t1.category = t3.id
where
	1 = 1
	and t1.org_id = 27009123
	and t3.classify in ('fireDevice', 'miniFireStationDevice')
;



select * from dev_device_category










