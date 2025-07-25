

-- rsk_risk


select * from rsk_risk t1
where 1 = 1
order by t1.id desc
;



select * from rsk_risk_unit
where 1 = 1
and risk_id <> 354
;

select * from rsk_risk_assign
where 1 = 1
and business_type = "risk"
and business_key  = 354
;

update rsk_risk set code = "RS000000332" where id = 377