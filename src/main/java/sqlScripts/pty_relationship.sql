-- 27009365


select
	roles.name ,
	roles.code,
	*
from
	pty_relationship pty1
join pty_party pty2 on
	pty1.party_id_from = pty2.id
	and pty2.object_state != 'disabled'
	-- 	and pty2.org_id = 
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
	-- 	and party_id_from = 27009365
	and party_id_to = 412001675
	and roles.code = 'R002643'
;

select
	pr.role_type_to,
	count(pr.id) cc
from
	pty_relationship pr
left join pty_party p1 on
	p1.id = pr.party_id_to
where
	1 = 1
	-- and party_id_from = 27001067
	-- and pr.role_type_to  = 'company'
group by
	pr.role_type_to
order by
	cc desc
;

select
	*
from
	pty_relationship pr
where
	1 = 1
	-- 	and id = 420001937
	-- and code = "R002691"
-- 	and pr.party_id_to = 412001675
		and pr.party_id_from = 27009166
	-- 	and pr.relationship_type = "employment"
	-- 	and pr.relationship_type = "organizational_structure"
	-- 	and pr.party_id_from = "27009365"
	-- and code is not null
;
-- 流程找人
select
	max(pty1.id) as id,
	max(pty1.STATUS) as status,
	max(pty1.party_id_to) as groupId,
	max(pty5.NAME) as groupName,
	max(pty2.id) as 'partyId',
	max(pty2.NAME) as name,
	max(pty2.type) as type,
	max(pty2.org_id) as orgId,
	max(pty3.mobile) as mobile,
	max(pty3.email) as email,
	max(emp.employee_id) as employeeId,
	max(emp.duties) as duties,
	max(pty1.seq) as seq,
	max(roles.name) as roleTypeName
	-- min(pty1.seq) as seq 
from
	(
	select
		*
	from
		pty_relationship pr
	where
		1 = 1
		and pr.object_state != 'disabled'
		and pr.sys_code = 'luan'
		and pr.party_id_to = 27009234
		) pty1
join pty_party pty2 on
	pty1.party_id_from = pty2.id
	and pty2.object_state != 'disabled'
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
	and pty1.relationship_type = 'employment'
	and emp.incase_flag = true
	and roles.name like "%总经理%"
group by
	pty2.id
order by
	max(pty1.seq) is null,
	max(pty1.seq * 1) asc,
	max(pty2.NAME) asc 
	;


-- 改公司
select t1.* from pty_relationship t1
where 1 = 1
and t1.role_type_from = "company"
and t1.relationship_type = "organizational_structure"
and t1.party_id_from = 27009015
-- group by t1.role_type_to
-- 001010
;

























