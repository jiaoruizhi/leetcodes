


-- zhongyuan uat

select t1.ganghang_id, t1.unique_code, t1.document_id, t1.* from ins_issue t1
where 1 = 1
and t1.ganghang_id is not null
-- and t1.inspection_id is not null
;


select t1.ganghang_id, t1.unique_code, t1.document_id, t1.* from ins_inspection t1
where 1 = 1
and t1.id = 898000528
-- and t1.unique_code = 'C00076876'
and t1.ganghang_id is not null
-- and t1.inspection_id is not null
;



select * from ins_inspection t1
where 1= 1 
and t1.ganghang_id is not null;



select count(t2.result) from log_request t2
where 1 = 1
and t2.url = '/web/external/issue/createForExternal'
and t2.request_time > '2024-10-30 17:05:14'
order by t2.id desc
;


select t1.unique_code, t1.id, t1.business_key, t1.business_type, t1.check_category, t1.picture_document_id from ins_inspection t1
where 1 = 1
-- and t1.id = 877000094
and t1.ganghang_id is not null 
and t1.unique_code = 'C00044784'
-- and t1.check_category = 'company'
-- and t1.
;


select * from pty_group where struct_code = '20010229';




select t1.suffix from doc_document_file t1
group by t1.suffix 
-- where t1.id = 866017641
;







