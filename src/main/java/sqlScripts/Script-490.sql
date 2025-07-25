

select * from pfm_work t1
where 1 = 1
and t1.zhongyuan_id is not null ;


update pfm_work t1 set t1.zhongyuan_id = null
where 1 = 1
and t1.zhongyuan_id is not null ;


select * from dev_device t1
where 1 = 1
and t1.id = 269000018
;

select * from log_request t1
where 1 = 1
order by t1.id desc