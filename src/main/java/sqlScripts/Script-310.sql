
-- 

select t1.unique_code, t1.zhongyuan_id, t1.* from ins_inspection t1
where 1 = 1
and t1.id = 1027000104
order by t1.id desc



select t1.zhongyuan_id, t1.* from ins_rectification t1
where 1 = 1
and t1.id = 975000094
order by t1.id desc

select * from log_request t1
where 1 = 1
order by t1.id desc



select * from ins_issue t1
where 1 = 1
and t1.zhongyuan_id is null
and t1.org_id in (27009093, 27009094, 27009123)
;

select * from 
(select count(id) as cc, * from 
(select t2.id as wcId, * from pfm_work t1
left join work_center t2 on t2.business_key = t1.id)
group by id) t5
where t5.cc > 1
;



