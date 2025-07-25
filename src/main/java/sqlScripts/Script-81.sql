


select * from dev_device_item t1
where 1 = 1
and t1.org_id = 27009365
order by t1.id desc

select* from tos_trigger_event tte 
order by tte.id desc

select * from pfm_work t1
where t1.trigger_event_id = 77000012