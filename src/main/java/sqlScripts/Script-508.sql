

select * from log_request t1
where 1 = 1
-- and t1.url like "%deviceHead%"
order by t1.id desc
;
        
        update dev_device t1 set t1.zhongyuan_push_flag = null
        where 1 = 1
                  and t1.org_id in (
            select party_id_from from pty_relationship where code like '001010%'  and role_type_from = 'company'
        )
        
        
        
select t2.id, t2.zhongyuan_id, t1.zhongyuan_id , t1.category , t1.* from dev_device t1
left join dev_device_head t2 on t1.id = t2.device_id
where 1 = 1
and t1.zhongyuan_id is not null 
and t2.id is not null

218000001

select * from dev_device_head t1
where 1 = 1