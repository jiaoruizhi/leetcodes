




select t1.ganghang_id , t1.* from ins_issue t1
order by t1.id desc limit 50;




select t2.* from log_request t2
where 1 = 1
and t2.url = '/web/external/inspection/createForExternal'
and t2.`result` = '24001'
order by t2.id desc
;


select * from ins_issue t1 where t1.unique_code = 'ISS00003596';

-- 24001
select t1.inspect_type, t1.* from ins_inspection t1 where t1.unique_code = '24001';

select t1.* from ins_inspection_item t1 where t1.inspection_id = 810000008;

select t1.unique_code ,t1.* from ins_issue t1
where t1.inspection_id = 810000008;


select * from ins_rectification t1
where 1 = 1
and t1.ganghang_id = 975000094
-- and t1.issue_id in (775000194, 775000195, 775000196, 775000197, 775000198)
;



select * from ins_issue t1
where t1.unique_code = 'ISS00003841'
;



select * from ins_inspection t1
where t1.id = 1066002513;


select * from ins_rectification t1
where 1 = 1
and t1.issue_id = 1011000121
;


select t1.* from ins_inspection_issue t1
left join ins_inspection t2 on t1.inspection_id = t2.id 
where t2.ganghang_id is not null
and t1.inspection_item_id is null
;


select * from ins_inspection where unique_code = 'C00046427'


select * from ins_inspection_issue t1
left join ins_inspection t2 on t1.inspection_id = t2.id 
where t2.ganghang_id is not null 
and t2.id = 1066001634
;

-- 1011000058
select * from ins_inspection_issue t1
where t1.issue_id = 1011000058
;

select * from ins_inspection_item t1 where t1.inspection_id = 1066001634

select * from ins_issue t1 where t1.unique_code = 'ISS00010634';


-- 1011000058
select * from ins_inspection_issue t1
where t1.inspection_item_id in (1017000027, 1017000028, 1017000029, 1017000030, 1017000031, 1017000032, 1017000033)
;


select * from ins_issue t1 where t1.id in 
(954000030, 954000031, 954000032 ,954000033 ,954000034 ,954000035 ,954000036)
;
select * from ins_issue t1 where t1.inspection_id = 1066001634;
;


select * from ins_inspection_issue t1 where t1.inspection_id  = 1066001634;



954000034 954000035 954000036


select t1.id, t2.id from ins_issue t1
left join ins_inspection t2 on t1.inspection_id = t2.id
where t1.id in (954000034, 954000035, 954000036);

select t1.* from ins_inspection_issue t1
left join ins_inspection t2 on t1.inspection_id = t2.id
where t1.issue_id in (954000034, 954000035, 954000036);





update ins_inspection_issue t1
set t1.issue_id = (
select t4.id from ins_issue t4
where t4.inspection_id = t1.inspection_id and t4.inspection_item_id = t1.inspection_item_id limit 1
)
where t1.id in (
select t2.id from ins_inspection_issue t2
left join ins_inspection t3 on t3.id = t2.inspection_id
where t3.ganghang_id is not null
)
;









