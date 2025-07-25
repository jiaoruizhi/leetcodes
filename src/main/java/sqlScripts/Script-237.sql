

select * from dev_device_item t1
where 1 = 1
and t1.org_id = 27009123
;



select * from dev_manage_area t1
where 1 = 1
and t1.org_id = 27009123
;

select * from pty_role_type t1
where 1 = 1
and t1.org_id = 27009365

INSERT INTO pty_role_type
(id, code, mdm_code, name, default_role_id, `type`, description, tenant_id, sys_code, project_id, owner_id, owner_group_id, object_state, created_by, created_time, last_updated_by, last_updated_time, org_id, status, struct_type)
VALUES(17002392, 'R002689', NULL, '企业领导', NULL, 'qiye_management', NULL, 0, 'luan', NULL, 19000064, 24007186, 'enabled', 19000064, '2021-12-01 23:46:52', 27009630, NULL, 27009365, NULL, 'luan');

insert into pty_role_type
(code, name, `type`, tenant_id, sys_code, object_state, org_id, struct_type)
select 'R900000', '系统管理员', 'qiye_management', 0, 'luan', 'enabled', party_id_from, 'luan'
from pty_relationship where code like '001010%'  and role_type_from = 'company' 
;




select party_id_from from pty_relationship where code like '001010%'  and role_type_from = 'company'