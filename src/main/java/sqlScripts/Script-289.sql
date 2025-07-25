        select t1.*
        from ins_rectification t1
        where 1 = 1
--           and t1.zhongyuan_id is null
          and t1.status like 'completed'
          and t1.org_id in (
            select party_id_from from pty_relationship where code like '001010%'  and role_type_from = 'company'
        )
        order by t1.id desc