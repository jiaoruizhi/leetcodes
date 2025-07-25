



select
	t1.id, t1.type,*
from
	ope_special_operation t1
where
	t1.id in (
	select
		distinct(t1.business_key)
	from
		work_center t1
	left join sf_task_instance sf on
		sf.business_key = t1.business_key
		and sf.business_type = t1.business_type
	left join pty_party t2 on
		t2.id = t1.assigner
	left join pty_party t4 on
		t4.id = t1.releaser
	left join ref_reference t3 on
		t3.element_code = 'workType'
		and t3.data_code = t1.type
	left join pty_relationship relat on
		relat.party_id_from = t1.org_id
	left join ins_issue t5 on
		t5.id = t1.business_key
		and t1.business_type = 'issue'
		and relat.role_type_from = 'company'
		and relat.relationship_type = 'organizational_structure'
	where
		1 = 1
		and t1.object_state = 'enabled'
		and t1.type = 'specialHot'
		and (
            (sf.status = 'completed'
			and sf.approve_time is not null
			and sf.task_user_id in (27064423, 27064551, 27064467)
				and sf.type is null)
		or t1.finish_person_id in (27064423, 27064551, 27064467)
            )
)
order by t1.id asc




