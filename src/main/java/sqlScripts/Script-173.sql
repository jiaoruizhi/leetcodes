

INSERT INTO ref_reference
(element_name, element_code, data_name, data_value, data_code, data_type, data_sequence, data_default, parent_element_code, parent_data_code, tenant_id, sys_code, project_id, owner_id, owner_group_id, object_state, created_by, created_time, last_updated_by, last_updated_time, org_id)
VALUES('任务状态', 'work_status', '作废', '作废', 'nullify', 'String', '8', NULL, NULL, NULL, 0, NULL, NULL, 3, NULL, NULL, NULL, NULL, 3, '2021-09-13 17:07:01', 9);





select t1.status, count(t1.id) from pfm_work t1
where 1 = 1
and t1.status = "nullify"
group by t1.status



update pfm_work t1 set t1.status = "nullify" where t1.status = "retract"