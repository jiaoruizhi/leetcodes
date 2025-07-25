select
	t2.person_id
from
	(
	select
		*
	from
		sch_scheduling_teams sst
	where
		1 = 1
		and sst.org_id = 27009365
        ) t1
left join pty_person_contact t2 on
	t1.id = t2.business_key
	and t2.business_type = 'schedulingTeams'
	and t2.object_state = 'enabled'
left join pty_relationship relat on
	relat.party_id_from = t1.org_id
	and relat.role_type_from = 'company'
	and relat.object_state = 'enabled'
left join pty_party pty1 on
	pty1.id = t2.person_id
left join employee_info t3 on
	t3.id = t2.person_id
left join pty_role_type roles on
	t3.role_type_id = roles.id
-- left join pty_relationship relat2 on
-- 	relat2.party_id_from = t2.person_id
-- 	and relat2.role_type_to = 'department'
-- 	and relat2.object_state = 'enabled'
-- left join pty_party pty2 on
-- 	pty2.id = relat2.party_id_to
where t1.id = 27

-- 607001615

select * from pty_person_contact where business_key = 27


select * from pty_relationship where party_id_from = 607001615














