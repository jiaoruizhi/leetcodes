

-- company_info

describe employee_info;


select * from company_info
where 1 = 1
-- and coordinate is not null
and id = 27009123
-- and industry_group like "%中国远洋海运集团有限公司%"
;



INSERT INTO company_info (name,industry_group,major_flag,coordinate,brief,reach_condition,legal_person,mobile,credit_code,operator,operator_mobile,legal_id_type,legal_id,registered_address,business_address,email,address,administrative_region,street,economy_major_type,economy_minor_type,economy_type,`scale`,li_shu_guan_xi,parent_company,major_risk,inherent_level,manage_scope,manage_condition,employee_situation,informant,informant_email,informant_mobile,status,major_hazard_content,safety_production,chemical_flag,risk_control,responsibility_flag,gear_name,safety_gear_flag,emergency_manage_count,safety_manage_count,certified_safety_count,practitioner_count,industry_field,safety_principal,safety_telephone,safety_mobile,principal,principal_telephone,principal_email,principal_mobile,picture_document_id,document_id,tenant_id,owner_id,owner_group_id,org_id,object_state,created_by,created_time,last_updated_by,last_updated_time,informant_name,safety_principal_name,principal_name,country,city,holding_situation,seq,major_content,`attribute`,industry_trade_type,update_by,update_time,abbreviation,statistics_flag,company_type,reach_date,tfc_reach_condition,tfc_reach_date,uuid) VALUES
	 (NULL,'中国远洋海运集团有限公司',0,'109.177374,19.724976','洋浦国际集装箱码头有限公司成立于2016-12-20，法定代表人为林师君，注册资本为153500.3931万元人民币，统一社会信用代码为91460300MA5RDXK840，企业地址位于海南省洋浦经济开发区新英湾区保税港区2号办公楼A010室，所属行业为水上运输业，经营范围包含：港口装卸、仓储（危险品除外）、水上客货代理服务；集装箱拆装、检验、运输、清洗、熏蒸、保管、修理（危险品除外）；外轮理货；港口工程建设；旅游项目开发；轻工产品加工；为船舶提供岸电、燃物料、淡水和生活用品供应；报关代理；不动产、有形动产租赁。洋浦国际集装箱码头有限公司目前的经营状态为存续（在营、开业、在册）。2023年公司更名为海南港航国际港务有限公司。','notReviewed','李建春','089836998696','91460300MA5RDXK840',NULL,NULL,'1','210204196403121476','海南省洋浦经济开发区新英湾区保税港区2号办公楼A010室','海南省洋浦经济开发区干冲区洋浦大道10号国际港务洋浦港区',NULL,'海南省洋浦经济开发区干冲区洋浦大道10号国际港务洋浦港区','海南省儋州市','洋浦经济开发区干冲区洋浦大道10号','交通运输业','港口码头',NULL,'small',NULL,NULL,NULL,'B','港口装卸、仓储(危险品除外)、水上客货代理服务;集装箱拆装、检验、运输、清洗、熏蒸、保管、修理(危险品除外)','良好','326人','27061944',NULL,'13807680460',NULL,NULL,NULL,0,'船舶和堆场的装卸风险，港内相关方的危险作业风险，装卸过程中的高处坠落、物体打击、机械伤害风险，港内交通安全风险。',1,NULL,1,NULL,20,2,NULL,'交通运输业',27061691,'13807594188',NULL,489001600,'13976737289',NULL,NULL,191000027,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'CN','洋浦经济开发区','100%',NULL,NULL,'Port storage and transportation','other',27061944,'2023-09-11 16:29:45','YPICT',1,'pier',NULL,'first','2025-04-27',NULL);
