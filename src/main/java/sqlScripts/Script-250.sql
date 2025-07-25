

select * from login t1
where t1.mobile = 19862728800



select * from login t1
where t1.mobile = 13976801888

select * from ins_issue t1
where 1 = 1
and t1.id = 3817
and t1.org_id = 27009365
order by t1.id desc

select
    t1.rectify_people_id ,
	t2.* 
from
	ins_issue t1
left join ins_inspection t2 on
	t2.id = t1.inspection_id
left join ins_issue_object obj1 on
	t1.id = obj1.issue_id
where
	1 = 1
	and t1.id = 3827
	and t1.org_id = 27009365
	and ((t2.check_category = 'checkOperation'
		or t2.business_type = 'operation'
		or obj1.business_type = 'operation')
	or ((t2.check_category = 'specialOperationPatrol'
		or t2.business_type = 'specialOperationPatrol')
-- 	and t2.operation_pass_flag = true
	))
	
	
	-- http://localhost:8000/ganghang/api/api/web/issue/inspectionItem/createInspectionItem

	select t1.id, t2.check_category, t2.* from ins_issue t1
	left join ins_inspection t2 on
	t2.id = t1.inspection_id
	where t1.inspection_id = 3593
	
	
	select t1.*, t1.ins from pfm_work t1
	order by t1.id desc
1799876

select ii.operation_pass_flag from ins_inspection ii where ii.work_id = 1799876