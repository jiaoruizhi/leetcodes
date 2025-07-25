


select * from pfm_work t1
where t1.business_type = 'periodicInspection'




select * from work_center wc 
where wc.business_key in (
select t1.id from pfm_work t1
where t1.business_type = 'periodicInspection'
);