




select t2.start_time, t2.id, t2.org_id ,t1.* from sf_apply_form t1
left join acc_accident t2 on t1.business_key = t2.id
where t1.business_type = 'accident'



select t1.start_time, t1.statistical_flag, t1.`level`,  t1.* from acc_accident t1
where t1.id = 70000004



        select distinct (t1.business_key)
        from sf_apply_form t1
        left join pty_relationship relat on relat.party_id_from = t1.org_id
            and relat.role_type_from = 'company'
            and relat.object_state = 'enabled'
        where 1 = 1
        and t1.business_type = 'accident'
        and relat.code like '001010%'  and  relat.status = 'enabled'
        ;
        
       
               select
        t1.start_time, t1.id
        from acc_accident t1
        left join pty_relationship relat on relat.party_id_from = t1.org_id
            and relat.role_type_from = 'company'
            
            and relat.relationship_type = 'organizational_structure'
        where 1 = 1
        and t1.object_state = 'enabled'
--         AND relat.status='enabled'
        and t1.`level` != 'A'
        and t1.statistical_flag = true
       
       