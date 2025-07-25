


select * from idm_user t1
where t1.org_id = 27009015


select * from base_related_certificate

select previous_time from sche_plan where id = 150;


select * from hel_violation_record t1
where 1 = 1
-- and t1.org_id = 27009365
order by t1.id desc

select * from hel_punish_record t1
where 1 = 1
-- and t1.org_id = 27009365
order by t1.id desc

describe hel_punish_record;

ALTER TABLE `hel_punish_record`
modify COLUMN `description` bigint null COMMENT '描述 描述';