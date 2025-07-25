select
	count(distinct(t2.id))
from
	pfm_work t1
left join tos_trigger_event t2 on
	t1.trigger_event_id = t2.id
where
	1 = 1
	and t2.id is not null
	and t1.org_id = 27009365
	
	
	select * from tos_trigger_event t1
	where t1.org_id = 27009365
	group by t1.vsl_name , t1.flight , t1.berth

	
	
        select count(*) from (
        select
            t1.id
        from tos_trigger_event t1
        left join pfm_work t2 on t2.trigger_event_id = t1.id
        where 1 = 1
        group by t1.vsl_name, t1.flight, t1.berth
        )tt