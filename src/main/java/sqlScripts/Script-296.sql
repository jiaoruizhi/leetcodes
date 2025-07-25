

-- ganghang



select t1.zhongyuan_id, t1.unique_code, t1.status, t1.* from ins_inspection t1
where t1.id = 898000012;


select t1.zhongyuan_push_flag, t1.zhongyuan_id, t1.status, t1.* from ins_issue t1
where t1.inspection_id = 898000012
;

select t1.zhongyuan_id, t1.* from ins_inspection_item t1
where 1 = 1
and t1.inspection_id = 898000012;



