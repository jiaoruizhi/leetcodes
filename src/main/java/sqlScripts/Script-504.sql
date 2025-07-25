select
t1.operation_department_person_id,
t1.ministry_safety_person_id,
t1.*
from ope_special_operation t1
where 1 = 1
and t1.work_no = '2024DH000189'
;




select t3.employee_id, t1.* from pty_person t1
left join pty_party t2 on t1.id = t2.id
left join employee_info t3 on t3.id = t1.id 
where 1 = 1
and t3.employee_id = 'GH00009985'
-- and t2.name like "%蔡庆源%"
-- and t1.id = 753001619
;

-- 820001574
select * from employee_info where id = 808001553;


select * from idm_user
where 1 = 1
and name like "%刘鹏%"
-- and mobile = '18789767576';








