select
	t1.id,
	t1.region_id,
	t1.name,
	t1.type,
	t1.holiday_scheduling_flag,
	t1.document_id,
	t1.pic_document_id,
	t1.org_id,
	relat.code as relationshipCode,
	pty1.name as personName,
	t3.incase_flag,
	t3.duties,
	pty2.name as groupName,
	t3.employee_id,
	pty1.id as personId,
	roles.name as roleTypeName
from
	(
	select
		*
	from
		sch_scheduling_teams sst
	where
		1 = 1
		and sst.org_id = 27009365 ) t1
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
left join pty_relationship relat2 on
	relat2.party_id_from = t2.person_id
	and relat2.role_type_to = 'department'
	and relat2.object_state = 'enabled'
left join pty_party pty2 on
	pty2.id = relat2.party_id_to
where
	1 = 1
	and t2.id is not null
	and pty1.id is not null
-- 	and pty2.name like CONCAT('%',?, '%')
order by
	t1.id desc