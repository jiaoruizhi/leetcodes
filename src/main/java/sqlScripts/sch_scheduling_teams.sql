

-- sch_scheduling_teams



select * from sch_scheduling_teams t1
where 1 = 1
and t1.org_id = 27009365
;




select
	t1.id,
	t1.region_id,
	t1.name,
	t1.type,
	t1.holiday_scheduling_flag,
	t1.org_id,
	p3.mobile,
	relat.code as relationshipCode,
	pty1.name as personName,
	t3.incase_flag,
	t3.duties,
	t3.employee_id,
	pty1.id as personId,
	roles.name as roleTypeName
-- 	count(t1.id),
-- 	t1.id
from
	sch_scheduling_teams t1
left join pty_person_contact t2 
	on t1.id = t2.business_key
	and t2.business_type = 'schedulingTeams'
	and t2.object_state = 'enabled'
left join pty_relationship relat 
    on relat.party_id_from = t1.org_id
	and relat.role_type_from = 'company'
	and relat.object_state = 'enabled'
left join pty_party pty1 on pty1.id = t2.person_id
left join employee_info t3 on t3.id = t2.person_id
left join pty_role_type roles on t3.role_type_id = roles.id
left join pty_person p3 on p3.id = t2.person_id 
where 1 = 1
-- and t1.id = 18
-- and t1.name like '%马村%'
and pty1.name like "%陈伟%"
-- group by t1.id
order by t1.id desc
;















