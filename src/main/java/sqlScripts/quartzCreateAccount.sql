

-- quartzCreateAccount





--         query.setIncaseFlag(true);
--         query.setRelationshipCode("001010");
--         query.setContainFlag(true);
--         query.setStructType("luan");
--         query.setUserFlag(true);
--         query.setMobileFlag(true);




        select
        max(t1.id) as id ,
        max(pty1.name) as name,
        t1.employee_id,
        pty1.object_state ,
        max(t1.incase_flag) as incaseFlag,
        max(pty2.mobile) as mobile,max(t1.duties) as duties,
        max(pty2.email) as email,
        pty1.org_id,
        max(t3.name) as partyGroupName,
        idm.id
FROM
        employee_info t1
        LEFT JOIN pty_party pty1 ON t1.id = pty1.id
        LEFT JOIN pty_person pty2 ON t1.id = pty2.id
        LEFT JOIN pty_relationship relat ON relat.party_id_from = pty1.org_id
            and relat.role_type_from = 'company'
            and relat.relationship_type = 'organizational_structure'
        LEFT JOIN pty_relationship p2 ON p2.party_id_from = pty1.id
        LEFT JOIN pty_party t3 ON t3.id = p2.party_id_to
        AND t3.org_id = pty1.org_id
        left join idm_user idm on idm.person_id = pty1.id
        where 1 = 1
        and pty1.name != 'admin'
        and pty1.object_state = 'enabled'
        and t1.incase_flag = true
            and relat.code like '001010%'
            AND pty1.sys_code = 'luan'
            and idm.id is null
            and pty2.mobile is not null
        group by t1.employee_id
        order by max(t1.id) desc
        ;


       
        

        


select * from idm_user where employee_id  = 'GH00010316';

select * from idm_user where person_id  = 842001561;

select * from login where employee_id = 'GH00010316';

select * from pty_party where id = 27061638


    