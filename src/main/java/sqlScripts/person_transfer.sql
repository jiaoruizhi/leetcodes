





-- 公司人员转移


select* from pty_party t1
where 1 = 1
and t1.object_state = 'enabled'
and t1.`type` = 'person'
and t1.org_id = 13510
;



-- 零售事业部 -   零售事业部（光明商业）
-- 
-- 30457
-- 31688


-- 供应链 -   供应链（光明商业）
-- 
-- 30291
-- 31689


-- 资产管理 -   资产管理（光明商业）
-- 
-- 30474
-- 31690

-- 商业
-- 13510
-- 8185


-- and relationship_type = 'employment'
-- and role_type_to = 'company'



select * from pty_relationship t1
where 1 = 1
and relationship_type = 'employment'
and role_type_to = 'company'
-- group by t1.relationship_type
;








select * from pty_relationship t1
where 1 = 1
and relationship_type = 'employment'
and role_type_to = 'company'
-- group by t1.relationship_type
;


		select * from pty_relationship where 1 = 1
		and relationship_type = 'employment'
		and role_type_to = 'company'
		and party_id_from in (
			select id from pty_party
			where 1 = 1
			and type = 'person'
			and org_id = 31688
		);
		
		select * from pty_relationship where org_id = 30474;

-- 13510
-- 8185
--  以下为实操脚本


update pty_party t1
set t1.org_id = 8185
where 1 = 1
and t1.object_state = 'enabled'
and t1.`type` = 'person'
and t1.org_id = 13510
;


update pty_relationship t1
set t1.org_id = 8185, t1.party_id_to = 8185
where 1 = 1
and t1.id in (
	select id from (
		select id from pty_relationship where 1 = 1
		and relationship_type = 'employment'
		and role_type_to = 'company'
		and party_id_from in (
			select id from pty_party
			where 1 = 1
			and type = 'person'
			and org_id = 8185
		)
	) tmp
);



update idm_user t1
left join pty_party t2 on t1.person_id = t2.id
set t1.org_id = t2.org_id
where t1.org_id = 13510
;



-- 零售事业部 -   零售事业部（光明商业）
-- 30457
-- 31688
-- 供应链 -   供应链（光明商业）
-- 30291
-- 31689
-- 资产管理 -   资产管理（光明商业）
-- 30474
-- 31690
-- 商业
-- 13510
-- 8185

-- base_project
-- base_project_related


update set_personal_setting set org_id = 31688 where org_id = 30457;
update base_project set org_id = 31688 where org_id = 30457;
update base_project_related set org_id = 31688 where org_id = 30457;






update set_personal_setting set org_id = 31689 where org_id = 30291;
update base_project set org_id = 31689 where org_id = 30291;
update base_project_related set org_id = 31689 where org_id = 30291;

update set_personal_setting set org_id = 31690 where org_id = 30474;
update base_project set org_id = 31690 where org_id = 30474;
update base_project_related set org_id = 31690 where org_id = 30474;

update set_personal_setting set org_id = 8185 where org_id = 13510;
update base_project set org_id = 8185 where org_id = 13510;
update base_project_related set org_id = 8185 where org_id = 13510;





update base_business_project set org_id = 31688 where org_id = 30457;
update base_business_related set org_id = 31688 where org_id = 30457;

update base_business_project set org_id = 31689 where org_id = 30291;
update base_business_related set org_id = 31689 where org_id = 30291;

update base_business_project set org_id = 31690 where org_id = 30474;
update base_business_related set org_id = 31690 where org_id = 30474;

update base_business_project set org_id = 8185 where org_id = 13510;
update base_business_related set org_id = 8185 where org_id = 13510;

