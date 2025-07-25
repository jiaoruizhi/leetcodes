
select * from pty_relationship t1
where t1.party_id_from = 27009015;

select * from pty_party where id = 27009517;



select * from pty_party  where name like '%林仕彪%'; 

select * from idm_user
where mobile = '13807621766'; 


select t1.name, t3.employee_id, t2.mobile, t1.org_id,  t1.* from pty_party t1
left join pty_person t2 on t1.id = t2.id
left join employee_info t3 on t1.id = t3.id
where 1 = 1
and t1.name in (
'尹晓瑜'
);


select * from pty_person t1
where t1.id = 857001560


delete from pty_party where id = 841001556;
delete from pty_person where id = 841001556;
delete from employee_info where id = 841001556;




select * from login t1
where 1 = 1
and t1.org_id = 280004936



select * from ctr_invitation t1
where 1 = 1
-- and t1.org_id = 27009517
and t1.id = 156000059




SELECT
        t1.id,
        t1.`type` ,
        t1.org_id ,
        t1.employee_id,
        e.employee_id as employee_number,
        t1.leader_id,
        e1.employee_id as leader_number,
        e1.duties AS leaderPostName,
        pty2.name as leaderName,
        t5.NAME AS employeeName,
        t1.NAME,
        t1.mobile,
        t1.email,
        t2.NAME AS templateName,
        t2.title AS templateTitle,
        t1.template_id,
        t1.contract_name,
        t1.start_time,
        t1.end_time,
        t1.sign_end_time,
        t1.remark,
        t2.cloud_way,
        t1.file_name,
        t1.company_id,
        t3.NAME AS invitationName,
        t1.invitation_time,
        ifnull( t4.STATUS, 'draft' ) AS STATUS,
        t1.form_value,
        t4.id AS contractId,
        t4.signature,
        t4.leader_signature,
        t6.proc_instance_id AS processInstanceId,
        t7.ID_ AS taskId,
        CASE
        t5.object_state
        WHEN 'enabled' THEN
        '在职' ELSE '离职'
        END AS employeeStatus,
        relat.CODE AS relationshipCode,
        pty5.NAME AS departmentName,
        e.duties AS postName,
--         pty1.NAME AS partyGroupName,
        e.duties as duty,
        t4.principal_depart_id,
        t4.principal_depart_name,
        t4.leader_depart_id,
        t4.leader_depart_name
                from ctr_invitation t1
        left join ctr_template t2 on t1.template_id = t2.id
        left join pty_party t3 on t1.invitation_employee_id = t3.id
        left join ctr_contract t4 on t1.id=t4.invitation_id
        left join pty_party t5 on t1.employee_id = t5.id
        left join employee_info e on t1.employee_id = e.id
        left join employee_info e1 on t1.leader_id = e1.id
        left join pty_party pty2 on pty2.id = t1.leader_id
        left join sf_apply_form t6 on t6.business_key = t4.id and t6.business_type IN ( 'sign_contract', 'sign_file' )
        left join act_ru_task t7 on t7.PROC_INST_ID_ = t6.proc_instance_id
--         left join pty_relationship r on r.party_id_from = t1.employee_id and r.relationship_type = 'employment'
--         left join pty_party pty1 on pty1.id = r.party_id_to
--         left join pty_role_type pr on pr.code = r.role_type_from
        left join pty_relationship relat on relat.party_id_from = t1.org_id
        and relat.role_type_from = 'company' and relat.relationship_type = 'organizational_structure'
        left join pty_party pty5 on t1.org_id = pty5.id
        where 1 = 1
--             and t1.object_state != 'disabled'
--             and t4.status != 'cancel'
--             and t1.org_id is null
        and t1.id = 156000059
--                         and
--                 (
--                 (t1.employee_id in (857001580)
--                 AND t4.signature IS NULL
--                 AND t4.sign_time IS NULL
--                 )
--                 or
--                  (t1.leader_id in (857001580)
--                  AND t2.process_key = 'sign_responsibility'
--                  AND t4.signature IS NOT NULL
--                  AND t4.sign_time IS NOT NULL
--                  AND t4.leader_signature IS NULL
--                  AND t4.leader_sign_time IS NULL)
--                  )
            ;
        
        
        
        
        
        
        
        
            
            
            
            
            
            
            
            
            
            
      select * from pty_party where org_id = 280004936 and `type` = 'person'