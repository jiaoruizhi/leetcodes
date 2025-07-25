

-- initial device type script


select
	*
from
	pty_party t1
where
	1 = 1
	and t1.`type` = "company"
	and t1.struct_type = "luan"
	;

select
	party_id_from
from
	pty_relationship
where
	code like '001010%'
	and role_type_from = 'company'
	

-- 初始化目录
select * from dev_device_category t1
where 1 = 1
and name = "安全设施"
;


INSERT INTO dev_device_category
(name, code, parent, seq, `hierarchy`, tenant_id, sys_code, project_id, owner_group_id, org_id, object_state, classify, zhongyuan_id)
select '安全设施', NULL, 0, '1', '1', 0, 'luan', NULL, NULL, t1.party_id_from, 'enabled',  'safetyDevice', null 
from
	pty_relationship t1
where
	t1.code like '001010%'
	and t1.role_type_from = 'company'
	and not exists (
		select 1 from dev_device_category t2 where t2.org_id = t1.party_id_from and t2.name = "安全设施"
	)
;

-- ----------------------------


select * from dev_device_category t1
where 1 = 1
-- and name = "安全设施"
and t1.org_id = 27009365
;


select
	t1.party_id_from as orgId,
	t2.id as parentId
from
	pty_relationship t1
join dev_device_category t2 on
	t2.org_id = t1.party_id_from
where
	1 = 1
	and t1.code like '001010%'
	and t1.role_type_from = 'company'
	and t2.name = "安全设施"


-- 微型消防站
insert
	into
	dev_device_category
(name,
	parent,
	seq,
	`hierarchy`,
	tenant_id,
	sys_code,
	project_id,
	owner_id,
	org_id,
	object_state,
	classify,
	zhongyuan_id)
select
	'微型消防站',
	tt.parentId,
	'4',
	'2',
	0,
	'luan',
	null,
	null,
	tt.orgId,
	'enabled',
	'miniFireStationDevice',
	null
from
	(
	select
		t1.party_id_from as orgId,
		t2.id as parentId
	from
		pty_relationship t1
	join dev_device_category t2 on
		t2.org_id = t1.party_id_from
	where
		1 = 1
		and t1.code like '001010%'
		and t1.role_type_from = 'company'
		and t2.name = "安全设施"
		and not exists (
			select 1 from dev_device_category t4 where t4.name = "微型消防站" and t4.parent <> 0 and t4.org_id = t1.party_id_from
		)
)tt
;



-- 消防设备

insert
	into
	dev_device_category
(name,
	parent,
	seq,
	`hierarchy`,
	tenant_id,
	sys_code,
	project_id,
	owner_id,
	org_id,
	object_state,
	classify,
	zhongyuan_id)
select
	'消防设备',
	tt.parentId,
	'4',
	'2',
	0,
	'luan',
	null,
	null,
	tt.orgId,
	'enabled',
	'fireDevice',
	null
from
	(
	select
		t1.party_id_from as orgId,
		t2.id as parentId
	from
		pty_relationship t1
	join dev_device_category t2 on
		t2.org_id = t1.party_id_from
	where
		1 = 1
		and t1.code like '001010%'
		and t1.role_type_from = 'company'
		and t2.name = "安全设施"
		and not exists (
			select 1 from dev_device_category t4 where t4.name = "消防设备" and t4.parent <> 0 and t4.org_id = t1.party_id_from
		)
	)tt
;




-- check result



select
	t1.party_id_from as orgId
from
	pty_relationship t1
where
	1 = 1
	and t1.code like '001010%'
	and t1.role_type_from = 'company'
	and (
		(select t2.id from dev_device_category t2 where t2.org_id = t1.party_id_from and t2.name = "微型消防站" and t2.parent <> 0) is null
	or  (select t2.id from dev_device_category t2 where t2.org_id = t1.party_id_from and t2.name = "消防设备" and t2.parent <> 0) is null
	or  (select t2.id from dev_device_category t2 where t2.org_id = t1.party_id_from and t2.name = "安全设施") is null
	)
	;
	
	
	
	
	


