


describe hel_punish_record;

describe hel_violation_record ;


select t1.penalty, t1.* from hel_violation_record t1;


-- safety_hngh.hel_violation_record definition

drop table if exists hel_punish_record;-- safety_hngh.hel_punish_record definition

CREATE TABLE `hel_punish_record` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `violator_id` bigint(20) DEFAULT NULL COMMENT '违章人 违章人',
  `department_id` bigint(20) DEFAULT NULL COMMENT '部门 部门',
  `violator_date` date DEFAULT NULL COMMENT '违章日期 违章日期',
  `punish_date` date DEFAULT NULL COMMENT '处罚日期 处罚日期',
  `executor_id` bigint(20) DEFAULT NULL COMMENT '处罚执行人 处罚执行人',
  `punish_result` varchar(200) DEFAULT NULL COMMENT '处罚结果 处罚结果',
  `punish_reason` varchar(2000) DEFAULT NULL COMMENT '处罚原因 处罚原因',
  `pic_document_id` bigint(20) DEFAULT NULL COMMENT '相关图片 相关图片',
  `document_id` bigint(5) DEFAULT NULL COMMENT '相关文件 相关文件',
  `tenant_id` bigint(20) DEFAULT NULL COMMENT '租户ID',
  `sys_code` varchar(50) DEFAULT NULL,
  `project_id` bigint(20) DEFAULT NULL,
  `owner_id` bigint(20) DEFAULT NULL,
  `owner_group_id` bigint(20) DEFAULT NULL,
  `org_id` bigint(20) DEFAULT NULL,
  `object_state` varchar(200) DEFAULT NULL,
  `created_by` bigint(20) DEFAULT NULL,
  `created_time` datetime DEFAULT NULL,
  `last_updated_by` bigint(20) DEFAULT NULL,
  `last_updated_time` datetime DEFAULT NULL,
  `zhongyuan_id` bigint(10) DEFAULT NULL COMMENT '中远ID',
  `fine_amount` varchar(200) DEFAULT NULL,
  `violation_id` bigint(20) DEFAULT NULL COMMENT '违章ID',
  `description` varchar(200) DEFAULT NULL COMMENT '违章说明 违章说明',
  PRIMARY KEY (`id`),
  KEY `violator_id_index` (`violator_id`) BLOCK_SIZE 16384 GLOBAL,
  KEY `department_id_index` (`department_id`) BLOCK_SIZE 16384 GLOBAL,
  KEY `executor_id_index` (`executor_id`) BLOCK_SIZE 16384 GLOBAL,
  KEY `org_id_index` (`org_id`) BLOCK_SIZE 16384 GLOBAL
) AUTO_INCREMENT = 53000001 DEFAULT CHARSET = utf8mb4 ROW_FORMAT = DYNAMIC COMPRESSION = 'zstd_1.3.8' REPLICA_NUM = 3 BLOCK_SIZE = 16384 USE_BLOOM_FILTER = FALSE TABLET_SIZE = 134217728 PCTFREE = 0;


