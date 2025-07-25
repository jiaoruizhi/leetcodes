


-- clear_data_of_post


-- 问题 inspection id
-- 1063004331  
-- 1019000015

-- do in zhongyuan
select t1.ganghang_id, t1.id, t1.* from ins_inspection t1
where 1 = 1
and t1.ganghang_id is not null
and check_category = 'self'
;
-- and t1.unique_code = 'C00044784';
-- and t1.id = 1063004331;

select t1.* from ins_inspection_item t1
where 1 = 1
-- and t1.id = 
and t1.inspection_id = 1063004331;

select * from ins_issue t1
where t1.inspection_id = 1063004331;

select t1.ganghang_id, t1.id from ins_rectification t1
where t1.issue_id = 842001114
;



-- do in ganghang
-- ganghang inspection id
-- 898000008
select t1.zhongyuan_id, t1.id from ins_inspection t1
where t1.id = 898000008;
update ins_inspection t1 set t1.zhongyuan_id = null
where t1.id = 898000008;

select t1.zhongyuan_id, t1.id from ins_inspection_item t1
where t1.inspection_id = 898000008;

update ins_inspection_item t1 set t1.zhongyuan_id = null
where t1.inspection_id = 898000008;

select * from ins_issue where inspection_id = 898000008;
update ins_issue t1 set t1.zhongyuan_id = null, t1.zhongyuan_push_flag = null
where t1.inspection_id = 898000008;

select * from ins_rectification t1
where t1.issue_id = 833000036;
update ins_rectification t1 set t1.zhongyuan_id = null
where t1.issue_id = 833000036;



select t1.ganghang_id , t1.*
from ins_issue t1
where 1 = 1
-- and t1.unique_code = 'ISS00003949'
order by t1.id desc limit 5000;


select  t1.* from ins_inspection_item t1
where 1 = 1
and t1.inspect_by = 684001569
-- and t1.id = 756000001
order by t1.id desc limit 50;


select t1.ganghang_id, t1.* from ins_inspection t1
where 1 = 1
-- and t1.id = 779000007
order by t1.id desc limit 50;


select t2.* from log_request t2
where 1 = 1
and t2.url = '/web/external/inspection/createForExternal'
and t2.request_time > '2024-10-30 17:05:14'
order by t2.id desc
;




select t2.name, t1.* from idm_user t1
left join pty_party t2 on t1.person_id = t2.id
where 1= 1
 and t1.id = 413000050
 
 
 
 




