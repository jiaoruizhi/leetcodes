

select * from ref_reference t1
where 1= 1
-- and t1.data_value like "%爆炸%"
and t1.element_code = "hotJobType"
order by t1.id


select * from rsk_risk t1
order by t1.id desc


select
	roles.code,
	pty3.id,
	roles.name,
	pty1.sys_code ,
	*
from
	pty_relationship pty1
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
-- 	and pty1.party_id_from in (27061866,27061842)
	and pty1.party_id_to = 412001675


select * from employee_info emp
where emp.id in (27061866,27061842)


