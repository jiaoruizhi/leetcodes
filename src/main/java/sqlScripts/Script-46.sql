select
	t3.employee_id
from
	sch_scheduling_teams t1
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
where
	1 = 1
	and t2.id is not null
	and pty1.id is not null
	and t1.org_id = 679001551