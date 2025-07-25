


select t1.object_state, t1.* from rsk_risk_hazard t1
where 1 = 1
and t1.object_state = 'enabled'
       and t1.org_id in (
select
	party_id_from
from
	pty_relationship
where
	code like '001010%'
	and role_type_from = 'company'
        );