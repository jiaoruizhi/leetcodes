



select * from work_center wc 




select * from sf_task_instance t1
where t1.business_key = 847000010



select t1.apply_status, t1.* from ope_special_operation t1
where t1.id = 847000010;




select * from pfm_work t1
where t1.business_key = 847000010;



select * from work_center t1 
where 1 = 1
and t1.business_key in (
847000010
)
;


select * from version

