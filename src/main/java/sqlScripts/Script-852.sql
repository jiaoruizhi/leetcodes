




-- zhongyuan.doris_audit_log definition

CREATE TABLE `doris_audit_log` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `operate_time` datetime DEFAULT NULL COMMENT '操作时间 操作时间',
  `username` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '用户名 用户名',
  `name` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '姓名 姓名',
  `user_id` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '用户id 用户id',
  `person_id` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '人员id 人员id',
  `business_key` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '业务id 业务id',
  `business_type` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '业务类型 业务类型',
  `operator` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '操作人 操作人',
  `type` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '类型 类型',
  `operate_type` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '操作类型 操作类型',
  `value` varchar(8000) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '参数 参数',
  `remark` varchar(2000) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '备注 备注',
  `class_name` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '类名 类名',
  `tenant_id` bigint DEFAULT NULL COMMENT '租户ID',
  `sys_code` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `project_id` bigint DEFAULT NULL,
  `owner_id` bigint DEFAULT NULL,
  `owner_org_id` bigint DEFAULT NULL,
  `owner_group_id` bigint DEFAULT NULL,
  `org_id` bigint DEFAULT NULL,
  `object_state` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `created_by` bigint DEFAULT NULL,
  `created_time` datetime DEFAULT NULL,
  `last_updated_by` bigint DEFAULT NULL,
  `last_updated_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;