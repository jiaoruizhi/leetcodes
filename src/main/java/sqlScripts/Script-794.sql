        select
        t1.id,
        t1.content
        from frep_safety_month_complain t1
        left join frep_safety_month t2 on t1.report_id = t2.id
        LEFT JOIN pty_relationship relat ON relat.party_id_from = t1.org_id
            AND relat.role_type_from = 'company'
            AND relat.relationship_type = 'organizational_structure'