        select
        count(t1.id) as countValue,
        t1.org_id,
        case when ci.abbreviation is not null then ci.abbreviation else ci.name end as orgName
        from base_related_team t1
        left join company_info ci on ci.id = t1.org_id
        left join pty_relationship relat on relat.party_id_from = t1.org_id
        and relat.role_type_from = 'company' and relat.relationship_type = 'organizational_structure'
        group by t1.org_id