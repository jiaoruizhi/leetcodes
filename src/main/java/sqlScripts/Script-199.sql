





select
	p1.name ,
	pty2.id,
	pty2.name,
	t1.*
from
	sch_scheduling_arrangement t1
left join pty_party p1 on
	t1.person_id = p1.id
left join pty_relationship relat2 on
	relat2.party_id_from = t1.person_id
	and relat2.role_type_to = 'department'
	and relat2.object_state = 'enabled'
left join pty_party pty2 on
	pty2.id = relat2.party_id_to
where
	1 = 1
	and t1.org_id = 27009323
	and t1.work_date = '2024-09-26'
-- 	ant pty2.id = 123
	
	
	select * from pty_relationship where party_id_from = 27063242
	