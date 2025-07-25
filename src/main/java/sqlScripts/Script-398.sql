


select * from ope_safety_measure t1
where 1 = 1
and t1.org_id = 27009365;

-- 53000003
-- 27064403

select * from base_related t1
where 1 = 1
and t1.id in (
61000001
);

select * from work_center wc where wc.business_key = 734000003;





-- 734000003
select t1.* from dev_device_change_record t1
where 1 = 1



select t1.* from ope_user_measures t1
where 1 = 1
and t1.business_key = 734000003


describe dev_device_head;


        select
            t1.*
        from rsk_risk_hazard t1
        where 1 = 1
          and (
            t1.zhongyuan_id is null
                or
            to_days(now()) - to_days(t1.created_time) <= 1
                or
            to_days(now()) - to_days(t1.last_updated_time) <= 1
            )
          and t1.org_id in (
            select party_id_from from pty_relationship where code like '001010%'  and role_type_from = 'company'
        )

