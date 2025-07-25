select
	t1.org_id,
	t1.type,
	t1.business_type,
	t1.name,
	case
		when t1.name is not null then t1.name
		else '其他'
	end as name
-- 	count(t1.id) as countValue
from
	pfm_work t1
where
	1 = 1
	and t1.org_id = 27009123
-- 	and t1.type = 'temporary'
-- 	and t1.business_type = 'patrol'
-- group by
-- 	t1.org_id,
-- 	t1.type,
-- 	t1.name ; 