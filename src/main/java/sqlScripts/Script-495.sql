


select t1.business_key, t1.* from ins_inspection t1
where 1 = 1
and t1.business_type = 'specialOperationPatrol'
and t1.ganghang_id is not null
;


select * from ins_inspection t1
where 1 = 1
and t1.id = 1063004269;




select t1.* from ref_reference t1
where 1 = 1
and t1.element_code = "violationResult" -- assignmentPersonByRoleNameAndGroupName
-- and t1.id  = 111001049
order by t1.id asc
;
        
        
select * from hel_violation_record t1
where 1 = 1
and t1.ganghang_id is not null ;

update hel_violation_record t1
set t1.violation_result = 'resolved'
  where 1 = 1
and t1.ganghang_id is not null ;      
        
        
        
        
select * from ins_issue t1
where 1 = 1
and t1.inspection_id = 1066001913;
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       