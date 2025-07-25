
-- byLevel


        SELECT
        t1.level_num,
        count(t1.id) as countValue
        FROM
        ins_issue t1
        LEFT JOIN ins_inspection_issue t2 ON t2.issue_id = t1.id
        left join ins_inspection_item t3 on t3.id = t1.inspection_item_id
        left join ins_inspection t4 on t4.id = t1.inspection_id
        left join company_info ci on ci.id = t1.org_id
        left join pty_relationship relat on relat.party_id_from = t1.org_id
        and relat.role_type_from = 'company' and relat.relationship_type = 'organizational_structure'
        where 1 = 1
            and t1.result != 'normal'
            and t1.level_num is not null
            and t1.status not in ('draft', 'beConfirmed')
            and t1.object_state = 'enabled'
				and t1.status in ( 'submitted' , 'created','completed','resolved')
and (t4.object_state = 'enabled'
				or t1.external_code is not null)
--             and t4.object_state = 'enabled'
                and relat.code like '001010%'
                 and relat.status = 'enabled'
                and DATE_FORMAT(t4.inspect_time,'%Y-%m-%d') >= '2024-01-01'
                and DATE_FORMAT(t4.inspect_time,'%Y-%m-%d') <= '2024-12-31'
group by t1.level_num
        
        
        
       