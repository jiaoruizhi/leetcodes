



select t1.id, t1.name, t1.org_id, t1.* from pty_party t1
where t1.id = 27061749;


select t1.unique_code, t1.zhongyuan_id, t1.status, t1.* from ins_inspection t1
where 1 = 1
and t1.zhongyuan_id is not null
and t1.unique_code like '%C00044490'
;

select t1.zhongyuan_id, t1.* from ins_inspection_item t1
where t1.inspection_id = 1012000074;

select t1.zhongyuan_id, t1.* from ins_issue t1
where 1 = 1
-- and t1.inspection_id = 1012000074
and t1.unique_code like '%5252'
;


select * from ins_rectification t1
where 1 = 1
and t1.issue_id = 973000280
;






