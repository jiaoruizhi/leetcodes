



select t1.employee_id, t2.org_id , t1.* from employee_info t1
left join pty_party t2 on t1.id = t2.id
where 1 = 1
order by t1.id desc




select t1.* from pty_relationship t1
order by t1.id desc
