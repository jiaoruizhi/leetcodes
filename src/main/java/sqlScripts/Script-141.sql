ALTER TABLE sys_push_config ADD COLUMN previous_time datetime null comment '上次推送时间';


        select t1.id,
               t1.frequency,
               t1.frequency_time,
               t1.frequency_unit,
               t1.frequency_point,
               (
                   select ti.*, pty1.name as partyName from sys_push_config_item ti
                   left join pty_party pty1 on ti.party_id = pty1.id
                            where 1 = 1
                                and ti.id = t1.id

                   ) as items,
               t1.business_key,
               t1.business_type
        from sys_push_config t1