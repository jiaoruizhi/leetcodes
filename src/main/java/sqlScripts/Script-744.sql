


select * from pty_party t1
where t1.`type` = 'company'




select * from ref_reference t1
where t1.element_code = "issueStatus";




select * from idm_role t1
order by t1.id desc



select * from work_center t1
order by t1.id desc


select * from idm_user t1
where t1.mobile  = '15821025720'


select * from pty_person t1
where t1.id= 8240


INSERT INTO REF_REFERENCE
(ELEMENT_NAME, ELEMENT_CODE, DATA_NAME, DATA_VALUE, DATA_CODE, DATA_TYPE, DATA_SEQUENCE, TENANT_ID,  OWNER_ID, OWNER_GROUP_ID, OBJECT_STATE, CREATED_BY, CREATED_TIME, LAST_UPDATED_BY, LAST_UPDATED_TIME, ORG_ID)
VALUES('隐患状态', 'issueStatus', '待确认', '待确认', 'beConfirmed', 'String', '1', 0, 3, NULL, NULL, NULL, NULL, 3, '2021-09-14 17:07:01.000', 9);







select t1.created_time, t1.* from ins_issue t1