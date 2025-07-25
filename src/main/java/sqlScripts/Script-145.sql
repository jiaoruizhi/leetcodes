

select * from ins_inspection t1
where 1 = 1
and t1.unique_code like "%24001%"


        select count(t1.business_key)
        from tag_tag_instance t1
        where t1.tag_id = 1 and t1.business_type = 'inspection'
        
        
        
                select t2.*
        from tag_tag_instance t1
        left join tag_tag_instance t2 on t1.business_key = t2.business_key and t1.id != t2.id
        where t2.id is not null
