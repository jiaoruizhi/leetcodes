





--  find_my_identity







        SELECT
            t5.NAME AS roleName,
            t6.NAME AS partyName,
            t6.id AS partyId,
            t1.id as userId,
            t7.name as companyName,
            t1.org_id as orgId
        FROM
            idm_user t1
            left join login t2 ON t1.login_id = t2.id
            LEFT JOIN pty_relationship t4 ON t4.id = t1.relationship_id
            left join pty_role_type t5 ON t5.CODE = t4.role_type_from
            LEFT JOIN pty_party t6 ON t6.id = t4.party_id_to
            left join pty_party t7 on t7.id = t1.org_id
        where t1.id = 470000140
        and t1.sys_code = 'luan'
        and t1.object_state = 'enabled'