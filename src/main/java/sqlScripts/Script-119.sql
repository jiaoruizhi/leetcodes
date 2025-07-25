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
alter table `ins_issue` add column zhongyuan_name varchar(200) null comment '中远名称';
alter table `ins_rectification` add column zhongyuan_id bigint(10) null comment '中远ID';

alter table `par_team_meeting` add column zhongyuan_id bigint(10) null comment '中远ID';

-- 0826 prod

alter table `hel_punish_record` add column zhongyuan_id bigint(10) null comment '中远ID';
alter table `work_center` add column zhongyuan_id bigint(10) null comment '中远ID';

