-- search_special_operation








select
	t1.apply_status ,
	t1.id
-- 	t1.risk_code,
-- 	t1.region_code,
-- 	t1.name,
-- 	t1.type,
-- 	t1.level,
-- 	ref.data_name as levelName,
-- 	t1.department_id,
-- 	p2.name as groupPartyName,
-- 	t1.applicant,
-- 	ifnull(p1.name, t1.applicant_name) as applicantName,
-- 	t1.unit,
-- 	t1.worker,
-- 	t1.site_leader,
-- 	t1.guardian,
-- 	t1.execute_time_start as workDate,
-- 	t1.execute_time_start as workTime,
-- 	t1.location,
-- 	t1.measures,
-- 	t1.work_no,
-- 	t1.other_work_flag,
-- 	t1.hazard_identify,
-- 	t1.content,
-- 	t1.related_parties,
-- 	t1.mobile,
-- 	t1.safety_officer,
-- 	t1.form_id,
-- 	t1.document_id,
-- 	t1.picture_document_id,
-- 	t1.org_id,
-- 	pty5.name as departmentName,
-- 	relat.code as relationshipCode,
-- 	t1.created_time,
-- 	t1.applicant_time,
-- 	t1.execute_time_start,
-- 	t1.execute_time_end,
-- 	t1.associate_other_danger_job,
-- 	t1.safe_confessor,
-- 	t1.accept_confessor,
-- 	t1.risk_identification_result,
-- 	t1.hot_way,
-- 	t1.hot_man_certificate_number,
-- 	t1.confined_space_name,
-- 	t1.confined_space_original_media_name,
-- 	t1.gas_analysis_document_id,
-- 	t1.hot_job_type,
-- 	t1.height,
-- 	t1.new_height,
-- 	p3.name as unitName,
-- 	t1.measure_definition,
-- 	t1.preview_document_id,
-- 	t1.measure_names as measureNamesStr,
-- 	t1.apply_type,
-- 	t1.apply_status,
-- 	t1.operation_department_person_id,
-- 	t1.operation_department_remark,
-- 	t1.operation_department_time,
-- 	t1.operation_department_document_id,
-- 	t1.ministry_safety_person_id,
-- 	t1.ministry_safety_remark,
-- 	t1.ministry_safety_time,
-- 	t1.ministry_safety_document_id,
-- 	t1.company_leader_person_id,
-- 	t1.company_leader_remark,
-- 	t1.company_leader_time,
-- 	t1.company_leader_document_id,
-- 	t1.job_preparation_person_id,
-- 	t1.site_cleanup_person_id,
-- 	t1.job_end_person_id,
-- 	work.last_updated_time as workEndTime,
-- 	work.status as workCenterStatus,
-- 	pw.status as workStatus,
-- 	p4.name as operationDepartmentPersonIdName,
-- 	p5.name as ministrySafetyPersonIdName,
-- 	p6.name as companyLeaderPersonIdName,
-- 	p7.name as jobPreparationPersonIdName,
-- 	p8.name as siteCleanupPersonIdName,
-- 	p9.name as jobEndPersonIdName,
-- 	t1.work_qualification_certificate_document_id,
-- 	t1.comment_applicant_remark,
-- 	t1.signature_document_id,
-- 	ref1.data_name as applyStatusName,
-- 	t1.confined_space_department_id,
-- 	t1.std_toxic_harmful_media,
-- 	t1.std_combustible_gas,
-- 	t1.std_oxygen_content,
-- 	t1.data_toxic_harmful_media,
-- 	t1.data_combustible_gas,
-- 	t1.data_oxygen_content,
-- 	t1.detection_time,
-- 	t1.detection_site,
-- 	t1.detect_people,
-- 	t1.personnel_risk_document_id,
-- 	pty11.name as confinedSpaceDepartmentName,
-- 	t1.lift_tool_name,
-- 	t1.hoisting_personnel,
-- 	t1.hoisting_command,
-- 	t1.lift_weight_mass,
-- 	t1.relevant_involved_unit,
-- 	t1.circuit_breaker_reason,
-- 	t1.approve_routes,
-- 	t1.gymnast_person_id,
-- 	concat(ifnull(p4.name, ''), '%', ifnull(p5.name, ''), '%', ifnull(p6.name, ''), '%', ifnull(p10.name, '')) as auditPersonName,
-- 	t1.director_person_id,
-- 	pty12.name as gymnastPersonName,
-- 	pty13.name as directorPersonName,
-- 	t1.input_department_name
from
	ope_special_operation t1
