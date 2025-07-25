



select pw.name, pw.org_id , pw.`type`, pw.business_type,  pw.event_status_name, pw.party_group_id  , count(pw.id) from pfm_work pw 
where 1 = 1
-- and pw.org_id = 27009365
-- and pw.party_group_id = 27009377
group by pw.org_id ,pw.`type` ,pw.event_status_name , pw.party_group_id 
order by pw.`type` 



select * from pfm_work t1
where 1 = 1
and t1.business_type = "patrol"


select * from pfm_work pw 
where `type` = "spotCheck"