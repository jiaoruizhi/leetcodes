



select t1.id, t1.report_date, t1.org_id, t1.bzzaqjyhd from rep_security_month t1
where 1 = 1
and t1.type = 'securityMonthly'
and t1.report_date like '2025%'
and t1.org_id = 1
;



select t1.struct_type, t1.sys_code, t1.* from pty_party t1
where 1 = 1
order by t1.id desc



select * from pty_group t1
where 1 = 1
and t1.struct_code = '20010412'


        select g.id,g.code,g.status,g.struct_code,p.org_id,p.type,p.name
        from pty_group g
        left join pty_party p on g.id = p.id
        where g.struct_code = '20010229'
        and p.sys_code = 'luan'
        and g.status = 'enabled'
        and p.object_state = 'enabled'
        limit 1