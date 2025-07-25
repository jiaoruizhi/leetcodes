









select t1.org_id, count(t1.id) from ins_inspection t1
where 1 = 1
and t1.check_category = 'company'
group  by t1.org_id 