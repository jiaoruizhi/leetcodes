








update rsk_risk t1 set t1.name = replace(t1.name, char(10), ' ') 
where 1 = 1
-- and t1.ganghang_id is not null
and t1.name like CONCAT('%', char(10),'%')
;









