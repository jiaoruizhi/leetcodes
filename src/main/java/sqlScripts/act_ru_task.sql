

-- act_ru_task


-- f066fb39-44d8-11ef-a238-0255c0a8445e

select * from act_ru_task t1
where 1 = 1
-- and ID_ = "4eb55209-4e5f-11ef-b968-0255c0a82328"
order by t1.CREATE_TIME_ desc

select * from act_ru_identitylink 
where 1 = 1
-- and TASK_ID_ = "f066fb39-44d8-11ef-a238-0255c0a8445e"
and PROC_INST_ID_ = "ee5276c2-43e8-11ef-a238-0255c0a8445e"
;

-- f0626756-44d8-11ef-a238-0255c0a8445e
-- 27061945
select * from act_ru_identitylink 
where 1 = 1
-- and ID_ = "f0626776-44d8-11ef-a238-0255c0a8445e"
-- and TASK_ID_ = "f066fb39-44d8-11ef-a238-0255c0a8445e"
and PROC_INST_ID_ = "ee5276c2-43e8-11ef-a238-0255c0a8445e"
;



-- {
--     "businessKey": 654000001,
--     "businessType": "specialHot",
--     "procInstanceId": "082e3da3-4a28-11ef-b01c-0255c0a8445e"
-- }


select * from act_ru_task
where PROC_INST_ID_ = "082e3da3-4a28-11ef-b01c-0255c0a8445e"
；
select * from act_ru_identitylink 
where 1 = 1
-- and ID_ = "f0626776-44d8-11ef-a238-0255c0a8445e"
-- and TASK_ID_ = "f066fb39-44d8-11ef-a238-0255c0a8445e"
and PROC_INST_ID_ = "082e3da3-4a28-11ef-b01c-0255c0a8445e"
;




-- findTaskByProcessInstanceId

select
	t1.id ,
	t1.approve_time ,
	t1.status ,
	t1.task_user_id ,
	case
		when t5.name is not null then t5.name
		when t4.name is not null then t4.name
		else t3.name
	end as name,
	t1.task_name ,
	t1.task_code,
	t1.previous_task_user_id ,
	t1.business_data ,
	t1.type ,
	t1.description ,
	t1.PRO_INSTANCE_ID,
	act.type_ as actType,
	act.USER_ID_ as actUserId,
	t1.task_definition_key,
	t1.document_id,
	t1.sign_document_id,
	t1.pic_document_id,
	t1.form_key,
	t1.business_key,
	tion.superior
from
	sf_task_instance t1
left join pty_person t2 on
	t1.task_user_id = t2.id
left join pty_party t3 on
	t2.id = t3.id
left join ACT_RU_IDENTITYLINK act on
	t1.task_code = act.TASK_ID_
left join pty_party t4 on
	t4.id = act.USER_ID_
left join ACT_RU_TASK tas on
	tas.ID_ = t1.task_code
left join pty_party t5 on
	t5.id = tas.ASSIGNEE_
left join ins_issue ins on
	ins.id = t1.business_key
	and t1.business_type = 'issue'
left join ins_inspection tion on
	tion.id = ins.inspection_id
where
	1 = 1
	and t1.business_key = 654000001
	and t1.business_type = "specialHot"
	and t1.pro_instance_id = "082e3da3-4a28-11ef-b01c-0255c0a8445e"
order by
	if(isnull(t1.approve_time),
	0,
	1) ,
	t1.id desc
;











