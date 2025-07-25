

select * from ctr_contract t1
where t1.id = 16


        select t6.*
 from 	ctr_invitation t1
                                             LEFT JOIN ctr_contract t4 ON t1.id = t4.invitation_id
                                             LEFT JOIN ctr_contract_item c2 ON t4.id = c2.contract_id
                                             LEFT JOIN sf_apply_form t6 ON t6.business_key = t4.id
            AND t6.business_type IN ( 'sign_contract', 'sign_file' )
--                                              LEFT JOIN act_ru_task t7 ON t7.PROC_INST_ID_ = t6.proc_instance_id
--             AND t7.ASSIGNEE_  = 8240
        where  t1.id = 17
          and c2.status = 'unsigned'
          and c2.person_id = 8240