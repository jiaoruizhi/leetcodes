    `tenant_id`            bigint        DEFAULT NULL COMMENT '租户ID',
    `owner_id`             bigint        DEFAULT NULL,
    `owner_group_id`       bigint        DEFAULT NULL,
    `owner_org_id`         bigint        DEFAULT NULL COMMENT '统计用orgId',
    `org_id`               bigint        DEFAULT NULL,
    `sys_code`             varchar(200)  DEFAULT NULL COMMENT '系统编码',
    `project_id`           bigint        DEFAULT NULL,
    `object_state`         varchar(200)  DEFAULT NULL,
    `created_by`           bigint        DEFAULT NULL,
    `created_time`         datetime      DEFAULT NULL,
    `last_updated_by`      bigint        DEFAULT NULL,
    `last_updated_time`    datetime      DEFAULT NULL,
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    drop table if exists dev_device;
    
    -- ganghang.dev_device_check_plan definition
    
    
    
    
    
    
    
    
drop table if exists dev_check_plan_assign;
-- ganghang.dev_check_plan_assign definition

drop table if exists dev_check_plan_assign;
CREATE TABLE `dev_check_plan_assign` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `business_key` bigint DEFAULT NULL COMMENT '作业单元',
  `business_type` varchar(200) DEFAULT NULL COMMENT '业务类型 ',
  `principal` bigint DEFAULT NULL COMMENT '负责人 ',
    `tenant_id`            bigint        DEFAULT NULL COMMENT '租户ID',
    `owner_id`             bigint        DEFAULT NULL,
    `owner_group_id`       bigint        DEFAULT NULL,
    `owner_org_id`         bigint        DEFAULT NULL COMMENT '统计用orgId',
    `org_id`               bigint        DEFAULT NULL,
    `sys_code`             varchar(200)  DEFAULT NULL COMMENT '系统编码',
    `project_id`           bigint        DEFAULT NULL,
    `object_state`         varchar(200)  DEFAULT NULL,
    `created_by`           bigint        DEFAULT NULL,
    `created_time`         datetime      DEFAULT NULL,
    `last_updated_by`      bigint        DEFAULT NULL,
    `last_updated_time`    datetime      DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=117 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;