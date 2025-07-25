



select t1.form_id , t1.previous_date , t1 .* from rsk_safety_check t1
order by t1.id desc

10934,32010


select t1.form_id , t1 .* from pfm_work t1
order by t1.id desc

select * from dev_inspection_form;

select t1.work_id, t1.check_person_ids, t1 .* from dev_inspection_form t1
where 1 = 1
and t1.safety_check_id = 15
order by t1.id desc











