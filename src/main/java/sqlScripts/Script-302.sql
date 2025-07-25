


select a.*  from sys_code_generator a  where a.code_key ='inspection' order by a.value desc;
update sys_code_generator a set a.prefix = 'GHC' where a.code_key ='inspection' order by a.value desc;



select a.*  from sys_code_generator a  where a.code_key ='issue' order by a.value desc