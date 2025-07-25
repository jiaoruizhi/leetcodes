drop table if exists dev_device_part;
create table dev_device_part(
`id` bigint(20) not null auto_increment,
`name` varchar(200) null comment '名称 名称',
`device_id` bigint(20) null comment '设备ID',
`code` varchar(200) null comment '部位编号',


`tenant_id` bigint(20) null comment '租户ID',
`sys_code` varchar(50) NULL,
`project_id` bigint(20) null,
`owner_id` bigint(20) null,
`owner_group_id` bigint(20) null,
`org_id` bigint(20) null,
`object_state` varchar(200) null,
`created_by`  bigint(20) null,
`created_time`  datetime null,
`last_updated_by`  bigint(20) null,
`last_updated_time`  datetime null,
primary key (`id`)
) engine=innodb auto_increment=1  comment='';