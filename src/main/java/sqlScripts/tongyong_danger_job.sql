




select
t1.id as ID, t1.name as '作业名称',
t1.apply_status as '审批状态',
t1.job_end_time  as '完工确认时间',
t1.execute_time_start as '作业开始时间',
t1.execute_time_end as '作业结束时间',
wc1.status as '作业审批代办状态',
wc2.status as '巡检代办状态'
from ope_special_operation t1
left join pfm_work t2 on t2.business_key = t1.id
left join work_center wc1 on wc1.business_key = t1.id
left join work_center wc2 on wc2.business_key = t2.id
where 1 = 1
and t1.org_id = 27009365
and t1.apply_type = 'online'
and (
wc1.status <> 'completed'
or job_end_time is null
or wc2.status <> 'completed'
)
order by id asc
;