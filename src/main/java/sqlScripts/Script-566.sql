        select t1.id, t1.document_id, t1.name, t1.suffix, t1.file_size, t1.type, t1.store
        from doc_document_content t1
        where t1.store ='26d3a43e-9b27-4ba9-a974-8b52b2d82f8e'
        order by t1.id desc
        
        
        
        
        -- 52796820-4ad9-4368-9d48-e31d8afd0854
        
        
        select t1.id, t1.document_id, t1.name, t1.suffix, t1.file_size, t1.type, t1.store
        from doc_document_file t1
--         where t1.store ='6c3d40c3-dd59-435b-8a82-40bec1f500bc'
        order by t1.id desc
        
        
        
        
        select * from pty_person t1
        where 1 = 1
        and t1.mobile = '13816271725'