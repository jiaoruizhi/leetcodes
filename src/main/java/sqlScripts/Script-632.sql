


-- 5547
select* from pty_party t1
where 1 = 1
-- and t1.name like '%王军%'





select t1.previous_date, t1.* from rsk_risk t1
where 1 = 1




select* from pfm_work t1
order by t1.id desc


select* from work_center t1
order by t1.id desc









ALTER TABLE `ins_issue` add column `rectification_require` longtext default null comment '整改要求';
ALTER TABLE `ins_issue` add column `rectify_people_id` bigint(10) default null comment '整改人ID';









