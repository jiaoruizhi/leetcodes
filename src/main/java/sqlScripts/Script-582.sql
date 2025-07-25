

-- GHISS00004120


select t1.complete_date, t1.overdue_status, t1.* from ins_issue t1
where t1.unique_code = 'ISS00013135'
;


update ins_issue t1
set t1.complete_date = '2024-11-07', t1.status = 'completed', overdue_status = 'normal'
where t1.id = 973000287;





describe dev_device;

select * from dev_device_head t1
where 1 = 1
and t1.id in (
select t2.id, t2.code from dev_device_zy_copy t2
)


select t2.id, t2.code, t1.id from dev_device_zy_copy t2
left join dev_device_head_zy_copy t1 on t1.device_id = t2.id







