


       
              select * from log_request t1
       where 1 = 1
       and t1.url = "/external/party/group/createForExternal"
       order by t1.id desc

       
        select
            t1.*,
            t2.code,
            t2.mdm_code,
            t2.status,
            t2.level,
            t2.struct_code,
            t2.parent_struct_code,
            t2.edit_flag
        from pty_party t1
        left join pty_group t2 on t1.id = t2.id
        where 1 = 1
          and t1.`type` = 'department'
          and t2.struct_code is null
          and t1.org_id in (
            select party_id_from from pty_relationship where code like '001010%'  and role_type_from = 'company'
        )
          and (
            t1.zhongyuan_id is not null
            )
        ;
        
       
select * from pty_party t1
where t1.ganghang_id is not null