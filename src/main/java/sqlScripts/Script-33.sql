Hibernate:
select
	deviceitem0_.id as id1_50_0_,
	deviceitem0_.created_by as created_2_50_0_,
	deviceitem0_.created_time as created_3_50_0_,
	deviceitem0_.last_updated_by as last_upd4_50_0_,
	deviceitem0_.last_updated_time as last_upd5_50_0_,
	deviceitem0_.object_state as object_s6_50_0_,
	deviceitem0_.org_id as org_id7_50_0_,
	deviceitem0_.owner_group_id as owner_gr8_50_0_,
	deviceitem0_.owner_id as owner_id9_50_0_,
	deviceitem0_.project_id as project10_50_0_,
	deviceitem0_.sys_code as sys_cod11_50_0_,
	deviceitem0_.tenant_id as tenant_12_50_0_,
	deviceitem0_.area as area13_50_0_,
	deviceitem0_.area_id as area_id14_50_0_,
	deviceitem0_.code as code15_50_0_,
	deviceitem0_.department_id as departm16_50_0_,
	deviceitem0_.end_date as end_dat17_50_0_,
	deviceitem0_.frequency as frequen18_50_0_,
	deviceitem0_.frequency_number as frequen19_50_0_,
	deviceitem0_.frequency_time as frequen20_50_0_,
	deviceitem0_.frequency_unit as frequen21_50_0_,
	deviceitem0_.name as name22_50_0_,
	deviceitem0_.parent_area_id as parent_23_50_0_,
	deviceitem0_.phone as phone24_50_0_,
	deviceitem0_.previous_time as previou25_50_0_,
	deviceitem0_.quantity as quantit26_50_0_,
	deviceitem0_.remark as remark27_50_0_,
	deviceitem0_.responsible_person_id as respons28_50_0_,
	deviceitem0_.start_date as start_d29_50_0_,
	deviceitem0_.status as status30_50_0_,
	deviceitem0_.unit as unit31_50_0_
from
	dev_device_item deviceitem0_
where
	deviceitem0_.id =?
