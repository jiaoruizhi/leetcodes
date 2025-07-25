select
	t1.zhongyuan_id ,
	t1.*
from
	ins_issue t1
where
	1 = 1
	-- 	and t1.zhongyuan_id is not null 
;

select
	*
from
	ins_inspection t1
where
	1 = 1
	and t1.id = 887000020
-- 	and t1.zhongyuan_id is not null 



select
	*
from
	ins_inspection t1
where
	1 = 1
	and t1.zhongyuan_id is not null ;

select
	t1.*
from
	ins_issue t1
where
	1 = 1
	and t1.zhongyuan_id is null
	and t1.status = 'completed'
	and t1.org_id in (
	select
		party_id_from
	from
		pty_relationship
	where
		code like '001010%'
		and role_type_from = 'company'
        )