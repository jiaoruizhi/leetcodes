select * from pfm_work t1
where 1 = 1
and t1.org_id = 27009418
order by t1.id desc


select * from pty_role_type  t1
where 1 = 1
and t1.org_id = 27009418
and t1.name = "部门负责人"
;



select * from pty_relationship t1
where 1 = 1
and t1.party_id_to = 27009426

select t1.name, t1.department_id, t2.name from ope_operation_region t1
left join pty_party t2 on t1.department_id = t2.id
where 1 = 1
and t1.org_id = 27009418