



select t2.trends, t1.* from pfm_work t1
left join tos_trigger_event t2 on t1.trigger_event_id = t2.id 
where 1 = 1
and t1.org_id = 27009365
and t2.trends = 'SMMS_VSL_WORKING'
and t1.business_type = 'patrol'
order by t1.id desc