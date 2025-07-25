select
	t1.org_id,
	t1.type,
	t1.business_type,
	t1.event_status_name,
	t1.party_group_id
from
	pfm_work t1
where
	1 = 1
	and t1.type = 'trigger'
	and t1.business_type = 'patrol'
	and t1.org_id = 27009365
	and 
-- 	and t1.event_status_name is null
group by
	t1.org_id,
	t1.type,
	t1.event_status_name
 ;

==> Parameters: 27009123(long)



select * from sche_plan sp 
where 1 = 1
and sp.org_id = 27009365