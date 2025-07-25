

select t1.berth_id , t1.* from tos_trigger_event t1
where t1.id = 89000077


-- 1000076

select region.department_id , t1.name ,region.name ,t1.*
from ope_operation_location t1
left join ope_operation_region region on region.id =t1.region_id
where t1.id = 1000076

-- 27009377

select
	t3.start_time ,
	t3.end_time ,
	t2.id,
	t2.*
from
	sch_scheduling_arrangement t1
left join sch_scheduling_teams t2 on
	t1.teams_id = t2.id
left join sch_scheduling_classes t3 on
	t1.classes_id = t3.id
where
	t2.division_id = 27009377
	and t1.work_date = '2024-08-29'
-- 	and t3.start_time <= '13:03:00'
-- 	and t3.end_time >= '13:03:00'
	-- 	limit 1;
	
	
	-- 6000004
	
	
	
	
	
select
t3.id,
t3.start_time ,
t3.end_time ,
	t2.*
from
	sch_scheduling_arrangement t1
left join sch_scheduling_teams t2 on
	t1.teams_id = t2.id
left join sch_scheduling_classes t3 on
	t1.classes_id = t3.id
where
	t2.division_id = 27009377
	and t1.work_date = '2024-08-29'
	and t3.start_time <= '13:03:00'
	and t3.end_time >= '13:03:00'
limit 1;