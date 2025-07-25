

select * from pfm_work t1
where 1 = 1
and id = 1098000455
;


select t1.code, t1.name, region.name, region.department_id, t1.*
from ope_operation_location t1
left join ope_operation_region region on region.id =t1.region_id
where 1 = 1
-- and t1.code = 1
and t1.org_id = 27009365
and t1.name = "#7北"
-- and region_id = 1001
-- and t1.name like "6#"
-- and org_id = 27009365
-- and t1.code = "me-xczbs"
;

-- -----------------------  
select
	t1.*
from
	sch_scheduling_arrangement t1
left join sch_scheduling_teams t2 on
	t1.teams_id = t2.id
left join sch_scheduling_classes t3 on
	t1.classes_id = t3.id
where
	1 = 1
	and t2.division_id = 27009377
	and t1.work_date = '2024-08-06'
-- limit 1;