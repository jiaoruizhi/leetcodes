drop table if exists sft_safety_team_member_job_experience;
create table sft_safety_team_member_job_experience
(
    `id`                bigint(20) not null auto_increment,
    `member_id`         bigint(10) not null comment '成员ID',
    `work_from`         date null comment '起时间',
    `work_to`           date null comment '止时间',
    `unit_name`         varchar(200) null comment '单位名称',
    `description`       longtext not null comment '描述',
    `sys_code`          varchar(20) null,
    `project_id`        bigint(20) null,
    `tenant_id`         bigint(20) null comment '租户ID',
    `owner_id`          bigint(20) null,
    `owner_group_id`    bigint(20) null,
    `org_id`            bigint(20) null,
    `owner_org_id`      bigint(20) null,
    `object_state`      varchar(200) null,
    `created_by`        bigint(20) null,
    `created_time`      datetime null,
    `last_updated_by`   bigint(20) null,
    `last_updated_time` datetime null,
    primary key (`id`)
) engine=innodb auto_increment=1  comment='';