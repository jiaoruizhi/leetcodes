


select * from sf_task_instance t1
where 1 = 1
and org_id = 27009418
and t1.task_name = '安操主任复核任务'
and business_type = 'ope_inspection_work'
order by t1.id desc