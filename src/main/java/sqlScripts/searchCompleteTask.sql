-- gm2 searchCompleteTask





select
	*
from
	(
        (
	select
		t1.id,
		t1.NAME,
		t1.type,
		t1.business_key,
		t1.business_type,
		t1.releaser,
		t1.release_date,
		t1.STATUS,
		t1.org_id,
		t1.task_id,
		t2.NAME as assignerName,
		t3.data_name as typeName,
		t1.due_date,
		t4.feedback_date,
		t1.complete_date,
		ref.data_name as businessTypeName,
		case
			when t1.last_updated_time is not null then t1.last_updated_time
			else t1.created_time
		end as approveTime
	from
		work_center t1
	left join work_center_link wcl on
		wcl.work_center_id = t1.id
	left join pty_party t2 on
		t2.id = t1.assigner
	left join ref_reference t3 on
		t3.element_code = 'workType'
		and t3.data_code = t1.type
	left join tsk_task_assign t4 on
		t4.id = t1.business_key
	left join ref_reference ref on
		ref.element_code = 'workBusinessType'
		and ref.data_code = t1.business_type
	where
		1 = 1
		and t1.object_state = 'enabled'
		and t1.status = 'complete'
		and t1.business_type != 'rectification'
		and (
            t1.assigner = 24823
			or
            wcl.person_id = 24823
            )
	order by
		t1.complete_date desc
        )
union all
        (
select
	t1.id,
	t1.NAME,
	t1.type,
	t1.business_key,
	t1.business_type,
	t1.releaser,
	t1.release_date,
	tsk1.STATUS,
	t1.org_id,
	t1.task_id,
	t2.NAME as assignerName,
	case
		when tsk1.task_name is null then
        t3.data_name
		else tsk1.task_name
	end as typeName,
	t1.due_date,
	null as feedbackDate,
	t1.complete_date,
	ref.data_name as businessTypeName,
	tsk1.approve_time as approveTime
from
	work_center t1
left join ins_rectification_task ins1 on
	(
            (t1.business_key = ins1.id
		and t1.type = 'issueReform')
	or (t1.business_key = ins1.business_key
		and t1.type = 'issueReformOffline')
        )
left join (
	select
		STATUS,
		task_name,
		business_key,
		task_user_id,
		approve_time
	from
		sf_task_instance
	where
		1 = 1
		and business_type = 'issue'
		and task_code not in ( 'start', 'end' )
			and object_state = 'enabled'
			and STATUS = 'completed'
			and task_user_id = 24823
        ) tsk1 on
	ins1.business_key = tsk1.business_key
left join pty_party t2 on
	t2.id = t1.assigner
left join ref_reference t3 on
	t3.element_code = 'workType'
	and t3.data_code = t1.type
left join ref_reference ref on
	ref.element_code = 'workBusinessType'
	and ref.data_code = t1.business_type
where
	t1.object_state = 'enabled'
	and t1.assigner = 24823
order by
	t1.complete_date desc
        )
union all
        (
select
        t1.id,
        t1.NAME,
        t1.type,
        t1.business_key,
        t1.business_type,
        t1.releaser,
        t1.release_date,
        tsk1.STATUS,
        t1.org_id,
        t1.task_id,
        t2.NAME as assignerName,
        case
	when tsk1.task_name is null then
        t3.data_name
	else tsk1.task_name
end as typeName,
        t1.due_date,
        null as feedbackDate,
        t1.complete_date,
        ref.data_name as businessTypeName,
        tsk1.approve_time as approveTime
from
work_center t1
left join ins_rectification_task ins1 on
(
        (t1.business_key = ins1.id
	and t1.type = 'issueReform')
or (t1.business_key = ins1.business_key
	and t1.type = 'issueReformOffline')
        )
left join (
select
	STATUS,
	task_name,
	business_key,
	task_user_id,
	approve_time
from
	sf_task_instance
where
	1 = 1
	and business_type = 'issue'
	and task_code not in ( 'start', 'end' )
		and object_state = 'enabled'
		and STATUS = 'completed'
		and task_user_id = 24823
        ) tsk1 on
ins1.business_key = tsk1.business_key
left join pty_party t2 on
t2.id = t1.assigner
left join ref_reference t3 on
t3.element_code = 'workType'
and t3.data_code = t1.type
left join ref_reference ref on
ref.element_code = 'workBusinessType'
and ref.data_code = t1.business_type
where
t1.object_state = 'enabled'
and tsk1.approve_time is not null
and t1.assigner is null
order by
t1.complete_date desc
        )
        ) as a
