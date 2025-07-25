


select * from idm_user where id = 408000048


select * from pty_relationship t1
where t1.party_id_from = 27009188




select
t1.status , t1.org_id ,t1.origin,
t1.object_state , t1.created_by ,
t1.rectify_type,
t1.unique_code ,
t1.* from ins_issue t1
where t1.id = 1094000030


select t1.status , t1.org_id , t1.check_category , t1.unique_code ,
t1.object_state , t1 .*
from ins_inspection t1
where t1.id = 1291000121


select * from sf_task_instance t1
where t1.business_key = 1094000030


select t3.org_id, t2.mobile, * from employee_info t1
left join pty_person t2 on t1.id = t2.id
left join pty_party t3 on t1.id = t3.id
where 1 = 1
and t1.employee_id = '17901176'
;

select t2.name, t2 .* from employee_info t1
left join pty_party t2 on t1.id = t2.id
where 1 = 1
and t1.id is not null
and t2.id is not null
and t1.employee_id is not null
order by t2.id asc
-- and t2.org_id = 27009188


select * 
        from ins_issue t1
        left join ins_inspection t2 on t2.id = t1.inspection_id
        LEFT JOIN ins_inspection_issue is1 ON is1.issue_id = t1.id
        LEFT JOIN ins_inspection_item it1 ON it1.id = is1.inspection_item_id
        left join pty_party p on p.id = t1.party_group_id
        left join pty_party p2 on p2.id = t2.superior
        left join rsk_risk r on t2.business_key = r.id and t2.business_type = 'risk'
        left join base_project base on t2.business_key =base.id and t2.business_type ='project'
        left join che_major_hazard c on t2.business_key = c.id and t2.business_type in ('hazardRisk','majorHazard')
        left join pty_party pty on t2.business_key = pty.id and t2.business_type in ('company','department')
        left join hc_warehouse wh on t2.business_key = wh.id and t2.business_type = 'chemicalWarehouse'
        left join ope_special_operation op on t2.business_key = op.id and t2.business_type = 'operation'
        left join company_info info on info.id = pty.id
        left join ref_reference ref on ref.element_code = 'rectifyType' and t1.rectify_type = ref.data_code
        left join ref_reference ref2 on ref2.element_code = 'checkCategory' and t2.check_category = ref2.data_code
        left join pty_relationship relat on relat.party_id_from = t1.org_id
            and relat.role_type_from = 'company'
            and relat.relationship_type = 'organizational_structure'
        left join pty_party pty1 on pty1.id = t1.org_id
        left join ref_reference ref3 on ref3.element_code = 'issueStatus' and t1.status = ref3.data_code
        left join ref_reference ref4 on ref4.element_code = 'issueCategory' and t1.type = ref4.data_code
        left join ref_reference ref5 on ref5.element_code = 'issueLevel' and t1.level = ref5.data_code
        left join ref_reference ref6 on ref6.element_code = 'checkResult' and t1.result = ref6.data_code
        left join ref_reference ref7 on ref7.element_code = 'issueLevelNum' and t1.level_num = ref7.data_code
        left join idm_user idm on idm.id = t1.created_by
        left join pty_party pty2 on idm.person_id = pty2.id
        left join idm_user idm1 on idm1.id = t1.last_updated_by
        left join pty_party pty3 on idm1.person_id = pty3.id
        left join dev_device t11 on t2.business_key = t11.id and t2.business_type in ('deviceInspection','fireDeviceInspection')
        left join dev_device_category cate on cate.id = t11.category
        left join dev_device_type typ on typ.id = t11.type
        left join warn_warning_event t3 on t3.warning_code = 'issue_overdue' and t3.business_key = t1.id and t3.status ='unclose'
        left join ope_operation_location loc on loc.id = t1.location_id
        left join ins_rectification rect on rect.issue_id = t1.id
        left join pty_party pty4 on pty4.id = rect.rectification_person_id
        where 1 = 1
        and t1.org_id = 27009188
        and t2.check_category = 'issue_report'
        and t1.object_state = 'enabled'
        and (t2.object_state = 'enabled' or t1.external_code is not null)
        and t1.status != 'beConfirmed'
        and t1.object_state = 'enabled'
        and (t2.object_state = 'enabled' or t1.external_code is not null)
        
        
        
        
        
        
        
        
        
        
        
        