

-- inspection id
-- 75714
-- 75260

-- 130212
-- 129525

select id, inspection_id from ins_issue where id in (130004,130010);


select t1.id from ins_rectification_task t1
where t1.business_key in (130004,130010);

select * from sf_task_instance t1
where t1.business_key in (130004,130010);

select * from sf_apply_form t1
where t1.business_key in (130004,130010);

select * from ins_rectification t1
where t1.issue_id in (130004,130010);

select * from work_center where business_key in (130004,130010);

select * from work_center where business_key in (130448, 130449);




update ins_inspection set status = 'uncommitted' where id in (75569, 75572);

delete from ins_rectification_task t1
where t1.business_key in (130004,130010);

delete from sf_task_instance t1
where t1.business_key in (130004,130010);

delete from sf_apply_form t1
where t1.business_key in (130004,130010);

delete from ins_rectification t1
where t1.issue_id in (130004,130010);


delete from work_center where business_key in (130004,130010);
delete from work_center where business_key in (103567, 103568, 103569, 103570);














