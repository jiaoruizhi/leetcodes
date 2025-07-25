

-- dev_device_item


select * from dev_device_item t1
where 1 = 1
-- and id = 112
-- and org_id = 679001551
and t1.org_id = 27009365
and t1.previous_time is not null
order by t1.id desc
;



update dev_device_item set frequency_time = 1, frequency_unit = "小时", frequency_number =1  where org_id = 679001551