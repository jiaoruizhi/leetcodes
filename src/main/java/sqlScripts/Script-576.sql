

select
t1.level_num ,
t1.rectify_people_id,
t1.*
from ins_issue t1 where t1.unique_code = 'I00016268'


-- 948001975
-- 2023-08-10 00:00:00

select t1.unique_code, t1.status, t1.org_id, t1.rectify_people_id, t1.principal_person_id,  t1.level_num ,t1.* from ins_issue t1
where t1.inspection_id = 948001975
-- and t1.level_num is not null


select t1.unique_code, t1.commit_time, t1.status, t1.* from ins_inspection t1 where t1.id = 948001975;
select t1.inspection_id , t1.* from ins_inspection_item t1 where t1.inspection_id = 948001975;
select t1.unique_code, t1.* from ins_issue t1 where t1.id = 1000000051;


9050012080


        select t1.*
        from ins_issue t1
                 left join ins_inspection_item t3 on t3.id = t1.inspection_item_id
                 left join ins_inspection t2 on t2.id = t3.inspection_id
        where
            t2.id = 948001975
             or t1.inspection_id = 948001975