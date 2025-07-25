



insert into doris_access_log_doc 
select * from doris_access_log t1
where 1 = 1
and t1.access_date < '2024-08-01'

delete from doris_access_log t1 
where t1.id in (
select t2.id from doris_access_log_doc t2
)


select * from doris_access_log_doc t1
where 1 = 1
and t1.access_date < '2024-08-01'



select * from doris_access_log_doc