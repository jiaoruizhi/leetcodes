select
	count(t1.id) as countValue,
	case
		when ci.abbreviation is not null then ci.abbreviation
		else ci.name
	end as orgName,
	pty2.org_id
from
	base_related_team t1
left join pty_party pty on
	pty.id = t1.person_id
left join pty_party pty2 on
	pty.org_id = pty2.id
left join company_info ci on
	ci.id = t1.org_id
left join pty_relationship relat on
	relat.party_id_from = pty2.id
	and relat.role_type_from = 'company'
	and relat.object_state = 'enabled'
where 1 = 1
	and t1.object_state = 'enabled'
	and pty2.id = 27009365
-- 	and t1.org_id = 27009365