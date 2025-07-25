alter table `cer_certificate`
add column type varchar(200) null COMMENT '类型';


select * from ref_reference t1
where 1 = 1
and t1.element_code = 'certificationType'



select t1.*  from cer_certificate t1
where 1 = 1
and t1.org_id = 1
order by t1.id desc



ALTER TABLE company_info ADD category varchar(200) NULL COMMENT '分类';
ALTER TABLE company_info ADD sub_category varchar(200) NULL COMMENT '子分类';









