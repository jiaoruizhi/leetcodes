

-- ganghang id = 
select t1.ganghang_id, t1.id from ins_issue t1
where 1 = 1
and t1.id = 123;


-- ganghang id = 1019000015
select t1.ganghang_id, t1.id, t1.business_key, t1.business_type from ins_inspection t1
where 1 = 1
and t1.id = 898000017;


delete from ins_inspection_item t1 
where t1.inspection_id = 123
;

select * from ins_issue t1
where 1 = 1
and t1.ganghang_id is not null;

delete from ins_issue t1 where t1.ganghang_id is not null;
delete from ins_inspection t1 where t1.ganghang_id is not null;

select * from ins_inspection t1
where 1 = 1
and t1.ganghang_id is not null;


delete from ins_issue where ganghang_id is not null;


delete from ins_inspection where ganghang_id is not null;




select t2.* from log_request t2
where 1 = 1
and t2.url = '/web/external/issue/createForExternal'
and t2.request_time > '2024-10-30 17:05:14'
order by t2.id desc
;