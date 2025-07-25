
-- select t1.status , t1.* from dev_inspection_form t1
-- where 1 = 1
-- and t1.device_item_id = 5
-- order by t1.id desc






update dev_device_item set previous_time = null;



delete from work_center where `type` like '%periodic%';


delete from pfm_work where type like '%periodic%';
