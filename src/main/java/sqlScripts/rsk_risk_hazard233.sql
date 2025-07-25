


select * from rsk_risk_hazard t1
where t1.org_id = 27009123

update rsk_risk_hazard set accident_type = '其他伤害1' where id = 6807 


select * from rsk_risk t1
where t1.org_id = 27009123

select * from rsk_risk_unit t1
where 1 = 1
and t1.org_id = 27009123
-- and t1.code is null
order by t1.id desc

select t1.* from acc_accident_classification t1 
order by t1.id desc;

select * from rsk_control_measures t1
where 1 = 1
and t1.org_id = 27009123
order by t1.id desc
-- and t1.hazard_id = 123


select * from excel_upload_report eu 
order by eu.id desc

delete from rsk_risk_unit t1
where t1.org_id = 27009123
and t1.risk_id <> 457


select * from dev_manage_area t1
where t1.org_id = 27009123;


select t1.status from hel_violation_record t1
where 1 = 1
group by t1.status





