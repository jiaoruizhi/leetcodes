


-- 93190

-- inspection id 51144
-- I00128708
-- 93190
-- I00131403、I00131407

-- 91720

select * from ins_issue t1 where t1.code = 'I00131407';

-- 90624

select * from sf_task_instance t1
where t1.business_type = 'issue' and t1.status = 'completed' and t1.approve_time is null;




select * from sf_task_instance t1
where 1= 1
and t1.business_type = 'issue'
and t1.status = 'completed'
and t1.approve_time is null
and t1.business_key in (
21778,
21779
);

update sf_task_instance t1 set t1.approve_time = t1.last_updated_time
where 1= 1
and t1.business_type = 'issue'
and t1.status = 'completed'
and t1.approve_time is null
and t1.business_key in (
21778,
21779
);



select * from work_center t1 where t1.business_type = 'issue' and t1.business_key in (93990);



select * from ins_rectification_task t1 where t1.business_type = 'issue' and t1.business_key in (87272);


select * from sf_task_instance t1
where 1= 1
and t1.business_type = 'issue'
and t1.status = 'completed'
and t1.approve_time is null
;

select * from sf_task_instance t1 where t1.business_key in (
1328
);



select * from sf_task_instance t1
where 1= 1
and t1.business_type = 'issue'
and t1.status = 'completed' and t1.approve_time is null
and t1.business_key in (92682);



update sf_task_instance t1
left join ins_issue t2 on t2.id = t1.business_key 
left join ins_inspection t3 on t2.inspection_id = t3.id
set t1.approve_time = ifnull(t1.last_updated_time, t1.created_time)
where 1 = 1
and t1.business_type = 'issue'
and t1.status = 'completed'
and t1.approve_time is null
and t3.id = 51144
;








select t1.id from sf_task_instance t1
left join sf_task_instance t2 on t1.business_type = t2.business_type
and t1.business_key = t2.business_key
and t1.task_name = t2.task_name 
where 1 = 1
and t1.business_type = 'issue'
and t1.id > t2.id
and t1.business_key in (
93131,
93135,
93140,
93141,
93142,
93144,
93147,
93150,
93162,
93174,
93189,
93190
)
;


delete from ins_rectification_task t1
left join ins_rectification_task t2 on t1.business_type = t2.business_type and t1.business_key = t2.business_key
where 1 = 1
and t1.id > t2.id
and t1.business_key in (
93131,
93135,
93140,
93141,
93142,
93144,
93147,
93150,
93162,
93174,
93189,
93190
)
;






select t1.id from ins_rectification t1
left join ins_rectification t2 on t1.issue_id = t2.issue_id
where 1 = 1
and t1.id > t2.id
and t1.issue_id in (
93131,
93135,
93140,
93141,
93142,
93144,
93147,
93150,
93162,
93174,
93189,
93190
);








delete from sf_task_instance 
where id in (
select t1.id from sf_task_instance t1
left join sf_task_instance t2 on t1.business_type = t2.business_type
and t1.business_key = t2.business_key
and t1.task_name = t2.task_name 
where 1 = 1
and t1.business_type = 'issue'
and t1.id > t2.id
and t1.business_key in (
93131,
93135,
93140,
93141,
93142,
93144,
93147,
93150,
93162,
93174,
93189,
93190
));
