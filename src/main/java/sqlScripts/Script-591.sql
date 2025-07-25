        select
            t2.code,
            t2.mdm_code,
            t2.status,
            t2.level,
            t2.department_person_id,
            t2.safety_person_id,
            t2.struct_code,
            t2.parent_struct_code,
            t2.edit_flag,
            t3.name,
            t3.type,
            t3.struct_type,
            t3.level_code,
            t3.relation_level,
            t1.*
        from company_info t1
        left join pty_group t2 on t1.id = t2.id
        left join pty_party t3 on t1.id = t3.id
        order by t2.code desc