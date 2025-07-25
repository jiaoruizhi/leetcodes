


select t1.* from iot_push_setting t1
LEFT JOIN iot_rule t2 on t2.id = t1.rule_id and t2.object_state = 'enabled'
where 1 = 1
and t2.category = 'liquidAmmonia'
order by t1.mobile
;
select t1.* from iot_rule t1;


select t1.* from iot_push_setting t1
;





        select acc.value, t1.value, t1.* FROM
        iot_sensor t1
        left join iot_sensor_relation t2 on t2.sensor_id = t1.id
        LEFT JOIN pty_party pty1 ON t1.org_id = pty1.id
        LEFT JOIN pty_relationship relat ON relat.party_id_from = t1.org_id
        AND relat.role_type_from = 'company'
        AND relat.relationship_type = 'organizational_structure'
        left join (
        select t.sensor_code,t.value,t.warning_time from
        (select * from iot_event order by id desc limit 100000000) t
        group by t.sensor_code
        ) as acc on acc.sensor_code = t1.code
        where
            t1.object_state = 'enabled'
            and t2.object_state = 'enabled'
            and t1.code = 'sensor15'
            and t2.business_key = 2
            and t2.business_type = 'majorHazard'
            ;
            
           
137707
          
                  select t.sensor_code,t.value,t.warning_time from
        (select * from iot_event order by id desc limit 100000000) t
        group by t.sensor_code;
        
       
       
       
       
       
       
       
       update iot_event t1 set t1.value = 0 where t1.code = 'sensor15';
       
       
       
       select t1.status, t1.value, t1.* from iot_event t1 where t1.sensor_code = 'sensor15' order by t1.id desc limit 20;
       
       
       
       
       
       
       
       
       
       