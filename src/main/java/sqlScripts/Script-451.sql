


select * from log_request t1
where 1 = 1
and t1.url like '%safety/api/exterior/operation/specialOperation/createForExternal%'
order by t1.id desc ;





select t1.operation_department_person_id , t1.job_end_person_id, t1.* from ope_special_operation t1
where 1 = 1
and t1.apply_type = 'online'
and t1.work_no = '2024DH000189'


-- 744001553
-- GH00010011
select * from employee_info t1
where 1 = 1
-- and t1.id = 744001553
and t1.employee_id = 'GH00009985'
;

select t1.* from pty_party t1
where 1 = 1
-- and t1.id = 744001553
and t1.name like '%刘鹏'
;

select t1.* from pty_person t1
where 1 = 1
and t1.id = 744001553
-- and t1.name like '%刘鹏'
;


