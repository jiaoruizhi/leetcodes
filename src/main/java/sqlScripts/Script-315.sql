



select t1.zhongyuan_id, t1.* from ins_rectification t1
left join ins_issue t2 on t1.issue_id = t2.id 
where 1 = 1
and t2.status = 'completed'
and t1.zhongyuan_id is null



