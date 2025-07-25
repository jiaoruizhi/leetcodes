

select * from log_request t1
where t1.url = 'api/exterior/issue/inspection/createForExternal'


select t1.unique_code, t1.* from ins_issue t1
where 1 = 1
order by t1.id desc
;

select t1.unique_code, t1.* from ins_inspection t1
where 1 = 1
-- and t1.id = 1058000014
and t1.unique_code = 'C00044784'
order by t1.id desc
;


select t1.* from ins_inspection_item t1
where 1 = 1
and t1.id = 1011000009
order by t1.id desc
;

-- ISS00003841

select t1.unique_code, t1.* from ins_issue t1
where 1 = 1
and t1.unique_code = 'ISS00003841'
order by t1.id desc
;


select t1.status , t1.*  from ins_rectification t1
where t1.issue_id = 939000038;
