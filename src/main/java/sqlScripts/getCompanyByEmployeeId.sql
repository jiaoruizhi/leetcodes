


select t1.id, t1.name, t1.org_id, t2.mobile, t3.employee_id from pty_party t1
left join pty_person t2 on t1.id = t2.id
left join employee_info t3 on t1.id = t3.id
where 1 = 1
and t1.name = '杨明皓'


-- getCompanyByEmployeeId 


-- 20003114   俞

        select code, party_id_from 
        from pty_relationship
        where party_id_from in (
            select t3.id
            from pty_party t1
            left join employee_info t2 on t1.id = t2.id
            left join pty_party t3 on t3.id = t1.org_id
            where 1 = 1
            and t1.object_state = 'enabled'
            and t2.employee_id = '20003114'
        )
        and code LIKE '001010%'
        ;
        
        
        

            select t1.id, t1.org_id, t3.id
            from pty_party t1
            left join employee_info t2 on t1.id = t2.id
            left join pty_party t3 on t3.id = t1.org_id
            where 1 = 1
            and t1.object_state = 'enabled'
            and t2.employee_id = '20003114'
            
            
            
        
        
      -- 993002858  
        
        
        
        select * from pty_party where id = 993002858;
        select * from pty_person where id = 993002858;
        select * from employee_info where id = 993002858;

        
        
        
        select * from login where employee_id = "20003114"
        
        
        
        select t1.org_id, * from pty_party t1
        left join pty_person t2 on t1.id = t2.id
        left join employee_info t3 on t3.id = t1.id
        where 1 = 1
        and t1.sys_code = 'luan'
        and t3.employee_id = 20003114
        
        
        
        
        
        