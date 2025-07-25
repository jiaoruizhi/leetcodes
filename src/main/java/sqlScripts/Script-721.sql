


-- 23000006

select * from sch_scheduling_teams t1
where 1 = 1
and t1.name like '服务四班%'



select t1.id, t1.work_date from sch_scheduling_arrangement t1
left join sch_scheduling_arrangement t2 on t1.person_id = t2.person_id and t1.work_date = t2.work_date 
where 1 = 1
and t1.teams_id = 23000006
and t1.work_date >= '2025-03-01'
and t1.id > t2.id
;

delete from sch_scheduling_arrangement tt where tt.id in (
select t1.id from sch_scheduling_arrangement t1
left join sch_scheduling_arrangement t2 on t1.person_id = t2.person_id and t1.work_date = t2.work_date 
where 1 = 1
and t1.teams_id = 23000006
and t1.work_date >= '2025-03-01'
and t1.id > t2.id
)
;




748001552
758001595
758001582

select t1.id, t1.classes_id, t1.teams_id, t1.work_date from sch_scheduling_arrangement t1
where 1 = 1
and t1.person_id = 758001582
-- and t1.teams_id = 23000006
and t1.work_date >= '2025-03-01'
order by t1.work_date 
;





