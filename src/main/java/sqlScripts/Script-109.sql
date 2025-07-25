select t1.status, count(t1.id) from pfm_work t1
where t1.business_type = "periodicInspection"
group by t1.status