select
	pw.*
from
	pfm_work pw
left join pty_relationship relat on
	relat.party_id_from = pw.org_id
	and relat.role_type_from = 'company'
	and relat.relationship_type = 'organizational_structure'
where
	1 = 1
	and pw.`type` = "trigger"
	and pw.business_type = "patrol"
	and pw.status not in ('retract', 'nullify', 'cancel')
	and relat.code like "001010%"
	and relat.status = 'enabled'
	and pw.created_time >= '2024-09-01'
	and pw.created_time <= '2024-09-30'




select
	cast(COUNT(t1.id) as DOUBLE) * 100
            /
            (
	select
		COUNT(pIn.id)
	from
		(
		select
			pw.*
		from
			pfm_work pw
		left join pty_relationship relat on
			relat.party_id_from = pw.org_id
			and relat.role_type_from = 'company'
			and relat.relationship_type = 'organizational_structure'
		where
			1 = 1
			and pw.`type` = "trigger"
			and pw.business_type = "patrol"
			and pw.status not in ('retract', 'nullify', 'cancel')
				and relat.code like "001010%"
				and relat.status = 'enabled'
				and pw.created_time >= '2024-09-01'
				and pw.created_time <= '2024-09-30') pIn
            )
            as percentage
from
	(
	select
		pw.*
	from
		pfm_work pw
	left join pty_relationship relat on
		relat.party_id_from = pw.org_id
		and relat.role_type_from = 'company'
		and relat.relationship_type = 'organizational_structure'
	where
		1 = 1
		and pw.`type` = "trigger"
		and pw.business_type = "patrol"
		and pw.status not in ('retract', 'nullify', 'cancel')
			and relat.code like "001010%"
			and relat.status = 'enabled'
			and pw.created_time >= '2024-09-01'
			and pw.created_time <= '2024-09-30'
        ) t1
        where 1 = 1
	and t1.status = 'completed'
