-- risk assessment limit



select * from rsk_risk_assessment_limit t1
where 1= 1
-- and t1.`type` = "作业条件危险性分析(LEC)"
and t1.org_id = 27009365
order by t1.id desc
;