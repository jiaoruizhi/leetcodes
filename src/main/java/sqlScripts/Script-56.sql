

select * from sche_plan t1 
where t1.org_id = 27009323


select t1.equipment_parts, t1.* from dev_device t1
where t1.equipment_parts is not null


ALTER TABLE ope_special_operation ADD related_flag BOOL NULL COMMENT '是否为外部人员发起流程';