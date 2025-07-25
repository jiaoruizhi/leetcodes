select * from ins_issue ii 
where party_group_id is not null

select * from act_ru_task art 
order by id_ desc
limit 0,10;



select * from sf_task_instance art 
order by id desc
limit 0,10;




select * from idm_user t1
where 1 = 1
and t1.hangbiao_user_id is not null


select check_category from ins_inspection t1
where 1 = 1
group by check_category