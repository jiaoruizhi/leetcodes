

select * from ins_issue where code = 'I00093334';


select * from ins_rectification t1 where t1.issue_id = 64029;

select * from ins_rectification_task t1 where t1.business_key = 50314;

select * from work_center wc where wc.business_key = 52074;


select t1.business_key,  ins1.id, tsk1.id
from work_center t1
        left join pty_party t2 on t2.id = t1.assigner
        left join ref_reference t3 on t3.element_code = 'workType' and t3.data_code = t1.type
        left join tsk_task_assign t4 on t4.id = t1.business_key and t1.business_type = 'work_task'
        left join ref_reference ref on ref.element_code = 'workBusinessType' and ref.data_code = t1.business_type
        left join ins_rectification_task ins1 on t1.business_key = ins1.id and t1.business_type = 'rectification'
        left join sf_task_instance tsk1 on ins1.business_key = tsk1.business_key and tsk1.business_type = 'issue'
          and tsk1.status = 'approving'
        where t1.id = 70895
        ;

       
        


       
       select * from sf_task_instance where business_key = 51761 and status = 'approving';
       
      

      delete from sf_task_instance where id = 265537;
     
     
     
           select * from work_center wc where wc.id = 72987;
delete from  work_center where id in (72992,72989);
      
      