order by
	a.approveTime desc
limit 60,
30
-- part 1
        
        
        select
	t1.id,
	t1.NAME,
	t1.type,
	t1.business_key,
	t1.business_type,
	t1.releaser,
	t1.release_date,
	t1.STATUS,
	t1.org_id,
	t1.task_id,
	t2.NAME as assignerName,
	t3.data_name as typeName,
	t1.due_date,
	t4.feedback_date,
	t1.complete_date,
	ref.data_name as businessTypeName,
	case
		when t1.last_updated_time is not null then t1.last_updated_time
		else t1.created_time
	end as approveTime
from
	work_center t1
left join work_center_link wcl on
	wcl.work_center_id = t1.id
left join pty_party t2 on
	t2.id = t1.assigner
left join ref_reference t3 on
	t3.element_code = 'workType'
	and t3.data_code = t1.type
left join tsk_task_assign t4 on
	t4.id = t1.business_key
left join ref_reference ref on
	ref.element_code = 'workBusinessType'
	and ref.data_code = t1.business_type
where
	1 = 1
	and t1.object_state = 'enabled'
	and t1.status = 'complete'
	and t1.business_type != 'rectification'
	and t1.org_id = 1
	and (
            t1.assigner = 24823
		or
            wcl.person_id = 24823
            )
order by
	t1.complete_date desc
limit 1,
30;

create index idx_task_user_id on
sf_task_instance (task_user_id);
-- part 2
-- tsk1.task_user_id = 5041 or t1.assigner = 5041 
        
       select
	t1.id,
	t1.assigner ,
	tsk1.task_user_id,
	t1.NAME,
	t1.type,
	t1.business_key,
	t1.business_type,
	t1.releaser,
	t1.release_date,
	tsk1.STATUS,
	t1.org_id,
	t1.task_id,
	t2.NAME as assignerName,
	case
		when tsk1.task_name is null then
        t3.data_name
		else tsk1.task_name
	end as typeName,
	t1.due_date,
	null as feedbackDate,
	t1.complete_date,
	ref.data_name as businessTypeName,
	tsk1.approve_time as approveTime
from
	work_center t1
left join ins_rectification_task ins1 on
	(
            (t1.business_key = ins1.id
		and t1.type = 'issueReform')
	or (t1.business_key = ins1.business_key
		and t1.type = 'issueReformOffline')
        )
left join (
	select
		id,
		STATUS,
		task_name,
		business_key,
		task_user_id,
		approve_time
	from
		sf_task_instance
	where
		1 = 1
		and business_type = 'issue'
		and task_code not in ( 'start', 'end' )
			and object_state = 'enabled'
			and STATUS = 'completed'
			and task_user_id = 24823
        ) tsk1 on
	ins1.business_key = tsk1.business_key
left join pty_party t2 on
	t2.id = t1.assigner
left join ref_reference t3 on
	t3.element_code = 'workType'
	and t3.data_code = t1.type
left join ref_reference ref on
	ref.element_code = 'workBusinessType'
	and ref.data_code = t1.business_type
where
	t1.object_state = 'enabled'
	and (t1.assigner = 24823
		or tsk1.task_user_id = 24823)
order by
	t1.complete_date desc
limit 1,
30
        ;

show index
from
sf_task_instance;

select
	*
from
	work_center
where
	business_key = 12841
order by
	id desc
       
       
            select
	id,
	STATUS,
	task_name,
	business_key,
	task_user_id,
	approve_time
from
	sf_task_instance
where
	1 = 1
	and business_type = 'issue'
	and task_code not in ( 'start', 'end' )
	and object_state = 'enabled'
	and STATUS = 'completed'
	and task_user_id = 24823