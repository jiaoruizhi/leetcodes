


select * from pty_relationship t1

select * from pty_party t1
where t1.id = 8178;



        select
t1.id, t1.audit_status 
from ins_issue t1
left join ins_inspection t2 on t1.inspection_id = t2.id 
where 1 =1 
and t2.check_category = 'issueReport'
       
















select
            t1.id,
            ins1.id
                    from ins_issue t1
        left join ins_inspection t2 on t2.id = t1.inspection_id
        left join pty_party pty on pty.id = t1.org_id
        LEFT JOIN pty_relationship relat ON relat.party_id_from = t1.org_id
        AND relat.role_type_from = 'company'
        AND relat.relationship_type = 'organizational_structure'
        left join pty_party pty1 on pty1.id = t1.organizer
        left join pty_party pty4 on pty4.id = t1.check_object and t1.check_object_type = 'person'
        left join rsk_major_hazard m1 on t1.check_object = m1.id and t1.check_object_type = 'major_hazard'
        left join dev_device dev on t1.check_object = dev.id and t1.check_object_type = 'device'
        left join hc_chemicals hc on t1.check_object = hc.id and t1.check_object_type = 'hazardous_chemicals'
        left join ref_reference ref on ref.element_code = t1.type and ref.data_code = t1.unit_type
        left join pty_party pty5 on t1.verifier = pty5.id
        left join ins_rectification_task ins1 on ins1.business_key = t1.id and ins1.business_type = 'issue'
--         left join ref_reference ref1 on ref1.element_code = 'rectificationMethod' and ref1.data_code = t1.rectification_method
--         left join ref_reference ref2 on ref2.element_code = 'issueType' and ref2.data_code = t1.type
--         left join ref_reference ref3 on ref3.element_code = 'issueLevel' and ref3.data_code = t1.level
--         left join ref_reference ref4 on ref4.element_code = 'issueStatus' and t1.status = ref4.data_code
--         left join idm_user idm on t1.created_by = idm.id
--         left join pty_person pp1 on pp1.id = idm.person_id
        where 1= 1
        and t2.check_category = 'issueReport'
           order by t1.id desc
            

            
            
            
            
            
            
            
            
       