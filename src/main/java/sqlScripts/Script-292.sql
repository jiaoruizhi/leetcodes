


-- ganghang uat


update ins_issue t1 set t1.zhongyuan_id = null where t1.zhongyuan_id is not null;
update ins_inspection t1 set t1.zhongyuan_id = null where t1.zhongyuan_id is not null;


select * from ins_inspection t1
where 1 = 1
and t1.id = 1019000035
and t1.zhongyuan_id is not null;



select t1.zhongyuan_id,t1.inspection_id, t1.* from ins_inspection_item t1
where 1= 1
order by t1.id desc


select t1.zhongyuan_id , t1.id, t1.business_key, t1.business_type from ins_inspection t1
where 1= 1
and t1.unique_code = 'C00044784'
;
