




select * from sys_push_config t1







select * from sys_push_config_item t1
where 1 = 1
and t1.push_config_id = 4


        select t1.*, pty1.name as partyName from sys_push_config_item t1
        left join pty_party pty1 on t1.party_id = pty1.id
        where 1 = 1
            and t1.push_config_id = 4





