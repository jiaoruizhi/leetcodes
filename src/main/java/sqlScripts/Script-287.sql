


select * from ins_issue t1
where 1 = 1
and t1.zhongyuan_id is not null;



select * from ins_inspection t1
where 1 = 1
and t1.zhongyuan_id is not null;



select * from ins_inspection_item t1
where 1 = 1
and t1.zhongyuan_id is not null;


select t1.* from ins_rectification t1
where 1 = 1
-- and t1.zhongyuan_id is not null
order by t1.id desc
;


select * from ins_issue t1
where t1.unique_code = 'ISS00003841';






