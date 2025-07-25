
849001551

select t3.* from pty_party t1
left join pty_person t2 on t1.id = t2.id
left join employee_info t3 on t3.id = t1.id
where 1 = 1
and t2.mobile = '13976903158'



select * from pty_party
where id = 27009169


select * from idm_user t1
where t1.person_id = 849001551




select * from pty_party t1
where 1 = 1
and t1.name like '%港航供应链%'




select level_num , * from ins_issue t1
order by t1.id desc









