drop table if exists work_shift_handover;
create table work_shift_handover(
`id` bigint(20) not null auto_increment,
`work_date` date null comment '日期 日期',
`handover_time` date null comment '交班时间 交班时间',
`handover_person_id` bigint(20) null comment '交班人 交班人',
`remark` varchar(500) null comment '备注 备注',
`successor` bigint(20) null comment '接班人 接班人',
`succession_time` date null comment '接班时间 接班时间',
`hand_document_id` bigint(5) null comment '交班人签字 交班人签字',
`over_document_id` bigint(5) null comment '接班人签字 接班人签字',
`sys_code` varchar(20) null,
`tenant_id` bigint(20) null comment '租户ID',
`owner_id` bigint(20) null,
`owner_group_id` bigint(20) null,
`org_id` bigint(20) null,
`project_id` bigint(5) null,
`object_state` varchar(200) null,
`created_by`  bigint(20) null,
`created_time`  datetime null,
`last_updated_by`  bigint(20) null,
`last_updated_time`  datetime null,
primary key (`id`)
) engine=innodb auto_increment=1  comment='';
