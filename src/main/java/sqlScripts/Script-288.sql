


select t1.zhongyuan_id, t1.*
-- from ins_issue t1
from ins_inspection t1
where 1 = 1
and t1.zhongyuan_id is not null
order by t1.id desc

select t1.zhongyuan_id, t1.id from ins_inspection_item t1
where 1 = 1
and t1.inspection_id = 3779;

update ins_issue t1 set t1.zhongyuan_id = null;
update ins_inspection t1 set t1.zhongyuan_id = null;




select t2.* from log_request t2
where 1 = 1
and t2.url like '%/api/exterior/issue/issue/createForExternal%'
-- and t2.request_time > '2024-10-30 17:05:14'
and t2.status = '成功'
order by t2.id desc
;


select t1.document_id, t1.* from ins_issue t1
where 1 = 1
-- and t1.zhongyuan_id is not null 
and t1.document_id is not null;
;




select t1.* from pty_group t1
where 1 = 1
and t1.id = 27009123;







describe ins_issue;

select * from ins_issue t1
where t1.id = 3945;
