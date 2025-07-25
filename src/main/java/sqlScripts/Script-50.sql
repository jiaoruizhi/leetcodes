select
	*
from
	(
	select
		*
	from
		pty_relationship pr
	where
		1 = 1
		and pr.object_state != 'disabled'
		and pr.party_id_to = 691001552
	) pty1
join pty_party pty2 on
	pty1.party_id_from = pty2.id
	and pty2.object_state != 'disabled'
-- 	and pty2.org_id = 691001552
left join pty_party pty5 on
	pty1.party_id_to = pty5.id
left join pty_person pty3 on
	pty2.id = pty3.id
left join employee_info emp on
	emp.id = pty3.id
left join pty_role_type roles on
	emp.role_type_id = roles.id
where
	1 = 1
-- 	and pty1.relationship_type = 'employment'
-- 	and emp.incase_flag = true
group by
	pty2.id