



insert into pty_role_type
(code, name, `type`, tenant_id, sys_code, object_state, org_id, struct_type)
select 'R900000', '系统管理员', 'qiye_management', 0, 'luan', 'enabled', party_id_from, 'luan'
from pty_relationship where code like '001010%'  and role_type_from = 'company' 
;


