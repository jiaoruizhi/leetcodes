select t1.zhongyuan_id , t1.* from ins_inspection t1
where 1 = 1
and t1.check_category ='external'
and t1.status = 'completed'
and t1.unique_code = 'C00046477'
;


