



select * from pfm_work t1
where 1 = 1
and t1.org_id = 27009323
and t1.business_type = 'periodicInspection'


select * from work_center wc
where wc.business_key in (
select t1.id from pfm_work t1
where 1 = 1
and t1.org_id = 27009323
and t1.business_type = 'periodicInspection'
)