


select t1.status, t1.* from log_request t1 
where 1 = 1
and t1.url like '/api/exterior/risk/riskAssessmentLimit%'
order by t1.id desc ;


select t1.* from rsk_risk_assessment_limit t1
where t1.ganghang_id is not null