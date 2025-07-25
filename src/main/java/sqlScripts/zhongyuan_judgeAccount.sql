


-- zhongyuan  judgeAccount



select t1.id, t1.name, t1.org_id, t2.employee_id from pty_party t1
left join employee_info t2 on t1.id = t2.id
where 1 = 1
and t1.name = '冯毅'
;







select id, code, party_id_from
from  pty_relationship
where party_id_from in(
	select t3.id
	from pty_party t1
    left join employee_info t2 on t1.id = t2.id
    left join pty_party t3 on t3.id = t1.org_id
    where 1 = 1
    and t2.employee_id = 30023172
--     and t1.object_state = 'enabled'
)
and code LIKE '001010%'
;
        
select t1.id, t3.id
from pty_party t1
left join employee_info t2 on t1.id = t2.id
left join pty_party t3 on t3.id = t1.org_id
where t2.employee_id = 30023172
;
        
        
select t1.* from pty_party t1
where 1 = 1
and t1.id = 993001697
;
        
delete from pty_party where id = 993001697;
delete from pty_person where id = 993001697;
delete from employee_info where id = 993001697;
        
        
        
        
        
        
        
        
        
               
               
               