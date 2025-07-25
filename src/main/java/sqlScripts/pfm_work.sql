

-- pfm_work


describe pfm_work;

select
-- 	t1.id,
-- 	t1.name,
-- 	t1.status,
-- 	t1.event_status_name,
-- 	t1.org_id,
	t1.*
from
	pfm_work t1
where
	1 = 1
-- 	and t1.id = 1076000007
	-- and t1.status in ("created")
	-- and t1.event_status_name in ("靠泊", "离泊")
-- 	and t1.`type` = "periodicInspection"
	and t1.org_id = 27009365
	and business_key in  (
		select tt.id from dev_device_item tt where tt.org_id = 27009365
	)
order by t1.id desc
limit 0, 100000
;

select
	*
from
	pfm_work
where
	1 = 1
	and id = 1792077
	and form_id is not null
	-- and event_status_name in ("靠泊", "离泊")
order by id desc
;


select
	*
from
	pfm_work
where
	1 = 1
	-- and business_key = 611
-- 	and business_type = "specialOperationPatrol"
-- 	and type != "periodicity"
	-- and form_id is not null
	-- -- and event_status_name in ("靠泊", "离泊")
	-- and party_group_id = 27009365
order by
	id desc


select
	count(id), business_type 
from
	pfm_work
where
	1 = 1
	-- and business_key = 611
-- 	and business_type like "%rela%"
-- 	and type != "periodicity"
	-- and form_id is not null
	-- -- and event_status_name in ("靠泊", "离泊")
	-- and party_group_id = 27009365
group by business_type
order by
	id desc
	
	
	

select
	pw.*,
	pw.business_type,
	pw.type,
	wc.business_type
from
	pfm_work pw
left join work_center wc on
	wc.business_key = pw.id
where
	1 = 1
	and wc.org_id = 27009365
	and wc.id is null
	and pw.business_type in ( "patrol", "operationInspection" )
	-- and pw.`type` = "periodicInspection"
order by
	pw.business_type
	-- group by business_type
;


select pw.id, pw.business_type, pw.type, sti.business_type 
from pfm_work pw
left join sf_task_instance sti on sti.business_key = pw.id
where 1 = 1
and pw.org_id = 27009365
and pw.id is not null
and pw.business_type not in ( "patrol", "operationInspection", "periodicInspection", "deviceInspection", "risk", "specialOperationPatrol" )
-- and pw.business_type = "risk"
order by pw.business_type 
-- group by business_type
;



select t1.assigner_person, t1.* from pfm_work t1
where 1 = 1
-- and 
order by t1.id desc 
;


