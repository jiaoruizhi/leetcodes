


-- sf_task_instance


select * from sf_task_instance
where 1 = 1
-- and business_key = "1791850"
-- and status = "approving"
and pro_instance_id = "b73c1c55-585c-11ef-bfff-00ff064bb677"
order by id desc
;