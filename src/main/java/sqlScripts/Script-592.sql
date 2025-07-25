


select t1.status, t1.* from ins_issue t1
where 1 = 1
-- and t1.unique_code = 'ISS00013128'
and t1.id = 1072000078
;


select t1.status, t1.unique_code, t1.* from ins_issue t1
where 1 = 1
-- and t1.unique_code = 'ISS00013128'
and t1.ganghang_id in(
1002000060,
1000000030,
1000000031,
1002000062,
1002000061
) 
;