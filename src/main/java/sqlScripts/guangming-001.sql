select t2.name, t1.str_token from iot_gateway t1 left join iot_sensor t2 on t1.str_token = t2.code;

select t1.* from iot_sensor t1

select * from acc_sensor_data


        select
            t2.id, t1.id, t2.gather_time ,t2.value
        from acc_sensor_data t2
        left join iot_sensor t1 on t2.code = t1.code and t2.device_code = t1.device_code
        left join pty_party pty on t1.org_id = pty.id
        
        select t2.name , t1.* from iot_event t1
        left join iot_sensor t2 on t1.code = t2.code
        
        select * from log_operate
        
        
        delete from log_operate where created_time <= '2024-08-20 00:00:00';
        
       
       
select * from msg_message_log t1 LEFT JOIN pty_person p1 ON p1.mobile = t1.to_user LEFT JOIN pty_party p2 ON p2.id = p2.id left join iot_sensor t2 on t1.sensor_id = t2.id;


select t1.id, p1.id,p2.id from msg_message_log t1
LEFT JOIN pty_person p1 ON p1.mobile = t1.to_user
LEFT JOIN pty_party p2 ON p1.id = p2.id
left join iot_sensor t2 on t1.sensor_id = t2.id;

select
            t1.id,
            p1.id,
            p2.id,
            t2.name as sensorName,
            t1.created_time ,
            p2.name as userName
        from msg_message_log t1
        LEFT JOIN (select * from pty_person group by mobile) p1 ON p1.mobile = t1.to_user
        LEFT JOIN pty_party p2 ON p1.id = p2.id
        left join iot_sensor t2 on t1.sensor_id = t2.id
         WHERE t1.object_state = 'enabled'
                and t1.to_user like CONCAT('%','13655513100','%')
                and DATE_FORMAT(t1.created_time,'%Y-%m-%d') >=  "2024-08-01"
                and DATE_FORMAT(t1.created_time,'%Y-%m-%d') <= "2024-08-31"
        order by t1.id desc
            limit 0,10;

           
           
           ALTER TABLE msg_message_log ADD business_type varchar(200) NULL COMMENT '业务类型';

           
           
           
           



select t1.id, t2.id from ins_issue t1
left join ins_rectification_task t2 on t2.business_key = t1.id and t2.business_type = 'issue'
where t1.code = 'I00093334'
;
       
       select * from ins_rectification_task t1 where t1.business_key = 63965;
      
      delete from ins_rectification_task where id = 49966;



