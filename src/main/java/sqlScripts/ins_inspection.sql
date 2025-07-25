

-- ins_inspection


select * from ins_inspection t1
left join ins_inspection_item t2 on t2.inspection_id = t1.id
where 1 = 1
-- and superior_confirm_flag is not null
-- AND t1.id = 2374
and t2.id is not null
order  by t1.id desc
;