



-- pty_person_contact


select
	pp.name ,
	t1.*
from
	pty_person_contact t1
left join pty_party pp on pp.id = t1.person_id 
where
	1 = 1
	and t1.business_type = "patrolPersonPlan"
	-- and t1.business_key = 129
order by
	t1.id desc
;