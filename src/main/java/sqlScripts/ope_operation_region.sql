


-- ope_operation_region

select * from ope_operation_region t1
where 1 = 1
-- and t1.id = 11000003
-- and t1.code = 1001
	and t1.code in ("2001", "1001")
-- and t1.name like "%洋浦%"
;


select t1.code, t1.name from ope_operation_region t1
where 1 = 1
and t1.code = 2001
;






select
	region.code as regionCode,
	t1.id,
	t1.ordinal,
	t1.region_id,
	t1.code,
	t1.name,
	t1.level,
	t1.compulsory_inspect_flag,
	t1.start_way,
	t1.random_number,
	t1.trigger_way,
	t1.inspect_photo_flag,
	t1.start_date,
	t1.end_date,
	t1.frequency_time,
	t1.accident_photo_flag,
	t1.violation_photo_flag,
	t1.issue_photo_flag,
	t1.photo_way,
	t1.violation_principal_flag,
	t1.accident_principal_flag,
	t1.issue_principal_flag,
	t1.status,
	t1.principal,
	t1.description,
	t1.document_id,
	t1.pic_document_id,
	t1.org_id,
	relat.code as relationshipCode,
	region.name as regionName,
	ref2.data_name as triggerWayName,
	pty1.name as principalName,
	t1.form_id,
	ins.name as formName,
	t1.coordinate
from
	ope_operation_location t1
left join pty_relationship relat on
	relat.party_id_from = t1.org_id
	and relat.role_type_from = 'company'
	and relat.object_state = 'enabled'
left join ope_operation_region region on
	region.id = t1.region_id
	-- left join ope_operation_region_type ope on ope.id =region.type 
left join ref_reference ref2 on
	ref2.data_code = t1.trigger_way
	and ref2.element_code = 'trigger_way'
left join pty_party pty1 on
	pty1.id = t1.principal
left join ins_checkform ins on
	ins.id = t1.form_id
where
	1 = 1
	and t1.org_id = 27009365
	and region.code in ("2001", "1001")
-- 		and t1.name = "19号西"
order by
	t1.id desc 




select * from ope_operation_location t1
-- left join ope_operation_region region on
-- 	region.id = t1.region_id
where 1 = 1
-- and t1.name like "%20号东%"
and t1.org_id = 27009123

select * from ope_operation_region t1
where code in (1001, 2001)






