






        select
        pty1.id ,
        count( t1.id ) as countValue,
        count( CASE WHEN t1.audit_status = 'beConfirmed' THEN 1 ELSE NULL END ) AS countCommitted,
        count( CASE WHEN t1.audit_status = 'issue'  THEN 1 ELSE NULL END ) AS countIssue,
        count( CASE WHEN t1.audit_status = 'notIssue'THEN 1 ELSE NULL END ) AS countNotIssue,
        t2.check_category,
        pty1.name as orgName,
        pty1.id as orgId
        from ins_issue t1
        left join ins_inspection t2 on t2.id = t1.inspection_id
        join pty_party pty1 on pty1.id = 1
        left join pty_relationship relat on relat.party_id_from = t1.org_id
            and relat.role_type_from = 'company'
            and relat.relationship_type = 'organizational_structure'