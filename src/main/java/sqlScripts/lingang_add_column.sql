



    `sys_code`                     varchar(20) null,





alter table ctr_contract_info 
add column     `sys_code`                 varchar(20) null;



alter table ctr_contract_info 
add column     `owner_org_id`                 bigint(20) null;










SELECT 
    TABLE_NAME, 
    COLUMN_NAME, 
    DATA_TYPE, 
    COLUMN_TYPE, 
    IS_NULLABLE, 
    COLUMN_KEY, 
    EXTRA
FROM 
    INFORMATION_SCHEMA.COLUMNS
WHERE 
    TABLE_SCHEMA = 'lingang'
    and TABLE_name not in (
    SELECT 
    TABLE_NAME
FROM ''
    INFORMATION_SCHEMA.COLUMNS
WHERE 
    TABLE_SCHEMA = 'lingang'
    and COLUMN_NAME like 'owner_org_id'
    )
  group by TABLE_NAME
    
   
   
   
   
   
   