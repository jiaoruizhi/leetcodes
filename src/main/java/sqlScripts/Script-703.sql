


select p1.id, p1.name, p2.id, p2.name from pty_relationship t1
left join pty_party p1 on t1.party_id_from = p1.id
left join pty_party p2 on t1.party_id_to = p2.id
where t1.party_id_to = 27009418
and t1.role_type_from = 'company'
and t1.relationship_type = 'organizational_structure';


select * from pty_party t1
where t1.id = 27009504;



select t2.abbreviation, t1.name, t1.last_updated_time , t1.* from pty_party t1
left join company_info t2 on t1.id = t2.id
where 1 = 1
and t1.id in (
27009447,
27009456,
27009468,
27009479,
27009495,
27009504,
27009515,
27009517
);