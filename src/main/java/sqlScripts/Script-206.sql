

select * from pfm_work t1
where 1 = 1
and t1.id = 1159000074
-- and t1.org_id = 27009166


select * from pfm_work t1
where 1 = 1
and t1.id in (1159000059, 1159000074)

1159000074

1159000059

INSERT INTO pfm_work
(id, plan_id, name, `type`, business_key, business_type, party_group_id, assigner_person, complete_person, start_time, due_time, complete_time, status, remark, tenant_id, sys_code, project_id, owner_id, owner_group_id, org_id, object_state, created_by, created_time, last_updated_by, last_updated_time, document_id, pic_document_id, form_id, due_status, location_id, work_code, post_id, classes_id, receive_manner, receive_time, review_id, review_time, cancel_id, cancel_time, combined_inspections_flag, teams_id, trigger_event_id, object_type, frequency, plan_start_time, plan_end_time, description, start_way, photo_way, location, approve_routes, video_document_id, inspection_description, event_status_name, overdue_time, sign_in_flag, recheck_person_id, recheck_date, recheck_result, recheck_remark, recheck_pic_document_id, inspection_type, delay_flag, system_reason_flag, work_recheck_person_id, work_recheck_date, work_recheck_result, work_recheck_remark, work_recheck_pic_document_id, gymnast_person_id, director_person_id, zhongyuan_id)
VALUES(1159000059, NULL, '洋浦内贸仓作业区域巡检', 'periodicity', 15000009, 'operationInspection', 180001741, 27064829, NULL, NULL, NULL, NULL, 'recheck', NULL, 0, NULL, NULL, 20000093, NULL, 27009418, 'enabled', NULL, '2024-09-27 22:23:00', 20000093, '2024-09-29 17:29:15', NULL, 1046000120, 110000007, NULL, 13000023, '10197', 17002409, 2000002, 'manual', '2024-09-29 10:07:03', NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '自动开始', '通用', NULL, NULL, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