left join pty_party p1 on
	t1.applicant = p1.id
left join pty_party p2 on
	t1.department_id = p2.id
-- left join pty_party p3 on
-- 	t1.unit = p3.id
-- left join pty_party p4 on
-- 	t1.operation_department_person_id = p4.id
-- left join pty_party p5 on
-- 	t1.ministry_safety_person_id = p5.id
-- left join pty_party p6 on
-- 	t1.company_leader_person_id = p6.id
-- left join pty_party p7 on
-- 	t1.job_preparation_person_id = p7.id
-- left join pty_party p8 on
-- 	t1.site_cleanup_person_id = p8.id
-- left join pty_party p9 on
-- 	t1.job_end_person_id = p9.id
-- left join pty_party p10 on
-- 	p10.id = t1.safety_department_manager_person_id
-- left join pty_relationship relat on
-- 	relat.party_id_from = t1.org_id
-- 	and relat.role_type_from = 'company'
-- 	and relat.relationship_type = 'organizational_structure'
-- left join pty_party pty5 on
-- 	t1.org_id = pty5.id
left join work_center work on
	work.business_key = t1.id
	and work.business_type in ('specialHot', 'specialHigh', 'specialConfineSpace', 'specialHoisting', 'specialTemporary', 'specialEarth', 'specialCircuitBreaker')
	and work.object_state = 'enabled'
left join (
	select
		pwi.business_key,
		case
			when count(case when pwi.`status` != 'completed' then 1 else null end) = 0 then 'completed'
			when count(case when pwi.`status` != 'completed' then 1 else null end) > 0 then 'incompleted'
		end as status
	from
		pfm_work pwi
	where
		1 = 1
		and pwi.business_type = 'specialOperationPatrol'
	group by
		pwi.business_key
        ) pw on
	pw.business_key = t1.id
left join ref_reference ref on
	ref.element_code = 'specialOperationLevel'
	and t1.level = ref.data_code
left join ref_reference ref1 on
	ref1.element_code = 'applyStatus'
	and t1.apply_status = ref1.data_code
left join ref_reference ref2 on
	ref2.element_code = 'applyType'
	and t1.apply_type = ref2.data_code
left join pty_party pty11 on
	pty11.id = t1.confined_space_department_id
left join pty_party pty12 on
	pty12.id = t1.gymnast_person_id
left join pty_party pty13 on
	pty13.id = t1.director_person_id
where
	1 = 1
	and t1.id = 940000005
-- 	and relat.code like '001010%'
-- 	and relat.status = 'enabled'
-- 	and t1.`type` in ('1')
-- 	and DATE_FORMAT(t1.execute_time_start, '%Y-%m-%d') <= '2025-01-09'
-- 	and DATE_FORMAT(t1.execute_time_end, '%Y-%m-%d') >= '2025-01-09'
	
	
	
	select t1.apply_status, t1.* from ope_special_operation t1
	where 1 = 1
	group by t1.apply_status
-- 	and business_key = 940000005
	
	
	select t1.status,  t1.* from ins_rectification t1
	where 1 = 1
	and t1.issue_id = 1111000032
	
	
		select t1.status,  t1.* from work_center t1
	where 1 = 1
	and t1.business_key = 1113000030
	
	
	
	select * from pty_party where name = '潘克松'

	select * from pty_party where id = 27009188

	

	select * from sf_task_instance t1
	where 1 = 1
	and t1.business_key = 1113000030
	
	
	
	
	
	
	
	
	