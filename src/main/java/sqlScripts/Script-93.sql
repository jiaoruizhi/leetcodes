alter table `rsk_risk_assessment_limit` add column zhongyuan_id bigint(10) null comment '中远ID';
alter table `rsk_risk` add column zhongyuan_id bigint(10) null comment '中远ID';
alter table `rsk_risk_unit` add column zhongyuan_id bigint(10) null comment '中远ID';