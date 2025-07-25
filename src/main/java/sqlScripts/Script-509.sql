        select 
                       ifnull(t1.inspection_person, p1.name) as inspectionPeron,
t1.id,
               t1.risk_id,
               t1.business_key,
               t1.business_type,
               t1.inspect_Date,
               CASE
                   WHEN r.NAME IS not NULL THEN r.name
                   when base.name is not null then base.name
                   when info.abbreviation is not null then info.abbreviation
                   when pty.NAME is not null then pty.NAME
                   else t1.party_group_name
                   END AS riskName,
               t1.party_group_id,
               case
                   when info1.abbreviation is not null then info1.abbreviation
                   when pty2.name is not null then pty2.name
                   else t1.inspection_unit
               end as inspectionUnit,
               t1.inspection_unit_id,
               p2.name as partyGroupName,
               t1.inspect_depart_id,
               case
                   when t1.inspect_depart_id is null then
                       t1.inspect_depart_name else p3.name
                   end as inspectDepartName,
               t1.check_category,
               t1.inspect_by,
               p1.name as inspectPersonName,
               t1.inspect_time,
               t1.form_id,
               f.name  as formName,
               t1.type,
               t1.type_code_list,
               t1.level,
               lit.danger_limit as levelName,
               t1.category,
               t1.location,
               t1.result,
               t1.sign_flag,
               t1.status,
               t1.description,
               t1.picture_document_id,
               t1.document_id,t1.form_code,
               t1.org_id,relat.code as relationshipCode,pty1.name as departmentName,
               t1.superior,
               t1.external_inspection_type,
               ref4.data_name as externalInspectionTypeName,
               t1.superior_entry_flag,
               p4.name as superiorName,
               t1.superior_confirm_flag,
               t1.spot_check_start,
               t1.spot_check_end,
               t1.inspect_category,
               t1.score,t1.unique_code,t1.source_id,
               ref5.data_name as inspectCategoryName,
               t1.party_group_name as inspectedDepartName,
               dev1.name as deviceName,
               t1.ganghang_id,
               t1.device_check_repair_type,ref6.data_name as deviceCheckRepairTypeName,
               typ.name as deviceTypeName,cate.name as deviceCategoryName,
               t1.form_flag,t1.repair_start_date,t1.repair_end_date,
               t1.ganghang_id,
               t1.inspection_maintenance_unit
        from ins_inspection t1
--                  left join pfm_work t3 on t3.id = t1.work_id
                 left join pty_party p4 on p4.id = t1.superior
                 left join pty_party p1 on p1.id = t1.inspect_by
                 left join pty_party p2 on p2.id = t1.party_group_id
                 left join pty_party p3 on p3.id = t1.inspect_depart_id
                 left join rsk_risk r on t1.business_key = r.id and t1.business_type = 'risk'
                 left join base_project base on t1.business_key =base.id and t1.business_type ='project'
                 left join pty_party pty on t1.business_key = pty.id and t1.business_type in ('company','department')
                 left join company_info info on info.id = pty.id
                 left join ins_checkform f on t1.form_id = f.id
                 left join pty_relationship relat on relat.party_id_from = t1.org_id
            and relat.role_type_from = 'company' and relat.relationship_type = 'organizational_structure'
                 left join pty_party pty1 on pty1.id = t1.org_id
--                  left join ref_reference ref on ref.element_code = 'inspectionType' and ref.data_code = t1.type
                 left join ref_reference ref4 on ref4.element_code = 'externalInspectionClassification' and ref4.data_code = t1.external_inspection_type
                 left join ref_reference ref5 on ref5.element_code = 'inspectionCategory' and ref5.data_code = t1.inspect_category
                 left join rsk_risk_assessment_limit lit on    lit.risk_level = t1.level  and lit.type = 'inspection_level'
                left join pty_party pty2 on pty2.id = t1.inspection_unit_id
                left join company_info info1 on info1.id = pty2.id
                 left join dev_device dev1 on dev1.id = t1.business_key and t1.business_type in ('deviceInspection','fireDeviceInspection')
                 left join ref_reference ref6 on ref6.element_code = 'deviceCheckType' and ref6.data_code = t1.device_check_repair_type
                 left join dev_device_category cate on cate.id = dev1.category
                 left join dev_device_type typ on typ.id = dev1.type
        where t1.id = 1082000168