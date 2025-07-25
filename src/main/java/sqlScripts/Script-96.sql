select t1.apply_status ,t1.* from ope_special_operation t1
where 1 = 1
-- and t1.apply_status = "complete"
group by t1.apply_status 