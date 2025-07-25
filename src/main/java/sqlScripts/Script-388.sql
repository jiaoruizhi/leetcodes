



select t1.status, t1.url, t1.request_time, t1.* from log_request t1
where 1 = 1
-- and t1.status = '失败'
and t1.request_time >= '2024-11-22'
order by t1.id desc


select * from rsk_risk_hazard t1
where t1.id = 639000041


