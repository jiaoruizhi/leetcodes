       

select * from pty_relationship t1
where t1.party_id_from = 27009365








select
        t1.org_id,
        t1.party_group_id,
        t1.type,
        t1.business_type,
        t1.status,
        count(t1.id) as countValue
        from pfm_work t1
        left join pty_relationship relat on relat.party_id_from = t1.org_id
            and relat.role_type_from = 'company'
            and relat.relationship_type = 'organizational_structure'
        where 1 = 1
            and t1.status not in ('retract', 'nullify', 'cancel')
            and t1.status is not null
                and relat.code like '001010031%' and relat.status = 'enabled'
                and t1.business_type = 'periodicInspection'
                and DATE_FORMAT(t1.created_time,'%Y-%m-%d') >=  '2024-12-01'
                and DATE_FORMAT(t1.created_time,'%Y-%m-%d') <= '2024-12-31'
        group by t1.status
        ;