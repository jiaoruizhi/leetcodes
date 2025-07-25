
-- 153

select t1.special_patrol_category, t1.previous_time, t1.* from sche_plan t1
where t1.id = 153
;

select t1.plan_id, t1.* from pfm_work t1
where 1 = 1
and t1.id = 1806169
;


select t4.special_patrol_category, t1.* from ins_issue t1
left join ins_inspection t2 on t1.inspection_id = t2.id 
left join pfm_work t3 on t2.work_id = t3.id 
left join sche_plan t4 on t4.id = t3.plan_id 
where 1 = 1
and t1.id = 4039
-- and t4.special_patrol_category = 'month'
;



select t1.plan_id, t1.business_key, t1.work_id, t1.* from ins_inspection t1
where 1 = 1
and t1.id = 3938
;



