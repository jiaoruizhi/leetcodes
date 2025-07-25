


select t1.ministry_safety_remark, t1.ministry_safety_time, t1.ministry_safety_person_id, t1.* from ope_special_operation t1
where t1.id = 692000006
;




select * from rsk_risk_hazard t1
where 1 = 1
and t1.risk_id in (475,476,477,465);

select t1.id, r.id,ru.id from rsk_risk_hazard t1
        left join rsk_risk r on r.id = t1.risk_id
        left join rsk_risk_unit ru on ru.id = t1.risk_unit_id
where 1 = 1
and r.id in (475,476,477,465);

select * from rsk_risk_hazard t1
where t1.org_id = 27009365
;