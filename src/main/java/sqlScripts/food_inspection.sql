	select fff.inspection_id from fins_food_inspection_form fff
	where 1 = 1
	and fff.judgement in ('不符合')
	;


select
t1.id,
t1.result,
(
	select count(1) from fins_food_inspection_form fff
	where fff.inspection_id = t1.id
	and fff.judgement in ('不符合')
)as itemCount
from fins_food_inspection t1
;




select id from (
select
t1.id,
t1.result,
(
	select count(1) from fins_food_inspection_form fff
	where fff.inspection_id = t1.id
	and fff.judgement in ('不符合')
)as itemCount
from fins_food_inspection t1
) a
where a.`result` = 'issue' and a.itemCount = 0
;



update fins_food_inspection set result = 'normal'
where id in (
select id from (
select
t1.id,
t1.result,
(
	select count(1) from fins_food_inspection_form fff
	where fff.inspection_id = t1.id
	and fff.judgement in ('不符合')
)as itemCount
from fins_food_inspection t1
) a
where a.`result` = 'issue' and a.itemCount = 0
);