


select * from rsk_risk t1
where t1.code = 'HKJS-ZY06'
;


select t1.object_state, t1.* from rsk_risk_hazard t1
left join rsk_risk t2 on t1.risk_id = t2.id
where 1 = 1
and t1.id = 646000310
-- and t2.id is null
order by t1.id desc


select * from tos_trigger_event t1
where t1.trends = 'SMMS_VSL_PLAN'
and t1.org_id = 27009123
order by t1.id desc