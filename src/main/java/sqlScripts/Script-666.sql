




select * from ins_inspection t1
where 1 = 1
-- and t1.data_source is not null 
-- and t1.org_id = 27009365
order by t1.id desc


select * from ins_issue t1
where 1 = 1
and t1.data_source is not null 
-- and t1.org_id = 27009365
order by t1.id desc






select * from ope_user_measures t1
where 1 = 1
and t1.business_key = 806000003