

    -- 346000002    
        
        select t1.* from tsk_task_assign t1
        where t1.id = 346000002
        
        
        d898b03c-9496-4dba-9da0-6d11a2f4983c
        d898b03c-9496-4dba-9da0-6d11a2f4983c
        
        
        
        
        
        
        
        
        select * from doc_document t1
        where 1 = 1
        and t1.category = 'taskAssign'
        order by t1.id desc
        
        
        
        select * from doc_document_file t1
        left join doc_document t2 on t1.document_id = t2.id
        where 1 = 1
        and t2.category = 'taskAssign'
        order by t1.id desc
        
        

        
        
        
        