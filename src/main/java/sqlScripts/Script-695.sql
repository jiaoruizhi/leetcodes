


select * from ins_inspection t1
where 1 = 1
and t1.inspect_time > '2022-01-01'
and t1.inspect_time < '2024-12-31'
and t1.org_id = 27009123
;



select t1.ganghang_id, t1.* from ins_inspection t1
where t1.id = 142000016
;

select t1.* from ins_inspection_item t1
where t1.inspection_id = 142000016
;

select * from ins_inspection_issue t1
where 1 = 1
and t1.inspection_id = 142000016
;


select * from ins_issue t1
where 1 = 1
-- and t1.inspection_id = 142000016
and t1.inspection_item_id = 1017001193
;


