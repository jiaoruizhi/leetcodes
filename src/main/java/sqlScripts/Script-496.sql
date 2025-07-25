








select t1.id, t1.zhongyuan_id, t1.* from ins_inspection t1
where 1 = 1
and t1.business_type = "specialOperationPatrol"
and t1.zhongyuan_push_flag is not null
order by t1.id asc
;

