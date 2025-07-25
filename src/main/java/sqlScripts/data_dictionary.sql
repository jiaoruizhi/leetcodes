


-- data_dictionary


select t1.element_code, count(t1.id) from ref_reference t1
where 1 = 1
and t1.element_code like "%special%%"
group by t1.element_code 
;

select t1.* from ref_reference t1
where 1 = 1
and t1.element_code = "workType" -- assignmentPersonByRoleNameAndGroupName
-- and t1.id  = 111001049
order by t1.id asc
;

--------------------------

-- 危险作业任务状态
select t1.element_code, t1.* from ref_reference t1
where 1 = 1
and t1.element_code like "%workType%"
and t1.data_name like "%危险%"
;



-- 危险作业任务状态
select * from ref_reference t1
where 1 = 1
and t1.element_code = "riskIdentificationResult"
;




-- hotJobType
-- riskIdentificationResult

-- 生产事件动态

select t1.* from ref_reference t1
where 1 = 1
and t1.element_code = "riskIdentificationResult"
and t1.id = 3251
order by t1.data_sequence asc
;


select t1.* from ref_reference t1
where 1 = 1
and t1.element_code = "sysPushConfigType"
-- and t1.id = 3251
order by t1.data_sequence asc
;


select t1.* from ref_reference t1
where 1 = 1
and t1.element_code = "checkCategory"
-- and t1.id = 3251
order by t1.data_sequence asc
;








-- deviceStatus

select t1.data_value, data_code from ref_reference t1
where 1 = 1
and t1.element_code = "deviceStatus"
-- and t1.id = 3251
order by t1.data_sequence asc
;













