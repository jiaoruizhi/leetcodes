


select * from rsk_risk t1


select t1.id, t1.name, t2.name, t2.id from rsk_risk_unit t1
left join rsk_risk t2 on t1.risk_id = t2.id


select t1.* from rsk_risk_unit t1


-- 		work.proc_instance_id as procInstanceId,
-- 		work.business_type as taskBusinessType,
-- 		work.task_id as taskId,
-- 		sft.task_name as taskName,
-- 		group_concat(distinct sft.task_user_id) as taskUserId,
-- 		group_concat(distinct act.USER_ID_) as actUserId,
-- 		sft.form_key as formKey,