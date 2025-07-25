

-- base_related_team

SELECT t2.person_id, count(t1.id) from base_related t1 
left join base_related_team t2 on t2.related_id = t1.id
where 1 = 1
and t1.org_id = 27009365
-- and t2.person_id = 607001639
group by t2.person_id 
;



select p1.name, t1.* from base_related_team t1
left join base_related_team t2 on t2.related_id = t1.id
left join pty_person pp on pp.id = t1.person_id
left join pty_party p1 on p1.id = pp.id
where 1 = 1
and pp.mobile = "15841161413"
-- and t1.org_id = 27009365
order by t1.last_updated_time desc





select * from base_related_team t1
order by t1.last_updated_time 

529423893@qq.com



select * from pty_person pp
left join pty_party p1  on p1.id = pp.id 
where 1= 1
and p1.name like "于琦"


select* from pty_person pp
where pp.email like '%529423893%'


