

-- rsk_risk_unit



select * from rsk_risk_unit t1
where 1 = 1
order by t1.id desc

select * from ref_reference t1
where 1 = 1
and t1.element_code ="unitType"
;

select * from ref_reference t1
where 1 = 1
and t1.element_code ="accidentType"
;

