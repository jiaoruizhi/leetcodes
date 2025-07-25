select *
from
	(
	select
		t1.*
	from
		ACT_RU_TASK t1
	left join ACT_RU_IDENTITYLINK t2 on
		t1.ID_ = t2.TASK_ID_
	where
		t1.ASSIGNEE_ = 709001552
		or (( t1.ASSIGNEE_ is null
			or t1.ASSIGNEE_ = '' )
		and ( t2.USER_ID_ = 709001552))
		) act
left join sf_task_instance sf on
	sf.task_code = act.ID_
	and sf.pro_instance_id = act.PROC_INST_ID_
left join work_center t1 on
	sf.business_key = t1.business_key
	and sf.business_type = t1.business_type
left join pty_party t2 on
	t2.id = t1.assigner
left join pty_party t4 on
	t4.id = t1.releaser
-- left join pty_party pty2 on
-- 	(pty2.id = t4.org_id
-- 		or (t4.id is null
-- 			and pty2.id = t1.org_id))
	 left join pty_party pty2 on pty2.id = t4.org_id or pty2.id = t1.org_id
left join ref_reference t3 on
	t3.element_code = 'workType'
	and t3.data_code = t1.type
left join ins_issue t5 on
	t5.id = t1.business_key
	and t1.business_type = 'issue'
left join pty_relationship relat on
	relat.party_id_from = t1.org_id
	and relat.role_type_from = 'company'
	and relat.relationship_type = 'organizational_structure'
where
	1 = 1
-- 	and t1.type != 'responsibility'
-- 	and t1.object_state = 'enabled'
group by
	t1.id
order by
	t1.id desc
