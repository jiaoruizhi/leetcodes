


select t2.name, t1.party_group_id, t1.* from sche_plan t1
left join pty_party t2 on t2.id = t1.party_group_id 
where 1 = 1
and t1.org_id = 27009323
and t1.special_patrol_category = 'day'
order by t1.id desc



select * from sche_plan where id = 116000006



