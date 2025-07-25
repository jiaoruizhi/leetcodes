ALTER TABLE dev_device ADD external_code varchar(200) NULL COMMENT '外部编码';

ALTER TABLE dev_ins_checkform_item ADD external_code varchar(200) NULL COMMENT '外部编码';

ALTER TABLE ins_inspection ADD external_code varchar(200) NULL COMMENT '外部编码';

ALTER TABLE ins_issue ADD external_code varchar(200) NULL COMMENT '外部编码';
ALTER TABLE ins_issue ADD device_id BIGINT NULL COMMENT '设备ID';



ALTER TABLE sche_plan ADD party_group_id BIGINT NULL COMMENT '设备ID';