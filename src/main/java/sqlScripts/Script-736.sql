


ALTER TABLE `ins_inspection`
    ADD COLUMN `check_category` varchar(200) null COMMENT '检查分类';





ALTER TABLE `ins_inspection_item`
    ADD COLUMN `inspect_by` bigint(10) null COMMENT '检查人';
ALTER TABLE `ins_inspection_item`
    ADD COLUMN `picture_document_id` bigint(10) null COMMENT '图片';



ALTER TABLE `ins_issue`
    ADD COLUMN `location` varchar(200) null COMMENT '位置 位置';






ALTER TABLE `pty_person`
    ADD COLUMN `party_group_name` varchar(200) null COMMENT '部门名称';





   
   select * from ref_reference t1
   where t1.element_code = 'issueReportCofirmPerson'


   
   
   select * from pty_person t1
   where 1 = 1
   and t1.mobile = '13043536338'
   
   
   
                   select
        pty1.id, pty2.name, pty2.type, pty1.mobile, pty1.sex, pty1.email, pty1.status,
        pty1.party_group_name,
        pty2.org_id, pty2.owner_group_id
        from pty_person pty1
        left join pty_party pty2 on pty1.id = pty2.id
   where 1 = 1
   and pty1.mobile = '13043536338'
   
   
   select * from pty_party t1
   where 1 = 1
   and t1.id = 24825






