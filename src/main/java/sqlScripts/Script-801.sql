

select * from sf_apply_form t1
where t1.business_key = 108711;






ALTER TABLE `ins_inspection`
    ADD COLUMN `contain_issue_report_flag` tinyint(1) null COMMENT '是否统计入隐患内部报告';