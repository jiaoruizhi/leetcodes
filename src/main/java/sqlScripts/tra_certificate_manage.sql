
--  tra_certificate_manage


select * from tra_certificate_manage
;




select
	t3.warning_time,
	t1.id,
	case
		when p1.name is not null then p1.name
		when t1.name is not null then t1.name
	end as name,
	p1.id as nameId,
	t1.certificate_code,
	t1.certificate_name,
	t1.type,
	t1.jobs,
	t1.start_Date,
	t1.end_Date,
	t1.hold_type,
	t1.status,
	t1.category,
	t1.issue_authority,
	t1.pic_document_id,
	t1.document_id,
	t1.org_id,
	relat.code as relationshipCode,
	t1.branch,
	t1.post_id,
	t1.first_date,
	t1.review_date,
	r1.name as postName,
	t1.type_name,
	info.duties as duties,
	tra.remind_day as remindDay,
	relatPerson.code as personCode,
	t1.related_id,
	case
		when base.name is not null then base.name
		when t1.related_name is not null then t1.name
	end as relatedName,
	t1.created_time,
	t1.job_category,
	t1.drill_items
from
	tra_certificate_manage t1
left join pty_relationship relat on
	relat.party_id_from = t1.org_id
	and relat.role_type_from = 'company'
	and relat.object_state = 'enabled'
left join pty_role_type r1 on
	r1.id = t1.post_id
left join pty_party p1 on
	p1.id = t1.name_id
left join tra_certificate_classification tra on
	tra.id = t1.type
left join employee_info info on
	info.id = p1.id
left join pty_relationship relatPerson on
	relatPerson.party_id_from = p1.org_id
	and relatPerson.role_type_from = 'company'
	and relatPerson.relationship_type = 'organizational_structure'
left join base_related base on
	base.id = t1.related_id
left join warn_warning_event t3 on
	t3.warning_code in('certificate_manage_overdue', 'certificate_manage_neardue')
	and t3.business_key = t1.id
	and t3.status = 'unclose'
where
	1 = 1
	and t1.org_id = 27009365
	and 
order by
	t1.created_time desc
;






select * from pty_party
;







