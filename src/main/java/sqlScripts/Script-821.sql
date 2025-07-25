
update rsk_safety_check
set created_by = 409000109, created_time = '2025-05-21 09:50:25.000',
last_updated_by = 513000048, last_updated_time = '2025-05-21 18:58:39.973',
object_state = 'enabled', org_id = 27009015, owner_group_id = null,
owner_id = 513000048, project_id = null, sys_code = null, tenant_id = 0,
check_bussiness_key = 27009015, check_bussiness_type = 'company',
check_category = 'self', department_person_id = '781001894,615001529',
end_time = '2025-05-25', form_flag = false, form_id = 165000008, frequency = '1月/1次', 
frequency_number = 1, frequency_time = 1, manage_level = null, period = '月', 
previous_date = '2025-05-21', responsible_department = null, start_time = '2025-05-21', 
status = 'enabled'
where id = 16000005
;


describe rsk_safety_check;


alter table rsk_safety_check drop column department_person_id1 ;



update  rsk_safety_check set department_person_id = department_person_id1;






select * from rsk_safety_check where department_person_id is not null;

select * from pty_party where id   = 27009188;


