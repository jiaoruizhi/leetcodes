
select * from log_request t1
where 1 = 1
and t1.url = '/safety/api/external/party/companyInfo/createForExternal'
order  by t1.id desc
;




        select
        t1.abbreviation,
            t1.*
        from company_info t1
        where 1 = 1
          and t1.id in (
            select party_id_from from pty_relationship where code like '001010%'  and role_type_from = 'company'
        );
        
        
     
        select
        t1.*
        from pty_party t1
        where 1 = 1
          and t1.id in (
            select party_id_from from pty_relationship where code like '001010%'  and role_type_from = 'company'
        )
      
      
      
      
      
      
      