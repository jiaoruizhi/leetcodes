select
	*
from
	sch_scheduling_arrangement t1
where
	t1.owner_id = 27009365

	select
	    t1.*,
		t1.id,
		t1.org_id,
		t1.type,
		t1.business_type,
		case
			when t1.name in ('日检', '月检' , '周检') then t1.name
			else '其他'
		end as name
	from
		pfm_work t1
	where
		1 = 1
-- 		and t1.org_id = 27009365
		and t1.type = 'special'