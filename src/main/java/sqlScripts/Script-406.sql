


ALTER TABLE `pfm_work` ADD COLUMN `ganghang_id` bigint(10) NULL comment '港航ID';

ALTER TABLE `ope_special_operation` ADD COLUMN `ganghang_id` bigint(10) NULL comment '港航ID';

alter table `dev_device_head` add column `security_department_name` varchar(200) null comment '安全部门名称';
alter table `dev_device_head` add column `use_department_name` varchar(200) null comment '使用部门名称';
alter table `dev_device_head` add column `device_department_name` varchar(200) null comment '设备部门名称';
ALTER TABLE `dev_device_head` ADD COLUMN `ganghang_id` bigint(10) NULL comment '港航ID';
