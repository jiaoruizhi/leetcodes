select * from pfm_work t1
where 1 = 1
and t1.id = 1148000490
order by t1.id desc



select * from base_related_team t1
where 1 = 1
and t1.org_id = 27009365
and t1.related_id = 88;

select * from pro_deployment t1
where 1 = 1
and t1.org_id = 27009365
order by t1.id desc
;

select * from pro_deployment t1
where 1 = 1
and t1.process_key = 'special_hot_newGoast' 
and t1.org_id = 27009365
order by t1.id desc
;