










select t1.level, t1.* from pty_relationship t1
where t1.party_id_from = 27009365



select t1.level, t1.* from pty_relationship t1
where t1.party_id_from = 27009015

select t2.name,t1.level, t1.* from pty_relationship t1
left join pty_company  t2 on t2.id = t1.id
where t1.level = 1