select
			t1.*
		from
			base_related_team t1
		left join pty_party pty on
			pty.id = t1.person_id
		left join base_related related on
			related.id = t1.related_id
		left join ref_reference ref3 on
			ref3.data_code = related.type
			and ref3.element_code = 'relatedNewType'
		left join employee_info info on
			info.id = t1.person_id
		left join pty_person pty2 on
			t1.person_id = pty2.id
		left join pty_party pty5 on
			pty.org_id = pty5.id
		left join pty_relationship relat on
			relat.party_id_from = pty5.id
			and relat.role_type_from = 'company'
			and relat.object_state = 'enabled'
		left join pty_group pty6 on
			pty6.id = pty5.id
		left join ref_reference ref on
			ref.element_code = 'sex'
			and ref.data_code = pty2.sex
		left join pty_relationship relat1 on
			relat1.party_id_from = info.id
			and relat1.relationship_type = 'employment'
-- 		left join pty_party pty3 on
-- 			relat1.party_id_to = pty3.id
		where
			1 = 1
			and pty5.id = 27009365
			and t1.object_state = 'enabled'
			and t1.id = 156
		order by
			t1.id desc
-- 		limit 0, 30