





select * from dev_device_item t1
where 1 = 1
and t1.org_id = 27009365
order by t1.id desc ;


select t1.name, t1.parent_id , t1.object_state, count(t1.id) from dev_manage_area t1
where 1 = 1
and t1.org_id = 27009365
and t1.parent_id is null
group by t1.name, t1.parent_id, t1.object_state
order by t1.id desc ;