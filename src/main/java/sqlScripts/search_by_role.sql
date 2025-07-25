select
roles.id,
	roles.name,
	roles.code,
	roles2.id,
	roles2.name,
	pty2.name,
	pty3.mobile,
	pty1.*
from
	(
	select
		*
	from
		pty_relationship pr
	where
		1 = 1
		and pr.object_state = 'enabled'
		and pr.relationship_type = 'employment'
		and pr.party_id_to = 27009383
        ) pty1
join pty_party pty2 on
	pty1.party_id_from = pty2.id
	and pty2.object_state = 'enabled'
left join pty_party pty5 on
	pty1.party_id_to = pty5.id
left join pty_person pty3 on
	pty2.id = pty3.id
left join employee_info emp on
	emp.id = pty3.id
left join pty_role_type roles on
	emp.role_type_id = roles.id
left join pty_role_type roles2 on
	pty1.role_type_from = roles2.code
where
	1 = 1
-- 	                AND (
--                 emp.role_type_id = 17002353
--                 or
--                 roles2.id = 17002353
--                 )
	and (
                roles.name like '%部门负责人%'
		or roles2.name like '%部门负责人%'
                )
	
	
	
	select * from pty_relationship t1
	where t1.party_id_from = 27062144
	
	
	
	
	select * from pty_role_type t1
	where t1.id = 1;