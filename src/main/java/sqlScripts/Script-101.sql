alter table `rsk_risk` add column zhongyuan_id bigint(10) null comment '中远ID';
alter table `rsk_risk_hazard` add column zhongyuan_id bigint(10) null comment '中远ID';
alter table `rsk_risk_assessment_limit` add column zhongyuan_id bigint(10) null comment '中远ID';
alter table `rsk_risk_assessment_model` add column zhongyuan_id bigint(10) null comment '中远ID';
alter table `spa_space` add column zhongyuan_id bigint(10) null comment '中远ID';
alter table `ope_special_operation` add column zhongyuan_id bigint(10) null comment '中远ID';
alter table `pfm_work` add column zhongyuan_id bigint(10) null comment '中远ID';
alter table `ope_safety_measure` add column zhongyuan_id bigint(10) null comment '中远ID';

alter table `ins_inspection` add column zhongyuan_id bigint(10) null comment '中远ID';
alter table `ins_inspection_item` add column zhongyuan_id bigint(10) null comment '中远ID';
alter table `ins_issue` add column zhongyuan_id bigint(10) null comment '中远ID';
alter table `ins_rectification` add column zhongyuan_id bigint(10) null comment '中远ID';