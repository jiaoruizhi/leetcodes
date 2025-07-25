


-- gh  268000019
-- zy  277000315
-- SZ2018092203 SZ2018092204
select * from dev_device t1
where 1 = 1
and t1.zhongyuan_id = 277000315






select t1.status, t1.* from pfm_work t1
left join ope_operation_location t2 on t1.location_id  = t2.id 
where 1 = 1
and t1.status in( 'created', 'receive')
and t1.`type`  = 'trigger'
and t1.org_id = 27009123
and t2.id is null
order by t1.id desc



select * from work_center wc
where 1 = 1
and wc.business_key in (
select t1.id from pfm_work t1
left join ope_operation_location t2 on t1.location_id  = t2.id 
where 1 = 1
and t1.status in( 'created', 'receive')
and t1.`type`  = 'trigger'
and t1.org_id = 27009123
and t2.id is null
order by t1.id desc
)