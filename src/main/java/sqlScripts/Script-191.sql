

select t1.org_id , t1.* from ins_inspection_issue t1
where t1.inspection_id = 878000050
;



select org_id, business_key from ins_inspection t1
where t1.id = 3414


select t2.operation_pass_flag from ins_issue t1
left join ins_inspection t2 on t2.id = t1.inspection_id
where t1.id = 815000070


select * from tra_trace t1
-- where t1.longitude is not null


select * from dev_device t1
-- where t1.coordinate is not null
where 1 = 1
and t1.code = "abc-20240924-0001"
order by t1.id desc




select * from batch_step_execution bse ;
select * from batch_step_execution_seq bse ;
select * from batch_step_execution;

select * from batch_job_instance;
select * from batch_job_seq;
select * from batch_job_execution;
select * from batch_job_execution_context ;
delete from batch_step_execution_context ;
select * from batch_job_execution ;
select * from batch_job_execution_seq ;
select * from batch_job_execution_seq ;
select * from batch_step_execution bse 


(`ganghang`.`batch_job_execution`, 

