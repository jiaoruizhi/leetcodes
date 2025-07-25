
select * from dev_manage_area t1
where t1.id = 2000014
;



        SELECT
        dev.NAME AS x,
        IFNULL( count( t1.id ), 0 ) AS y        FROM
        dev_device t1
        right join dev_device_category dev on dev.id = t1.category
        where 1 = 1
            and t1.org_id = 679001551
            and dev.org_id = 679001551

            
            select * from dev_device_category t1
            where 1 = 1
            and t1.org_id = 679001551
