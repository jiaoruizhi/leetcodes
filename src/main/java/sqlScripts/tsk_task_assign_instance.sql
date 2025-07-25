

-- tsk_task_assign_instance



select * from tsk_task_assign_instance t1 where id = 1793250
order by t1.id desc
;


select
	t1.id,
	t1.task_id,
	t3.id as workId,
	t1.status,
	ref.data_name as statusName,
	t1.approve_date,
	t1.forwarder,
	t1.forward_date,
	t1.feedback_date,
	t1.release_date,
	t1.feedback_person,
	t1.feedback_content,
	t1.document_id,
	t1.feedback_document_id,
	t1.feedback_picture_id,
	t1.org_id,
	t2.title,
	t2.type,
	t2.feedback_mark,
	t2.end_date,
	t2.content,
	t2.receive_type,
	pty1.name as 'releaseGroupName',
	pty2.name as 'releaserName',
	pty3.name as 'receiverName',
	pty4.name as 'feedbackPersonName',
	relat.code as relationshipCode,
	pty5.name as departmentName
from
	tsk_task_assign_instance t1
left join tsk_task_assign t2 on
	t2.id = t1.task_id
left join work_center t3 on
	t3.business_key = t1.id
	and t3.business_type = 'work_task'
left join pty_party pty1 on
	pty1.id = t1.release_group
left join pty_party pty2 on
	pty2.id = t1.releaser
left join pty_party pty3 on
	pty3.id = t1.receiver
left join pty_party pty4 on
	pty4.id = t1.feedback_person
left join pty_relationship relat on
	relat.party_id_from = t1.org_id
	and relat.role_type_from = 'company'
	and relat.relationship_type = 'organizational_structure'
left join pty_party pty5 on
	pty5.id = t1.org_id
left join ref_reference ref on
	ref.element_code = 'taskAssignStatus'
	and ref.data_code = t1.status
where
1 = 1
and t1.id = 1793250
-- and t1.id = 1793248 
