


select * from idm_user t1
where 1 = 1
and t1.person_id = '756001554'



select * from pty_relationship t1
where 1 = 1
and t1.party_id_from = 756001575


select * from pty_party t1
where 1 = 1
and t1.id = 756001554


select * from pty_group t1
where 1 = 1
and t1.id = 376001540




select * from pty_relationship t1
where 1 = 1
-- and t1.org_id = 27009323
and t1.party_id_from = t1.party_id_to
;









