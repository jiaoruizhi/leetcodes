







select * from ins_inspection t1
where 1 = 1
-- and t1.id = 948000250
and t1.zhongyuan_id = 142000016
;

select * from ins_issue t1
where t1.inspection_id = 948000250;
