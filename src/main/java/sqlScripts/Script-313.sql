

describe rsk_risk_unit;


        select
          r.name, t1.*
        from pty_party t1
        left join idm_user t2 on t2.person_id = t1.id
        left join idm_user_role pr on t2.id = pr.user_id
        left join idm_role r on pr.role_id = r.id
        where
            1 = 1
            and t2.id is not null
                and t1.org_id = 27009365
                and r.name like  '%公司系统管理员%'
        order by t1.id desc