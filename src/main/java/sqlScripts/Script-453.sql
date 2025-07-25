


select * from log_request t1
where 1 = 1
order by t1.id desc ;





-- 744001579
-- GH00010011
select * from idm_user t1
where 1 = 1
-- and t1.employee_id = 'GH00009985'
and t1.name like '刘鹏'
;

-- 744001579
-- GH00010011
select * from employee_info t1
where t1.employee_id = '08020348'
;


select t1.* from pty_party t1
where t1.id = 27010746
;









