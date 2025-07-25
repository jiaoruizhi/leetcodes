

-- 27062080

select * from work_center t1
where t1.id in (888000111,888000113,888000114,888000115);


select t1.pro_instance_id , t1.* from sf_task_instance t1
where 1= 1
and t1.status = 'approving'
and t1.task_name = '安操主任复核任务'
and t1.org_id = 27009418
and t1.business_type = 'ope_inspection_work'
order by t1.id desc


-- 27062080
select t1.ASSIGNEE_ , t1.* from act_ru_task t1
where 1 = 1
and t1.PROC_INST_ID_  = "68b0ee75-8b68-11ef-a12a-0255c0a8443c"


select t1.ASSIGNEE_ , t1.* from act_ru_task t1
where 1 = 1
and t1.PROC_INST_ID_ in
(
''
''
29f9057f-8b68-11ef-a12a-0255c0a8443c
42da5895-8b68-11ef-a12a-0255c0a8443c
52d6e805-8b68-11ef-a12a-0255c0a8443c
68b0ee75-8b68-11ef-a12a-0255c0a8443c
''
);