


-- pro_deployment


-- 1193
select * from pro_deployment
where 1 = 1
-- and process_name like '%危险作业%'
-- and version = 2
-- and process_xml like '%ValidSaveSpecialOperationService%'
and process_key = 'company_reform'
-- and object_state = 'disable'
-- and org_id = 27009323
-- order by id desc
order by created_time desc
;









select * from pro_deployment 
where 1 = 1
and org_id = 27009365
and process_key = "report_reform"
-- and process_key = "company_reform"
order by created_time desc






