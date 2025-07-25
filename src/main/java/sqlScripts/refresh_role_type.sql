


select
t1.id, t2.name, t1.party_id_from,
t1.role_type_from ,
emp.role_type_id,
roles.code 
from pty_relationship t1
left join pty_party t2 on t1.party_id_from = t2.id
left join pty_person pty3 on t1.party_id_from = pty3.id
left join employee_info emp on emp.id = pty3.id
left join pty_role_type roles on emp.role_type_id = roles.id
where 1 = 1
and roles.id is not null
order by t2.id asc
;


update pty_relationship t1
left join pty_party t2 on t1.party_id_from = t2.id
left join pty_person pty3 on t1.party_id_from = pty3.id
left join employee_info emp on emp.id = pty3.id
left join pty_role_type roles on emp.role_type_id = roles.id
set t1.role_type_from = roles.code
where 1 = 1
and roles.id is not null
;


select * from employee_info t1
where t1.id = 607001639;


select * from pty_role_type t1
where 1 =1
and t1.code in ('R000076', 'R001849');



select * from idm_user t1










