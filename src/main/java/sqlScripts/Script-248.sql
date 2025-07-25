









select t1.id, t2.id, t2.name, pp.mobile, info.person_type from base_related_team t1
left join pty_party t2 on t2.id = t1.person_id 
left join pty_person pp on t1.person_id = pp.id
left join employee_info info on info.id =t1.person_id
where 1= 1
and t1.org_id = 27009365
order by t1.id desc

select * from pty_party t1
where t1.id = 607001885