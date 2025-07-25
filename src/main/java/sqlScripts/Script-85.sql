        SELECT
            t2.id, t1.*
        FROM
            pfm_work t1
                LEFT JOIN ins_inspection t2 ON t1.id = t2.work_id
                LEFT JOIN ins_issue t3 ON t3.inspection_id = t2.id
        WHERE
            t3.id = 893000031
            
            select * from ins_issue t3
            where t3.id = 893000031
            
            
            select * from ins_inspection t2
            where t2.id = 953000006