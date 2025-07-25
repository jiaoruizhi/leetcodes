
-- "054ba70a-b5fa-11ef-8d77-fa163ef143ee"

-- "57268c4a-b5fa-11ef-8d77-fa163ef143ee"



select * from sf_task_instance t1
where t1.business_key = 61894
and t1.business_type = 'rectification'
;



select * from act_ru_task t1
where t1.ID_ = '57268c4a-b5fa-11ef-8d77-fa163ef143ee'
;



        select t1.approve_time,t1.`status`,t1.task_user_id,t2.name,t3.name as previousUserName, t1.description,t1.task_code,t1.task_name,t1.previous_task_user_id  ,
        t1.business_data,t1.description,t1.type,t1.document_id,t1.result
        from sf_task_instance t1
        left join pty_party t2 on t2.id = t1.task_user_id
        left join pty_party t3 on t3.id = t1.previous_task_user_id
        where  t1.business_key = 77998
        and t1.business_type = 'issue'
        ORDER BY t1.approve_time IS NULL , t1.approve_time, t1.id ,t1.task_code desc;
        
       
       
       
       
       
       
       
       