

--  employee_info



-- 查人
select
	e1.employee_id,
	p2.name,
	p1.mobile,
	p1.id as person_id,
	p2.org_id,
	pr2.code,
	p3.id as '所属部门ID',
	p3.name as '所属部门',
	pr.id,
	pr.role_type_from ,
	pr.role_type_to ,
	prt.name as '岗位名称',
	pr.org_id,
	e1.incase_flag ,
	e1.sys_code ,
	p2.*
from
	pty_person p1
left join pty_party p2 on
	p1.id = p2.id
left join employee_info e1 on
	p1.id = e1.id
left join pty_relationship pr on
	p1.id = pr.party_id_from
left join pty_party p3 on
	p3.id = pr.party_id_to
LEFT JOIN idm_user iu ON 
	iu.person_id = p1.id
left join pty_role_type prt on
	prt.code = pr.role_type_from and prt.org_id = pr.org_id 
left join pty_relationship pr2 on
	p2.org_id = pr2.party_id_from
where
	1 = 1
-- and p2.id = 734001552
-- 	and p1.mobile = "15700007996"
-- 	and p2.org_id = 27009447
-- 	and p2.id = 27009015
--  	and e1.employee_id = '17906001'
-- 	and p2.name like "%王定宇"
--  and p2.`type` = "company"
	and e1.employee_id = "17900759"
-- 	and p2.org_id = 27009365
-- 	and p1.group_id = 27009397
-- 	and p2.name like '%陈坚'
-- 	and p1.email = '529423893@qq.com'
-- 	and p2.org_id in (27009123)
-- 	and iu.id = 443000067
-- 	and e1.person_type = 'external'
;

-- GH00010106
-- 285000049

select * from pty_person p1 where p1.id = 800001559;
select * from pty_party p1 where p1.id = 27009447;
select * from employee_info p1 where p1.id = 800001559;
select * from idm_user p1 where p1.person_id = 800001559;
select * from pty_role_type p1 where p1.code = 'R000145';

select* from pty_relationship t1
where t1.party_id_from = 607001945;


-- 查公司
select
	p1.id,
	p1.name,
	pr.role_type_to as 本级类型,
	p2.id as 下级公司Id,
	p2.name as 下级公司名称,
	pp2.mobile ,
	pr.role_type_from as 下级类型,
	p3.id as 上级公司Id,
	p3.name as 上级公司名称,
	pr2.role_type_to as 上级类型,
	pp2.mobile,
	p1.tenant_id ,
	p1.*
from
	pty_party p1
	left join pty_relationship pr on p1.id = pr.party_id_to 
	left join pty_relationship pr2 on p1.id = pr2.party_id_from
	left join pty_party p2 on p2.id = pr.party_id_from
	left join pty_party p3 on p3.id = pr2.party_id_to
	left join pty_person pp2 on pp2.id = p2.id
	left join company_info ci on ci.id = p1.id
where
	1 = 1
	and p1.id = 35000133
-- 	and p1.id in (27009386, 27009377,27009375)
-- 	and p1.name like '%中远海运重工有限公司%'
-- 		and p1.name = '中远海运重工有限公司'
-- 	and p1.`type` = "company"
-- 	and p2.`type` = "company"
;
-- 27009365  通用码头
-- 679001551 中远海科

-- 27009093  集装箱板块
-- 27009094  集装箱码头
-- 27009123  国际港务
-- 27009323  新海轮渡
-- 27009166  船舶燃料
-- 27009418  港航物流
-- 27009447  港航供应链
-- 27009153  现代服务
-- 27009169  实业发展
-- 27009237  海峡轮渡


-- 查部门
select
	*
from
	pty_party p1
where
	1 = 1
-- 	and p1.name like '%中控%'
-- 	and p1.id = 27009447
-- 	and p1.`type` = "person"
	and p1.org_id = 27009153
-- 	and p1.id in (412001675, 412001677)
;


select t1.principal, t1.* from company_info t1
where 1 = 1
and t1.id = 27009447

select * from company_info t1 where t1.id = 27009447



select
	t1.id, t1.struct_code , t2.name
from
	pty_group t1
left join pty_party t2 on t1.id = t2.id
where
	1 = 1
	and t1.id in (27009094,27009123)
-- 	and party.id = 27061497
	-- and ei.employee_id = 27064550
	-- and party.name = '王东'
;

select* from idm_user t1
where 1= 1
and t1.id = 308000048


