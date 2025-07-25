

select * from ref_reference t1
where t1.element_code = 'employeeType'


select * from ope_special_operation t1
where 1 = 1
and t1.org_id = 27009365

select * from pfm_work t1
where 1 = 1
and t1.business_type = "deviceInspection"
order by t1.id desc

select * from work_center t1
where t1.org_id = 27009123
-- and t1.business_type = "device"

select * from dev_device_check_plan ddcp 


select * from pfm_work where 1 = 1
and org_id = 27009123
and business_type = 'deviceInspection'
-- and id = 1798367

select * from work_center t1
where 1 = 1
-- and t1.business_type = 'ope_inspection_work'
and org_id = 27009123
and name = ""
order by t1.id desc
-- and business_key = 1798367


select * from ref_reference t1
where 1 = 1
and data_code = 'spotCheckDevice'












