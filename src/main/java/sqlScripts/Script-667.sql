


select t1.previous_time, t1.person_id, t1.* from sche_plan t1
where 1 = 1
-- and t1.person_id = 5547
order by t1.id desc
;


select t1.status, t1.complete_person, t1.complete_time ,
t1.*
from pfm_work t1
where t1.assigner_person = 5547
order by t1.id desc
;



select t1.work_id , t1.* from ins_inspection t1
order by t1.id desc
;



select* from ins_issue t1
order by t1.id desc
;




select * from pty_party t1
where t1.id = 5547
;


