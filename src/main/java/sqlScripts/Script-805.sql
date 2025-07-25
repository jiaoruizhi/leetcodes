


-- and relationship_type = 'employment'
-- and role_type_to = 'company'



select * from pty_relationship t1
where 1 = 1
and relationship_type = 'employment'
and role_type_to = 'company'
-- group by t1.relationship_type