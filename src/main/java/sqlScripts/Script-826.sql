



select t1.device, t1.* from dev_device_check_plan t1;



update rsk_safety_check set previous_date = null;



select * from pfm_work t1
where t1.business_type = 'deviceInspection'






select * from rsk_safety_check t1
where t1.id = 1

select * from pfm_work t1
where t1.id = 662


select t1.work_id, t1 .* from dev_inspection_form t1
where 1 = 1
-- and t1.work_id = 662
-- and t1.safety_check_id = 1
order by t1.id desc



select * from pty_relationship t1
where 1 = 1
and t1.relationship_type = 'employment'
and t1.role_type_to = 'department'







select * from ref_reference t1 where t1.element_code = 'issueStatus'






select t1.coordinate , t1.* from company_info t1


select t1.coordinates , t1.* from rsk_major_hazard t1

select t1.coordinate , t1.* from eme_water_monitor t1

select t1.type, t1.coordinate , t1.* from risk_area t1
where 1 = 1
and t1.`type` = 'prevention'
;


select t1.coordinate , t1.* from report t1;


alter table company_info add column location_point Point comment '';
alter table rsk_major_hazard add column location_point Point comment '';
alter table eme_water_monitor add column location_point Point comment '';
alter table risk_area add column location_point Point comment '';
alter table report add column location_point Point comment '';




select * from pty_relationship where party_id_from = 24867;



select * from pty_relationship where id = 32118;







