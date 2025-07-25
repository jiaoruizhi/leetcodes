







drop table if exists base_business_related_project;
create table base_business_related_project
(
    `id`                           bigint(20) not null auto_increment,
    `name`                         varchar(200) null comment '名称 ',
    `principal_name`               varchar(200) null comment '企业负责人 ',
    `address`                      varchar(400) null comment '地址 ',
    `food_license_information`     text(2000) null comment '食品生产许可证信息 食品生产许可证信息',
    `license_valid_to`             date null comment '许可证到期日期 ',
    `system_authorize_information` varchar(400) null comment '工厂体系认证信息 ',
    `market_supervision`           varchar(400) null comment '市场监管局 ',
    `negative_information`         text(2000) null comment '负面信息 ',
    `third_party_audit_flag`       tinyint(1) NULL comment '是否第三方审核 ',
    `third_party_name`             varchar(400) null comment '第三方公司名称 ',
    `last_audit_date`              date null comment '最近审核日期 ',
    `document_id`                  bigint(10) null comment '附件 ',
    `pic_document_id`              bigint(10) null comment '图片 ',
    `tenant_id`                    bigint(20) null comment '租户ID',
    `owner_id`                     bigint(20) null,
    `owner_group_id`               bigint(20) null,
    `sys_code`                     varchar(50) NULL,
    `owner_org_id`                 bigint(20) null,
    `org_id`                       bigint(20) null,
    `project_id`                   bigint(5) null,
    `object_state`                 varchar(200) null,
    `created_by`                   bigint(20) null,
    `created_time`                 datetime null,
    `last_updated_by`              bigint(20) null,
    `last_updated_time`            datetime null,
    primary key (`id`)
) engine=innodb auto_increment=1  comment='';
