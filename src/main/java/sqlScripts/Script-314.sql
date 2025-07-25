


select * from pro_deployment t1
where t1.process_key = 'self_reform'
and process_name = '企业自查-隐患整改'
order by deploy_time desc


select t1.created_time, t1.* from dev_device_item t1
where 1 = 1
and t1.org_id = 27009365
and t1.parent_area_id = 22000110
order by t1.id desc

select * from dev_manage_area t1
where t1.id = 22000110;