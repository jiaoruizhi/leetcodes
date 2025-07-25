select
	count(t1.id) as countValue,
	t1.org_id,
	case
		when ci.abbreviation is not null then ci.abbreviation
		else ci.name
	end as orgName,
	t2.type,
	t1.status
from
	pfm_work t1
left join ope_special_operation t2 on
	t1.business_key = t2.id
left join company_info ci on
	ci.id = t1.org_id
left join pty_relationship relat on
	relat.party_id_from = t1.org_id
	and relat.role_type_from = 'company'
	and relat.relationship_type = 'organizational_structure'
where
	1 = 1
	and t1.business_type = 'specialOperationPatrol'
	and (t1.due_status is null
		or t1.due_status != 'overdue')
	and t1.org_id = 27009365
	and DATE_FORMAT(t1.created_time, '%Y-%m-%d') >= '2024-07-01'
	and DATE_FORMAT(t1.created_time, '%Y-%m-%d') <= '2024-07-31'
group by
	t2.type,
	t1.status