




-- 13215715308
-- 13687503108



select * from idm_user t1
where t1.mobile like '%13687503108'



select * from login where 1 = 1
and mobile like '%13687503108'





select t1.name, t3.employee_id, t2.mobile, t1.org_id,  t1.* from pty_party t1
left join pty_person t2 on t1.id = t2.id
left join employee_info t3 on t1.id = t3.id
where 1 = 1
-- and t1.name = '刘旭宝'
and t2.mobile like '%13687503108%';



select * from pty_person t1 where t1.id = 806001558;