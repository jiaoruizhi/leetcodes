

describe ins_issue;



select t1.zhongyuan_id, t1.unique_code, t1.status, t1.* from ins_inspection t1
where t1.id = 898000016;


select t1.zhongyuan_push_flag, t1.zhongyuan_id, t1.status, t1.* from ins_issue t1
where t1.inspection_id = 898000016
;

select t1.zhongyuan_id, t1.* from ins_inspection_item t1
where 1 = 1
and t1.inspection_id = 898000016;

select t1.zhongyuan_id, t1.* from ins_rectification t1
where 1 = 1
and t1.issue_id = 833000046;



select t1.* from ins_issue t1
left join ins_inspection t2 on t1.inspection_id = t2.id 
where 1 = 1 and t1.zhongyuan_id is null 
and t1.inspection_id = 898000014 and t2.status = 'completed' order by t1.id desc 


select t1.* from ins_issue t1 left join ins_inspection t2 on t1.inspection_id = t2.id 
where 1 = 1 
and t1.zhongyuan_id is null 
and t1.inspection_id = 3781 
-- and t2.status = 'completed' 
order by t1.id desc


select * from ins_inspection_issue t1 order by t1.issue_id desc
