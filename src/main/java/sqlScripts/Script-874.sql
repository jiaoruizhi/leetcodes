







select * from work_center t1
where 1 = 1
-- and t1.releaser is null
order by t1.id desc




update work_center t1
set t1.releaser = 0
where 1 = 1
and t1.releaser is null
order by t1.id desc