		select
			t1.id
		from
			ins_issue t1
		left join ins_inspection t2 on
			t2.id = t1.inspection_id
		left join pty_relationship relat on
			relat.party_id_from = t1.org_id
			and relat.role_type_from = 'company'
			and relat.relationship_type = 'organizational_structure'
		left join ins_issue_object obj1 on
			t1.id = obj1.issue_id
		where
			1 = 1
-- 			and t1.status != 'draft'
-- 			and t1.result != 'normal'
-- 			and t1.status != 'beConfirmed'
			and t1.unique_code = 'GHISS00019049'
-- 			and t1.object_state = 'enabled'
-- 			and (t2.object_state = 'enabled'
-- 				or t1.external_code is not null)
				and (t1.org_id = 27009123)
			order by
				t1.created_time desc
				
				
				select * from ins_issue t1
				where t1.id = 956000036;
				
			
			
			
			
			select * from 