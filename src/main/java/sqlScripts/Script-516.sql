
select t1.org_id, t3.name, t3.org_id, t1.* from pty_relationship t1
left join pty_party t2 on t2.id = t1.party_id_from
left join pty_party t3 on t3.id = t1.party_id_from
where 1 = 1
and t2.name like '%吴清铭%'
-- and t1.party_id_from = 724001742
-- and t1.relationship_type = 'employment'
-- and t1.org_id is null
and t3.org_id = 27009365

update pty_relationship t1
left join pty_party t2 on t2.id = t1.party_id_from
left join pty_party t3 on t3.id = t1.party_id_from
set t1.org_id = t3.org_id 
where 1 = 1
-- and t2.name like '%吴清铭%'
-- and t1.party_id_from = 724001742
-- and t1.relationship_type = 'employment'
and t1.org_id is null
and t3.org_id = 27009365
;





select t1.org_id, count(distinct(t1.org_id)), t1.* from pty_relationship t1
left join pty_party t2 on t2.id = t1.party_id_from
where 1 = 1
and t2.name like '%马新%'
-- and t1.party_id_from = 724001742
-- and t1.relationship_type = 'employment'
-- and t1.org_id is null
group by t1.org_id 

