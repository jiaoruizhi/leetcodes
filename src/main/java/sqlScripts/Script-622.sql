select
	count(tt.id)
from
	(
	select
		t1.id
	from
		employee_info t1
	left join pty_party pty1 on
		t1.id = pty1.id
	left join pty_person pty2 on
		t1.id = pty2.id
	left join pty_relationship relat on
		relat.party_id_from = pty1.org_id
		and relat.role_type_from = 'company'
		and relat.relationship_type = 'organizational_structure'
	left join pty_party pty5 on
		pty1.org_id = pty5.id
	left join pty_group pty6 on
		pty6.id = pty5.id
	left join pty_relationship relat1 on
		relat1.party_id_from = t1.id
		and relat1.relationship_type = 'employment'
	left join pty_party pty3 on
		relat1.party_id_to = pty3.id
	left join pty_role_type roles on
		t1.role_type_id = roles.id
	where
		1 = 1
	group by
		t1.id,
		pty1.org_id ) tt
