


-- 948000314
-- 	C00036522


select t1.status, t1.* from ins_inspection t1
where 1 = 1
and t1.unique_code = 'C00036522'
;
select t1.name, t1.status , t1.* from ins_inspection_item  t1
where 1 = 1
and t1.inspection_id = 948000314
;

select * from ins_inspection_item t1
where t1.id in(
905000433,
905000434,
905000435,
905000436,
905000437
);



select * from ins_inspection_issue  t1
where 1 = 1
and t1.inspection_id = 948000251
;



select t1.unique_code, t1.status, t1.* from ins_issue t1
where t1.inspection_id = 1079000052


select * from ins_inspection_issue t1
where 1 = 1
-- and t1.inspection_id = 1079000052
and t1.inspection_item_id in (
1027000094,
1027000088,
1027000089,
1027000090,
1027000091,
1027000092,
1027000093
);


select t1.status, t1.unique_code, t1.* from ins_issue t1
where t1.inspection_id in (948000251);

select t1.status, t1.unique_code, t1.* from ins_issue t1
where t1.unique_code in (
'I00001889',
'I00001890',
'I00001891',
'I00001892',
'I00001893'
);

select t1.status, t1.unique_code, t1.* from ins_issue t1
where t1.unique_code in (
'ISS00003939',
'ISS00003945',
'ISS00003944',
'ISS00003943',
'ISS00003942',
'ISS00003941',
'ISS00003940'
);


select * from ins_rectification t1
where t1.issue_id in (
1021000151,
1021000152,
1021000153,
1021000154,
1021000155,
1021000156,
1021000157,
1034000492,
1034000493,
1034000494,
1034000495,
1034000496,
1034000497
);









