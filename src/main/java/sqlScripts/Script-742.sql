



drop table if exists frep_safety_month;
create table frep_safety_month
(
    `id`                         bigint(20) not null auto_increment,
    `report_person_id`           bigint(10) null comment '上报人ID',
    `company_id`                 bigint(10) null comment '所属公司',
    `report_date`                date null comment '上报周期',
    `check_times`                Integer null comment '被检查次数',
    `check_unqualify_times`      Integer null comment '年份',
    `spot_check_times`           Integer null comment '被检查次数',
    `spot_check_unqualify_times` Integer null comment '年份',
    `punish_times`               Integer null comment '被检查次数',
    `year`                       Integer null comment '年份',
    `month`                      Integer null comment '月份',
    `status`                     varchar(200) null comment '状态',
    `tenant_id`                  bigint(20) null comment '租户ID',
    `owner_id`                   bigint(20) null,
    `owner_group_id`             bigint(20) null,
    `org_id`                     bigint(20) null,
    `owner_org_id`               bigint(20) null,
    `sys_code`                   varchar(50) null,
    `project_id`                 bigint(5) null,
    `object_state`               varchar(200) null,
    `created_by`                 bigint(20) null,
    `created_time`               datetime null,
    `last_updated_by`            bigint(20) null,
    `last_updated_time`          datetime null,
    primary key (`id`)
) engine=innodb auto_increment=1  comment='';