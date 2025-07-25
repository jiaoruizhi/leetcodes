

select * from pty_relationship t1
where 1=1
and t1.party_id_from  = t1.party_id_to 
;



select * from dev_device_item t1
where 1 = 1
and t1.org_id = 27009365
and t1.phone = "123154323522"


select * from work_center t1
where 1 = 1
order by t1.id desc
;


select t1.duties, t1.* from employee_info t1





select t1.* from employee_info t1
left join pty_party t2 on t1.id = t2.id
where 1 = 1
and t2.created_time > '2024-11-12 15:28:00'
and t2.org_id = 27009365
order by t1.id desc
