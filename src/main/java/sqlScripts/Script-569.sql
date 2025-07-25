









select t1.org_id, t1.* from ins_inspection t1
where 1 = 1
and t1.id = 1124000160
-- and t1.unique_code = 'GHC00052030'
;

1002000055


select * from ins_issue t1
where t1.id = 1002000059



select * from sf_task_instance t1
where t1.business_key = 1002000059
;

select * from work_center t1
where t1.business_key = 1002000059
;
