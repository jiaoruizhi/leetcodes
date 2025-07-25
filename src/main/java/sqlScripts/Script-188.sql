select * from pro_deployment 
where 1 = 1
and org_id = 27009365
and process_key = "report_reform"
-- and process_key = "company_reform"
order by created_time desc


delete from pro_deployment where id = 39000023;



select* from sf_task_instance t1
order by t1.id desc

select * from act_ru_task t1
order by t1.CREATE_TIME_ desc

select * from act_ru_task t1
where 1 = 1
and t1.ID_ = ""
order by t1.CREATE_TIME_ desc




select * from ins_issue t1
where 1 = 1
and t1.org_id = 27009365
order by t1.id  desc



925000058	1012000107	969000422

delete from ins_inspection_item where id in (969000422);
delete from ins_inspection where id in (1012000107);
delete from ins_issue where id in (925000058);



select * from work_center t1
where 1 = 1
order by t1.id  desc

delete from work_center where business_key in (925000058, 925000053);










