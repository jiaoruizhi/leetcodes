


select * from company_info ci 



select * from pty_group t1
where 1 = 1
and t1.struct_code is null
-- and t1.`type` = 'department'



select t1.* from pty_party t1
left join pty_group t2 on t1.id = t2.id
where 1 = 1
and t1.`type` = 'department'
and t2.struct_code is null
          and t1.org_id in (
            select party_id_from from pty_relationship where code like '001010%'  and role_type_from = 'company'
        )
        
        
        
                select
            t1.*
        from pty_relationship t1
        where 1 = 1
            and t1.party_id_from in (
            	select p1.id from pty_party p1
            	where 1 = 1
--             	and p1.zhongyuan_id is not null
            	and p1.`type` = 'department'
            )
        
        

        
        
        
            select
            t2.*,
            t1.name,
            t1.type,
            t1.struct_type,
            t1.zhongyuan_id
        from pty_party t1
        left join pty_group t2 on t1.id = t2.id
        where 1 = 1
          and t1.`type` = 'department'
          and t2.struct_code is null
          and t1.org_id in (
            select party_id_from from pty_relationship where code like '001010%'  and role_type_from = 'company'
        )
        ;    
        
       
       
       
       
       
       
       
       
       
select
	t1.*
from
	pty_relationship t1
where 1 = 1
-- and t1.role_type_from <> 'department'
group by t1.role_type_to 
        ;