

select t2.name, t1.party_id_from, t3.mobile, t1.*, t1.role_type_to from pty_relationship t1
left join pty_party t2 on t2.id = t1.party_id_from 
left join pty_person t3 on t3.id = t1.party_id_from
where 1 = 1
and t2.name = '林宝'
-- and t1.party_id_from = 722001557
and t1.org_id = 27009365
-- and t1.relationship_type = 'employment'
-- group by t1.party_id_from 
;