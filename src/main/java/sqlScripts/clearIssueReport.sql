



        select
        pty1.id ,
        count( t1.id ) as countValue,
        count( CASE WHEN t1.audit_status = 'beConfirmed' THEN 1 ELSE NULL END ) AS countCommitted,
        count(
            CASE WHEN (
                (t1.audit_status = 'issue' or t2.contain_issue_report_flag = true)
                and t1.status != 'disuse'
            ) THEN 1
            ELSE NULL END
        ) AS countIssue,
        count( CASE WHEN t1.status = 'disuse' THEN 1 ELSE NULL END ) AS disuseCount,
        count( CASE WHEN t1.audit_status = 'notIssue' THEN 1 ELSE NULL END ) AS countNotIssue,
        t2.check_category,
        pty1.name as orgName,
        pty1.id as orgId
        from ins_issue t1
        left join ins_inspection t2 on t2.id = t1.inspection_id
        join pty_party pty1 on pty1.id = 1
        left join pty_relationship relat on relat.party_id_from = t1.org_id
            and relat.role_type_from = 'company'
            and relat.relationship_type = 'organizational_structure'
        where 1 = 1
			and (t2.status = 'completed' or t1.audit_status is not null)
			and t1.object_state = 'enabled'
            and t2.object_state = 'enabled'
                and (
                t2.check_category = 'issueReport'
                or
                ('issueReport' = 'issueReport' and t2.contain_issue_report_flag = true)
                )
                and relat.code like '001%'
        ;
        
        
        
        
                select
                t1.status,
                t1.audit_status ,
                t2.status,
        count(*)
        from ins_issue t1
        left join ins_inspection t2 on t2.id = t1.inspection_id
        join pty_party pty1 on pty1.id = 1
        left join pty_relationship relat on relat.party_id_from = t1.org_id
            and relat.role_type_from = 'company'
            and relat.relationship_type = 'organizational_structure'
        where 1 = 1
--             and t2.status = 'completed'
            and t1.object_state = 'enabled'
            and t2.object_state = 'enabled'
                and (
                t2.check_category = 'issueReport'
                or
                ('issueReport' = 'issueReport' and t2.contain_issue_report_flag = true)
                )
                and relat.code like '001%'
                group by t1.status, t1.audit_status, t2.status
        ;
                
                
                
                