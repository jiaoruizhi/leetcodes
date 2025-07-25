


-- work analytics


select
	t1.org_id,
	t1.type,
	t1.business_type,
	case
		when t1.event_status_name is not null then t1.event_status_name
		else '其他'
	end as event_status_name,
	t1.party_group_id,
	count(t1.id) as countValue
from
	pfm_work t1
where
	1 = 1
	and t1.type = 'trigger'
	and t1.business_type = 'patrol'
	and t1.org_id = 27009365
group by
	t1.org_id,
	t1.type,
	t1.event_status_name ; 
	






select
	t1.id,
	t1.org_id,
	t1.type,
	t1.business_type,
	t1.event_status_name,
	t1.party_group_id,
	t1.created_time,
	t1.plan_id,
	t2.trends,
	t1.*
from
	pfm_work t1
	left join tos_trigger_event t2 on t2.id = t1.trigger_event_id
where
	1 = 1
	and t1.type = 'trigger'
	and t1.business_type = 'patrol'
	and t1.org_id = 27009365
	and t1.trigger_event_id is not null
order by t1.created_time desc








