

ALTER TABLE safety_hngh.idm_user ADD hangbiao_user_id BIGINT NULL COMMENT '航标用户ID';
ALTER TABLE safety_hngh.pty_relationship ADD `sequence` BIGINT NULL COMMENT '排序顺序';

select * from idm_user 
where 1 = 1
-- and name like "%邓小%"
-- where hangbiao_user_id is not null
and person_id = 27061944
;

select * from pty_person where id = 615001529

-- org_id 27009015
-- struct code  50168871

select * from pty_group
where id = 27009015