


select * from pty_relationship t1
where 1 = 1
and org_id = 27009323
and t1.role_type_to = 'department'
and t1.party_id_to is null


delete from pty_relationship t1
where 1 = 1
and org_id = 27009323
and t1.role_type_to = 'department'
and t1.party_id_to is null


select t1.* from pfm_work t1
where t1.id = 1176000013

select * from pty_role_type t1
where 1 = 1
-- and t1.code
order by t1.id desc

update pty_role_type set name = '系统流程管理员' where code= 'R900000';