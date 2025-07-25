



      select * from pty_party t1
      order by t1.id desc
      
      
      select * from pty_group t1
      order by t1.id desc
      
      
      
              select
            t2.*,
            t1.name,
            t1.type,
            t1.struct_type,
            t1.org_id,
            t1.zhongyuan_id
        from pty_party t1
        left join pty_group t2 on t1.id = t2.id
        where 1 = 1
          and t1.`type` = 'department'
          and t2.struct_code is null
          and t1.org_id in (
            select party_id_from from pty_relationship where code like '001010%'  and role_type_from = 'company'
        )
          and (
            t1.zhongyuan_id is null
                or
            to_days(now()) - to_days(t1.created_time) <= 1
                or
            to_days(now()) - to_days(t1.last_updated_time) <= 1
            )
        ;