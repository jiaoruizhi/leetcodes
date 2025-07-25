

-- 


-- 27009093
-- 集装箱
select * from pty_party
where 1 = 1
-- and name like "%新海轮渡%"
-- and id in (27009094, 27009123)
and id = 27009153
-- 集装箱下的两个公司
;

select * from pty_relationship
where 1 = 1
-- and party_id_to = 27009093
and party_id_from = 27009234
;