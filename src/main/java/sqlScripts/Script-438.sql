     select t1.id, t2.id,
     t1.issue_id, t2.issue_id
     from ins_rectification t1 
left join ins_rectification t2 on t1.ganghang_id = t2.ganghang_id and t1.id < t2.id
where 1 = 1
and t2.id is not null
;

select
	t1.*
from
	ins_rectification t1
	where t1.issue_id = 1011000224;



select
	t1.*
from
	ins_rectification t1
left join ins_rectification t2 on
	t1.ganghang_id = t2.ganghang_id
	and t1.id < t2.id
where
	1 = 1
	and t2.id is not null
;