select t1.hot_way , t1.*from ope_special_operation t1
where t1.hot_way is not null
and t1.hot_job_type is null


update ope_special_operation t1
set t1.hot_job_type = t1.hot_way
where t1.hot_job_type is null
and t1.hot_way is not null