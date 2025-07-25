

-- ins_checkform_item

select * from ins_checkform_item
;


select
	t1.id,
	t1.name,
	t2.name as formName,
	t1.category,
	t1.*
from
	ins_checkform_item t1
left join ins_checkform t2 on
	t1.form_id = t2.id
where
	1 = 1
	-- and t1.id = 123
-- 	and t2.id = 116000012
-- 	and t2.name like "%线材%"
;




























