


-- 745000110
-- 	C00036522


select t1.status, t1.* from ins_inspection t1
where 1 = 1
and t1.unique_code = 'C00036522'
;
select t1.name, t1.status , t1.* from ins_inspection_item  t1
where 1 = 1
and t1.inspection_id = 745000110
;
select * from ins_inspection_item_copy2  t1
where 1 = 1
and t1.inspection_id = 745000110
;

select * from ins_inspection_item t1
where t1.id in(
1027000094,
1027000088,
1027000089,
1027000090,
1027000091,
1027000092,
1027000093
);



select * from ins_inspection_issue  t1
where 1 = 1
and t1.inspection_id = 662000184
;



select t1.unique_code, t1.status, t1.* from ins_issue t1
where t1.inspection_id = 662000184


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
where t1.inspection_id in (1079000052);

select t1.status, t1.unique_code, t1.* from ins_issue t1
where t1.id in (
1021000783,
1021000784,
1021000785,
1021000786,
1021000787,
1021000788,
1021000789,
1021000790,
1021000791
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









