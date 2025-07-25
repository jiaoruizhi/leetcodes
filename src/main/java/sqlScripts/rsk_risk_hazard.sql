-- risk hazard


select t1.unique_code ,t1.* from rsk_risk_hazard t1
where 1 = 1
-- and ganghang_id = 5700
and t1.org_id = 27009365
order by t1.id desc
;




select * from rsk_control_measures rcm 
where hazard_id = 5701
order by id desc
;


select * from rsk_risk_assign
where 1 = 1
-- and business_key = 5701
and business_type = "hazard"
order by id desc
;


