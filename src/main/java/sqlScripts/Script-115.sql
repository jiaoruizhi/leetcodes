
select * from pfm_work t1
where 1= 1
and t1.business_type = 'patrol'
and t1.


        select count(*) from (
        select
            t1.id
        from tos_trigger_event t1
--         left join pfm_work t2 on t2.trigger_event_id = t1.id
        where 1 = 1
            and t1.org_id = 27009365
--         group by t1.vsl_name, t1.flight, t1.berth
        )tt
        
select
	count(distinct(t1.id))
from
	tos_trigger_event t1
left join pfm_work t2 on
	t2.trigger_event_id = t1.id
where
	1 = 1
	and t1.org_id = 27009365
	-- 
	
select
	count(*)
from
	tos_trigger_event t1
left join pty_relationship relat on
	relat.party_id_from = t1.org_id
	and relat.role_type_from = 'company'
	and relat.object_state = 'enabled'
where
	1 = 1
	and t1.org_id = 27009365
