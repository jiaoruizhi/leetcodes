select
	riskassess0_.id as id1_220_,
	riskassess0_.created_by as created_2_220_,
	riskassess0_.created_time as created_3_220_,
	riskassess0_.last_updated_by as last_upd4_220_,
	riskassess0_.last_updated_time as last_upd5_220_,
	riskassess0_.object_state as object_s6_220_,
	riskassess0_.org_id as org_id7_220_,
	riskassess0_.owner_group_id as owner_gr8_220_,
	riskassess0_.owner_id as owner_id9_220_,
	riskassess0_.project_id as project10_220_,
	riskassess0_.sys_code as sys_cod11_220_,
	riskassess0_.tenant_id as tenant_12_220_,
	riskassess0_.danger_limit as danger_13_220_,
	riskassess0_.lower_limit as lower_l14_220_,
	riskassess0_.risk_level as risk_le15_220_,
	riskassess0_.type as type16_220_,
	riskassess0_.upper_limit as upper_l17_220_
from
	rsk_risk_assessment_limit riskassess0_
where
1 = 1
-- 	(riskassess0_.type like "固有风险升级" escape "固有风险升级")
-- 	and riskassess0_.object_state = "enabled"
	and riskassess0_.org_id = 27009365