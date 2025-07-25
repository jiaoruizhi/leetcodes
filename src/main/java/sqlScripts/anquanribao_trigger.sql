select
	t1.org_id,
	t1.type,
	t1.business_type,
	t2.trends,
	t1.party_group_id,
	t1.event_status_name as self_name,
	if(t1.event_status_name is null
	or t1.event_status_name = '',
	ref3.data_name,
	t1.event_status_name) as event_status_name
from
	pfm_work t1
left join tos_trigger_event t2 on
	t2.id = t1.trigger_event_id
left join ref_reference ref3 on
	ref3.data_code = t2.trends
	and ref3.element_code = 'tosTriggerEventTrends'
where
	1 = 1
	and t1.type = 'trigger'
	and t1.business_type = 'patrol'
	and t1.status not in ('retract', 'nullify', 'cancel')
	and t1.org_id = 27009365
	and DATE_FORMAT(t1.created_time, '%Y-%m-%d') >= '2024-06-01'
	and DATE_FORMAT(t1.created_time, '%Y-%m-%d') <= '2024-07-31'
	and t1.party_group_id = 27009386
        ;

select
	t11.id, t11.trends, t11.event_status_name, count(t11.id)
from
	(
	select
	t1.id,
		t1.org_id,
		t1.type,
		t1.business_type,
		t2.trends,
		t1.party_group_id,
		if(t1.event_status_name is null
		or t1.event_status_name = '',
			ref3.data_name,
			t1.event_status_name) as event_status_name
	from
		pfm_work t1
	left join tos_trigger_event t2 on
		t2.id = t1.trigger_event_id
	left join ref_reference ref3 on
		ref3.data_code = t2.trends
		and ref3.element_code = 'tosTriggerEventTrends'
	where
		1 = 1
		and t1.type = 'trigger'
		and t1.business_type = 'patrol'
		and t1.status not in ('retract', 'nullify', 'cancel')
		and t1.org_id = 27009365
		and DATE_FORMAT(t1.created_time, '%Y-%m-%d') >= '2024-06-01'
		and DATE_FORMAT(t1.created_time, '%Y-%m-%d') <= '2024-07-31'
-- 		and t1.party_group_id = 27009386
   ) t11
   where 1=1
--    and t11.trends = 'SMMS_VSL_ARRIVED'
--    and t11.trends  is null
--    and t11.event_status_name is null
group by
	t11.event_status_name
;











select t1.id, t2.id from pfm_work t1
left join tos_trigger_event t2 on
	t2.id = t1.trigger_event_id
where t2.trends is null