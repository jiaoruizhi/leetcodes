


select * from tos_trigger_event t1
where 1 = 1
and t1.org_id = 27009365
order by t1.id desc



select * from work_center wc
where 1 = 1
and wc.id in (
895000178,
894000174,
893000186,
891000189,
889000188,
888000194
); 

select * from pfm_work t1
where 1 = 1
and t1.id in (1178000145);


select wc.business_type, t2.business_type from work_center wc
left join pfm_work t2 on t2.id = wc.business_key 
where 1 = 1
and wc.business_type = 'deviceInspection'
and wc.business_type <> t2.business_type 



update work_center t1 set t1.business_type = 'deviceInspection'
where t1.`type` = 'deviceInspection'
and t1.business_type <> 'deviceInspection'
;

