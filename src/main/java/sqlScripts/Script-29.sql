


select t1.* from rsk_risk_hazard t1
order by t1.id desc ;

select * from login where open_id = "oFBR960vtQV5ik_ZzxU-nkgiyKCc";


select t1.data_code , t1.* from ref_reference t1
where 1 = 1
and t1.element_code = "workType"

ALTER TABLE dev_device_item ADD area varchar(200) NULL COMMENT '管理区域';
alter table tra_training_plan add column ihr_training_plan_id varchar(200);

ALTER TABLE rsk_risk_hazard ADD risk_code varchar(200) NULL COMMENT '作业单元编码';

