


select * from lebs_group_overall_situation lgos 




select * from pty_party where name like '%爱森食品销售%';



select * from pty_relationship t1
where t1.party_id_from in (11989, 11990);





select * from pty_relationship t1
where t1.party_id_from = 8448;



update pty_relationship set object_state = 'enabled' where party_id_to = 8453 and relationship_type = 'organizational_structure';




select t1.id, t1.party_id_from, t2.id from pty_relationship t1
left join company_info t2 on t1.party_id_from = t2.id 
left join pty_party t3 on t3.id = t2.id
where 1 = 1
and relationship_type = 'organizational_structure'
and t1.role_type_from = 'company'
and t3.object_state = 'disabled'
;


delete from pty_relationship t1
where id in (
	select  id from (
	select t1.id from pty_relationship t1
left join company_info t2 on t1.party_id_from = t2.id 
left join pty_party t3 on t3.id = t2.id
where 1 = 1
and relationship_type = 'organizational_structure'
and t1.role_type_from = 'company'
and t3.object_state = 'disabled'
	) temp
);



