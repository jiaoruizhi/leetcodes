






-- initial_user_role


select * from idm_role t1;

select id, 105, 0, t1.*
from idm_user t1
;



select * from idm_user_role t1;

-- INSERT INTO idm_user_role
-- (id, user_id, role_id, tenant_id, project_id, owner_id, owner_group_id, object_state, created_by, created_time, 
-- last_updated_by, last_updated_time, org_id, owner_org_id, sys_code)
-- VALUES(1, 1175, 1, 0, NULL, 5, NULL, 'enabled', 5, '2022-01-21 16:30:10', NULL, NULL, 2, 2, NULL);

insert into idm_user_role (user_id, role_id, tenant_id, owner_id, object_state, created_by, created_time, org_id, owner_org_id)
select id, 175, 0, t1.owner_id , 'enabled', t1.created_by , t1.created_time , t1.org_id , t1.owner_org_id 
from idm_user t1
where not exists (
	select 1 from idm_user_role iu where iu.user_id = t1.id and iu.role_id = 175
)
;









select id, t1.name, 175, 0, t1.owner_id , 'enabled', t1.created_by , t1.created_time , t1.org_id , t1.owner_org_id 
from idm_user t1
where not exists (
	select 1 from idm_user_role iu where iu.user_id = t1.id and iu.role_id = 175
	);














