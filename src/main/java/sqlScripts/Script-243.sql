



select * from idm_role 
select * from idm_user_role 



select
	t1.name,
	t2.name,
	r.name
from
	pty_party t1
left join idm_user t2 on t2.person_id = t1.id
join idm_user_role pr on t2.id = pr.user_id
join idm_role r on pr.role_id = r.id
where
	1 = 1
	and t1.org_id = 27009365
	and t2.id is not null
	and r.name = '公司系统管理员'