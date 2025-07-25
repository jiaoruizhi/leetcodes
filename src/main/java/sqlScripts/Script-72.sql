

select * from sche_plan



select pw.name, sp.name, sp.special_patrol_category from pfm_work pw 
left join sche_plan sp on pw.classes_id = sp.classes_id 
where 1 = 1
-- and sp.special_patrol_category is not null
and sp.id is not null

select special_patrol_category, * from sche_plan
where special_patrol_category is not null