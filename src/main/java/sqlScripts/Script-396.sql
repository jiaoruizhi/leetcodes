


describe sch_scheduling_classes


select t1.* from dev_device_item t1 where t1.id = 14000001


-- 698000006
select * from PFM_WORK T1 where t1.id = 1171000532


select * from work_center wc where wc.business_key = 1171000532



select t1.start_date , t1.* from dev_device t1
where t1.ganghang_id is not null


-- 277000300
select * from log_request t1
where 1 = 1
order by t1.id desc






select * from pty_group t1
where 1 = 1
and t1.struct_code = '20010801'


        select g.id,g.code,g.status,g.struct_code,p.org_id,p.type,p.name
        from pty_group g
        left join pty_party p on g.id = p.id
        where g.struct_code = '20010801'
        and p.sys_code = 'luan'
        and g.status = 'enabled'
        and p.object_state = 'enabled'
        limit 1





