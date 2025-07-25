select
	t1.*
from
	pty_role_type t1
where
	t1.org_id = 27009123
-- 	id = 17002335
order by t1.id desc


select
	*
from
	dev_device_item t1
where
	t1.org_id = 27009323


select
	*
from
	pty_party t1
where
	t1.id = 27009426



	
select
	pty1.id,
	pty1.status ,
	pty1.party_id_to,
	pty5.NAME as groupName,
	pty2.id as 'partyId',
	pty2.NAME as name,
	pty2.type as type,
	pty2.org_id as orgId,
	pty3.mobile as mobile,
	pty3.email as email,
	emp.employee_id as employeeId,
	emp.duties as duties,
	pty1.seq as seq,
	roles.id,
	roles.code,
	roles.name as roleTypeName
from
	pty_relationship pty1
join pty_party pty2 on pty1.party_id_from = pty2.id
	and pty2.object_state != 'disabled'
	and pty2.org_id = 27009169
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
-- 	and pty1.party_id_to = 27009169
	and roles.code = 'R002655'
-- order by
-- 	pty1.seq is null,
-- 	pty1.seq * 1 asc,
-- 	pty2.NAME asc