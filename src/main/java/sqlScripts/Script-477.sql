drop table if exists ins_issue_external;
create table ins_issue_external
(
    `id`                bigint(20) not null auto_increment,
    `issue_id`          bigint(20) null comment '隐患ID',
    `lebs_id`           bigint(20) null comment '执法ID',
    `push_time`         datetime null comment '推送时间 ',
    `push_status`       varchar(200) null comment '推送状态',
    `push_person_id`    bigint(20) null comment '推送人ID',
    `description`       varchar(200) null comment '描述',
    `tenant_id`         bigint(20) null comment '租户ID',
    `owner_id`          bigint(20) null,
    `owner_group_id`    bigint(20) null,
    `org_id`            bigint(20) null,
    `project_id`        bigint(5) null,
    `sys_code`          varchar(50) null,
    `object_state`      varchar(200) null,
    `created_by`        bigint(20) null,
    `created_time`      datetime null,
    `last_updated_by`   bigint(20) null,
    `last_updated_time` datetime null,
    `owner_org_id`      bigint(20) null,
    primary key (`id`)
) engine=innodb auto_increment=1  comment='';