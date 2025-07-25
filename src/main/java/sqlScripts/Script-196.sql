select
	idmuser0_.id as id1_129_,
	idmuser0_.created_by as created_2_129_,
	idmuser0_.created_time as created_3_129_,
	idmuser0_.last_updated_by as last_upd4_129_,
	idmuser0_.last_updated_time as last_upd5_129_,
	idmuser0_.object_state as object_s6_129_,
	idmuser0_.org_id as org_id7_129_,
	idmuser0_.owner_group_id as owner_gr8_129_,
	idmuser0_.owner_id as owner_id9_129_,
	idmuser0_.project_id as project10_129_,
	idmuser0_.sys_code as sys_cod11_129_,
	idmuser0_.tenant_id as tenant_12_129_,
	idmuser0_.device_token as device_13_129_,
	idmuser0_.device_type as device_14_129_,
	idmuser0_.employee_id as employe15_129_,
	idmuser0_.hangbiao_user_id as hangbia16_129_,
	idmuser0_.login_id as login_i17_129_,
	idmuser0_.master_account as master_18_129_,
	idmuser0_.mobile as mobile19_129_,
	idmuser0_.name as name20_129_,
	idmuser0_.person_id as person_21_129_,
	idmuser0_.relationship_id as relatio22_129_,
	idmuser0_.role_type as role_ty23_129_,
	idmuser0_.status as status24_129_,
	idmuser0_.type as type25_129_
from
	idm_user idmuser0_
where
	idmuser0_.login_id =161000050
	and idmuser0_.object_state = 'enabled'
order by
	idmuser0_.id desc