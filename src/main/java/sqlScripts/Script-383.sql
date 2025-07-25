






select t1.url, t1.status, t1.request_time, * from log_request t1
where 1 = 1
-- and t1.url like '&checkPlan&'
and t1.status = '失败'
order by t1.id desc



