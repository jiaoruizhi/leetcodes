



select * from ins_checkform where ganghang_id is not null


select * from ins_checkform_item t1
left join ins_checkform t2 on t1.form_id = t2.id
where t1.ganghang_id is not null


select * from ins_checkform_link t1
left join ins_checkform t2 on t1.form_id = t2.id
where 1 = 1
and t2.ganghang_id is not null
order by t1.id desc