select * from ref_reference t1
where  1 = 1
and t1.element_code = "assessMethod"




INSERT INTO ref_reference
(element_name, element_code, data_name, data_value, data_code, data_type, data_sequence, data_default, parent_element_code, parent_data_code, tenant_id, sys_code, project_id, owner_id, owner_group_id, object_state, created_by, created_time, last_updated_by, last_updated_time, org_id)
VALUES('评估方法', 'assessMethod', '风险评价法（LC）', '风险评价法（LC）', '风险评价法（LC）', 'String', '3,4', '是', '', '', 0, NULL, NULL, 3, 9, 'enabled', 3, '2021-08-12 22:47:09', NULL, NULL, NULL);