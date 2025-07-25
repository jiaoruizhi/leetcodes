



select  t1.cancel_id , t1.cancel_time , t1.cancel_reason , t1.work_code, t1.* from pfm_work t1
left join pty_party t2 on t2.id = t1.cancel_id
where 1 = 1
and t1.org_id = 27009365
and t1.business_type = 'periodicInspection'
and t1.status = 'nullify'