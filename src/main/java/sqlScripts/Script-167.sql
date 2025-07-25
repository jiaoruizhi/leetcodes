

select * from ins_inspection t1
where t1.id = 974000013
;


select * from  ins_checkform_item t1
where t1.form_id = 119000006
order by t1.id asc
;

select * from dev_inspection_form t1
where 1 = 1
and t1.inspection_id = 974000013

