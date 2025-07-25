

select * from frep_safety_month t1
order by t1.id desc

select * from frep_safety_month_addition t1
order by t1.id desc



select * from ins_checkform_item t1







select * from ins_issue t1
where 1 = 1
-- and t1.code = 'I00026809'
and t1.description like "%20240905-0008--%"


select t1.category, t1.* from ins_inspection t1
where t1.id = 9837




select * from idm_user t1
where 1= 1
and (t1.user_type != 'issueReport' or t1.user_type is null)






select * from ins_issue 




