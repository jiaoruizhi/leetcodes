describe rsk_risk_hazard;


alter table tra_training_plan add column ihr_training_plan_id varchar(200);


alter table st_comprehensive_statistics add column certificate_manage_num  bigint(20);


describe st_comprehensive_statistics;

ALTER TABLE dev_device_item ADD area varchar(200) NULL COMMENT '管理区域';


ALTER TABLE rsk_risk_hazard ADD risk_code varchar(200) NULL COMMENT '作业单元编码';


select * from rsk_risk_unit t1
where 1 = 1
and t1.id = 1858;