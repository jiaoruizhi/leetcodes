select
	tt.classId,
	tt.className,
	tt.trends,
	tt.business_type,
	tt.type,
	tt.org_id,
	tt.department_id,
	count(tt.id) as quantity
from
	(
	select
		log.id,
		log.trends,
		log.business_type,
		t1.type,
		t1.org_id,
		t4.department_id,
		t5.id as classId,
		t5.name as className
	from
		(
		select
			*
		from
			log_request ll
		where
			1 = 1
			and TIMESTAMPDIFF(minute,
			ll.plan_end_time,
			ll.request_time) > 30
			) log
	left join tos_trigger_event t2 on
		t2.id = log.result
	left join pfm_work t1 on
		t1.trigger_event_id = t2.id
	left join ope_operation_location t3 on
		t3.id = t2.berth_id
	left join ope_operation_region t4 on
		t3.region_id = t4.id
	left join sch_scheduling_teams t5 on
		t5.id = t1.teams_id
	where
		1 = 1
-- 		and t1.org_id = 27009365
-- 		and t5.name != '园区分部'
		) tt
group by
	tt.classId ; 