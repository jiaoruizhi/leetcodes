







select * from log_request t1
where 1 = 1
and t1.business_type = 'StraitsFerry_queryInOutShip'
order by t1.id desc




select t1.id, t1.external_id, count(1) from tos_trigger_event t1
where 1 = 1
and t1.external_id is not null
group by t1.id desc 











select * from  event_dynamic_risk_event t1
where 1 = 1
and t1.org_id = 27009323
order by t1.id desc
;

update event_dynamic_risk_event t1
left join tos_trigger_event t2 on t1.business_key = t2.id
set t1.berth_id = t2.berth_id, t1.vsl_name = t2.vsl_name, t1.flight = t2.flight
where 1 = 1
and t1.org_id = 27009323
;













select * from event_dynamic_risk_event t1
left join (
select max(t1.id) as m, t1.berth_id, t1.vsl_name, t1.flight from event_dynamic_risk_event t1
where 1 = 1
and t1.org_id = 27009323
and t1.berth_id is not null
and t1.vsl_name is not null
and t1.flight is not null
group by t1.berth_id, t1.vsl_name, t1.flight
) t2 on t1.berth_id = t2.berth_id and t1.vsl_name = t2.vsl_name and t1.flight = t2.flight
where 1 = 1
and t1.id <> t2.m
;












