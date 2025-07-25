



select * from ins_issue t1
where t1.id = 123
;




select t1.zhongyuan_id, t1.* from ins_issue t1
where 1 = 1
and t1.id = 3928
-- and t1.zhongyuan_id is not null
;


select t1.zhongyuan_id, t1.* from ins_rectification t1
where 1 = 1
and t1.id = 1543
order by t1.id desc



