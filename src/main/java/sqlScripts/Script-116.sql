select
	t1.org_id,
	t1.type,
	t1.business_type,
	t2.trends,
	t1.party_group_id,
	t1.event_status_name
from
	pfm_work t1
left join tos_trigger_event t2 on
	t2.id = t1.trigger_event_id
where
	1 = 1
	and t1.type = 'trigger'
	and t1.business_type = 'patrol'
	and t1.status not in ('retract', 'nullify', 'cancel')
	and t1.org_id = 27009365
	;



==> Parameters: 27009365(long),
2024-01-01(String),
2024-08-28(String)