

--  123
select * from batch_job_instance;

select t1.* from batch_job_execution t1;
select * from batch_job_execution_context;
select * from batch_job_execution_params;
select * from batch_step_execution_context;
select t1.* from batch_step_execution t1;

delete from batch_step_execution_context;
delete from batch_job_execution_params;
delete from batch_job_execution_context;
delete from batch_step_execution;
delete from batch_job_execution;
delete from batch_job_instance;






