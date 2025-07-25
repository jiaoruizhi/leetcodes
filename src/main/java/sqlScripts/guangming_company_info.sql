











update pty_relationship t1 set relationship_type = 'organizational_structure' where party_id_from = 30340;








INSERT INTO food.pty_relationship
(party_id_from, party_id_to, role_type_from, role_type_to, relationship_type, `level`, code, leaf, start_time, end_time, status, sort, central_flag, tenant_id, project_id, owner_id, owner_group_id, object_state, created_by, created_time, last_updated_by, last_updated_time, org_id, owner_org_id, sys_code)
select party_id_from, party_id_to, role_type_from, role_type_to, relationship_type, `level`, code, leaf, start_time, end_time, status, sort, central_flag, tenant_id, project_id, owner_id, owner_group_id, object_state, created_by, created_time, last_updated_by, last_updated_time, org_id, owner_org_id, sys_code
from guangming.pty_relationship
where party_id_from = 10842
;


update  food.pty_relationship set object_state = 'enabled'
where party_id_from = 30340
;






update  food.pty_party set object_state = 'enabled'
where id = 30340
;


