

select
	t1.status
from
	ins_issue t1
left join ins_inspection t2 on
	t2.id = t1.inspection_id
left join ins_issue_object obj1 on t1.id = obj1.issue_id
where
	1 = 1
	and ((t2.check_category = 'checkOperation'
		or t2.business_type = 'operation'
		or obj1.business_type = 'operation')
	or ((t2.check_category = 'specialOperationPatrol'
		or t2.business_type = 'specialOperationPatrol')
	and t2.operation_pass_flag = true))
group by t1.status
