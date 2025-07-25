

select * from pty_party t1
where t1.id = 767001569

select * from login where mobile = '15595734871'


select * from idm_user t1
where t1.mobile = '15595734871'


select * from pty_relationship t1
where 1 = 1
and t1.relationship_type = 'organizational_structure'
-- and t1.party_id_to = 27009015
and t1.party_id_from = 767001569
;



        select code from  pty_relationship where party_id_from in(  
        select t3.id from pty_party t1
                 left join employee_info t2 on t1.id = t2.id
                left join pty_party t3 on t3.id = t1.org_id
              where t2.employee_id = '30072579'
              ) and code LIKE '001010%'
              
              
              
              
              
              	
30072579

       select t2.* from pty_party t1
                 left join employee_info t2 on t1.id = t2.id
                left join pty_party t3 on t3.id = t1.org_id
                 left join pty_person t4 on t1.id = t4.id
                 where t4.mobile = '15595734871'

