-- 17689830214


select
	*
from
	pty_group t1
where
	1 = 1
	and t1.id = 27009015
;

select
	*
from
	pty_relationship t1
where
	1 = 1
	and t1.party_id_from = 27009015
;

select
	t1.id,
	t1.work_no,
	count(t1.id) as countValue,
	t1.apply_status ,
	t1.org_id,
	case
		when ci.abbreviation is not null then ci.abbreviation
		else ci.name
	end as orgName,
	t1.type,
	pw.status
from
	ope_special_operation t1
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
left join company_info ci on
	ci.id = t1.org_id
left join pty_relationship relat on
	relat.party_id_from = t1.org_id
	and relat.role_type_from = 'company'
	and relat.relationship_type = 'organizational_structure'
where
	1 = 1
	and t1.type is not null
-- 	and t1.`type` = '1'
	and t1.apply_status != 'created'
	and relat.code like '001010%'
	and relat.status = 'enabled'
	and DATE_FORMAT(t1.execute_time_start, '%Y-%m-%d') <= '2025-01-09'
	and DATE_FORMAT(t1.execute_time_end, '%Y-%m-%d') >= '2025-01-09'
	group by
		t1.type
	;
