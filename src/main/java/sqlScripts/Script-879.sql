





select
t1.id,
(select count(1) from fins_food_issue where inspection_id = t1.id) as issueCount
from fins_food_inspection t1
where 1 = 1
and t1.category in ('government', 'external')
and t1.result is null
;





select id from (
select
t1.id,
(select count(1) from fins_food_issue where inspection_id = t1.id) as issueCount
from fins_food_inspection t1
where 1 = 1
and t1.category in ('government', 'external')
and t1.result is null
) a 
where a.issueCount = 0;





update fins_food_inspection 
set result = 'normal'
where id in (
select id from (
select
t1.id,
(select count(1) from fins_food_issue where inspection_id = t1.id) as issueCount
from fins_food_inspection t1
where 1 = 1
and t1.category in ('government', 'external')
and t1.result is null
) a 
where a.issueCount = 0
);
