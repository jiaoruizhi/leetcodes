
-- ins_issue




describe ins_issue;





select
	t1.id,
	t1.`level` ,
	ref3.data_name as levelName
from
	ins_issue t1
left join ref_reference ref3 on ref3.element_code = 'issueLevel' and t1.level = ref3.data_code
-- where level_num is not null
where 1 = 1
-- 	and ref3.data_name = "否"
-- and id = 3160
order by t1.created_time desc
;



select t1.inspect_object , t1.inspect_object_category from ins_issue t1
order by t1.id desc ;






select
	t2.business_key 
from
	ins_issue t1
left join ins_inspection_item t3 on
	t3.id = t1.inspection_item_id
left join ins_inspection t2 on
	t2.id = t3.inspection_id
where
	1 = 1
	and t1.id = 3333