


select t1.status, t1.* from log_request t1
where 1 = 1
-- and t1.url = '/api/exterior/risk/hazard/exteriorForHazard'
and t1.status = '失败'
order by t1.id desc




select t1.status, t1.url, t1.request_time, t1.* from log_request t1
where 1 = 1
and t1.status = '失败'
and t1.request_time >= '2024-11-22'
order by t1.id desc



select * from pfm_work t1
where t1.id = 1174000036




