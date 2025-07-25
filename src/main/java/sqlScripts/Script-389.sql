
select * from log_request t1
where 1 = 1
and t1.status = '失败'
-- and t1.url like '%/api/exterior/teamMeeting/createForExternal%'
and t1.request_time >= '2024-11-20'
order by t1.id desc


-- 1066000027
-- 1072000284

select * from ins_inspection t1
where t1.ganghang_id = 1069000126


select * from ins_inspection_item t1
where t1.inspection_id = 1072000284







select * from log_request t1
where 1 = 1
and t1.url = '/api/exterior/risk/hazard/exteriorForHazard'
order by t1.id desc


select * from rsk_risk_hazard t1
where 1 = 1
-- and t1.id = 380000044


























