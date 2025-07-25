select
	t1.id,
	t1.related_id,
	t1.person_id,
	t1.position,
	pty5.org_id,
	relat.code as relationshipCode,
	pty.name as personName,
	related.name as relatedName,
	info.employee_id,
	pty2.sex,
	ref.data_name as sexName,
	info.birthday,
	info.id_card,
	info.native_place,
	info.address,
	info.bloody,
	info.education,
	info.professional,
	pty2.mobile,
	info.emergency_person,
	info.emergency_telephone,
	pty2.email,
	info.person_type,
	info.employment_type,
	info.duties,
	info.position,
	info.incase_flag,
	info.job_type,
	info.special_job_flag,
	info.black_flag,
	info.hire_date,
	info.safety_officer_flag,
	info.takejob_date,
	info.medical_history,
	info.picture_document_id,
	info.document_id,
	pty5.name as departmentName,
	info.company_code,
	info.external_type,
	ref1.data_name as externalTypeName,
	ref3.data_name as relatedTypeName,
	related.credit_code as relatedCreditCode,
	t1.certificate_filed_document_id,
	t1.telephone,
	t1.certificate_expire_data,
	t1.id_card
from
	base_related_team t1
left join pty_party pty on
	pty.id = t1.person_id
left join base_related related on
	related.id = t1.related_id
left join ref_reference ref3 on
	ref3.data_code = related.type
	and ref3.element_code = 'relatedNewType'
left join employee_info info on
	info.id = t1.person_id
left join pty_party pty1 on
	t1.person_id = pty1.id
left join pty_person pty2 on
	t1.person_id = pty2.id
left join pty_party pty5 on
	pty1.org_id = pty5.id
left join pty_relationship relat on
	relat.party_id_from = pty5.id
	and relat.role_type_from = 'company'
	and relat.object_state = 'enabled'
left join ref_reference ref1 on
	ref1.element_code = 'externalType'
	and ref1.data_code = info.external_type
left join ref_reference ref on
	ref.element_code = 'sex'
	and ref.data_code = pty2.sex
where 1= 1
and pty5.org_id = 27009365
and t1.object_state = 'enabled'
order by
	t1.id desc