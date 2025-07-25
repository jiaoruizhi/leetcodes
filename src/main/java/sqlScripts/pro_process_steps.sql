



-- pro_process_steps

select * from pro_process_steps t1
where 1 = 1
and t1.deployment_id = 20000820
;


select * from sf_process_instance t1
where 1 = 1
and t1.process_instance_id = "c6e3967c-549c-11ef-9342-0255c0a8445e"

select * from act_ru_task t1
-- where t1.PROC_INST_ID_ = "2e965bc7-5499-11ef-9342-0255c0a8445e"
order by t1.CREATE_TIME_ desc


-- d89d3f38-549c-11ef-9342-0255c0a8445e