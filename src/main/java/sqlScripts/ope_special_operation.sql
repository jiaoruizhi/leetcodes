-- ope_special_operation

describe ope_special_operation;



select
	t1.approval_company_name ,
	t1.gymnast_person_id,
	t1.*
from
	ope_special_operation t1
where
	1 = 1
	-- 	and form_id is not null
	and t1.id = 657000009
order by
	t1.id desc
;

