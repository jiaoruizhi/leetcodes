-- 0826 prod

ALTER TABLE dev_device ADD external_code varchar(200) NULL COMMENT '外部编码';

ALTER TABLE dev_ins_checkform_item ADD external_code varchar(200) NULL COMMENT '外部编码';