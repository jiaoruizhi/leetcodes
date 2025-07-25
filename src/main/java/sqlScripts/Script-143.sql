drop table if exists sys_push_config_item;
create table sys_push_config_item
(
    `id`                bigint(20) not null auto_increment,
    `push_config_id`    bigint(20) null comment '业务主键',
    `party_id`          bigint(20) null comment '目标ID',
    `party_type`        varchar(200) null comment '目标类型',
    `tenant_id` bigint(20) null comment '租户ID',
    `project_id` bigint(20) null,
    `sys_code` varchar(200) null,
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