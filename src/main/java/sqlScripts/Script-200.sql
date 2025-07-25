alter table dev_device add column data_source varchar(200) comment '数据来源';
alter table ins_inspection add column data_source varchar(200) comment '数据来源';
alter table ins_issue add column data_source varchar(200) comment '数据来源';



alter table hel_violation_record add column detail_content varchar(200) comment '违章细则';