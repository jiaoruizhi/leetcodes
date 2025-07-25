

select * from frep_safety_week 





select t1.id,t1.ordinal,t1.region_id,t1.code,t1.name,t1.level,t1.compulsory_inspect_flag,t1.start_way,t1.random_number,t1.trigger_way,t1.inspect_photo_flag,t1.start_date,t1.end_date,t1.frequency_time,t1.accident_photo_flag,t1.violation_photo_flag,t1.issue_photo_flag,t1.photo_way,t1.violation_principal_flag,t1.accident_principal_flag,t1.issue_principal_flag,t1.status,t1.principal,t1.description,t1.document_id,t1.pic_document_id,t1.org_id,relat.code as relationshipCode, region.name as regionName,ref2.data_name as triggerWayName, pty1.name as principalName,t1.form_id,ins.name as formName,t1.coordinate,t1.region_code, rsk.name as riskObjectName,t1.risk_object_code from ope_operation_location t1 left join pty_relationship relat on relat.party_id_from = t1.org_id and relat.role_type_from = 'company' and relat.object_state = 'enabled' left join ope_operation_region region on region.id =t1.region_id left join rsk_risk_object rsk on rsk.region_code = t1.risk_object_code
-- left join ope_operation_region_type ope on ope.id =region.type 
left join ref_reference ref2 on ref2.data_code = t1.trigger_way and ref2.element_code = 'trigger_way' 
left join pty_party pty1 on pty1.id =t1.principal left join ins_checkform ins on ins.id =t1.form_id 
WHERE 1 = 1 and t1.org_id = 27009323 and region.code = '102' order by t1.id desc 