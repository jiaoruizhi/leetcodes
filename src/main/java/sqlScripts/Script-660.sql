




select t1.gymnast_person_id, t1.director_person_id, t1.status, t1.work_code, t1.* from pfm_work t1
where 1 = 1
and t1.business_key = 1454
and t1.business_type = 'specialOperationPatrol'
;


select t1.gymnast_person_id, t1.director_person_id, t1.* from ope_special_operation t1
where 1 = 1
and t1.id = 629000008
;