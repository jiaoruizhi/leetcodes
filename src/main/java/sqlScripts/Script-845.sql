



select * from prod_product t1
where 1 = 1
and t1.id = 357


select * from ref_reference t1
where 1 = 1
and t1.element_code = 'governmentInspectionCheckObjectType'
;

select * from ref_reference t1
where 1 = 1
and t1.element_code = 'governmentInspectionObjectType'
order by t1.id asc
;