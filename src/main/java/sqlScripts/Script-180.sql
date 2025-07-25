


select * from pfm_work t1
where 1 = 1
and t1.business_type = "deviceInspection"


select
	t1.org_id,
	t1.party_group_id,
	t1.type,
	t1.business_type,
	t1.status
from
	pfm_work t1
left join dev_device dev1 on
	dev1.id = t1.business_key
	and t1.business_type in ('deviceInspection', 'fireDeviceInspection')
left join dev_device_category cate on
	cate.id = dev1.category
where
	1 = 1
	and t1.status not in ('retract', 'nullify', 'cancel')
	and t1.org_id = 27009365
	and t1.type = "spotCheck"
	and t1.business_type = "deviceInspection"
