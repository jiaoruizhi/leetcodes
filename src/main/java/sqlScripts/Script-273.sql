

select t1.level_num, t1.* from ins_issue t1
where 1 = 1
and t1.id = 934000091
;

select t1.business_key, t1.* from ins_inspection t1
where 1 = 1
and t1.id = 1027000108;



-- 7c117540-86c6-11ef-b7f0-0255c0a8443c

select t1.unique_code, t1.* from ins_issue t1
where 1 = 1
and t1.inspection_id = 1027000104
and t1.unique_code in ('ISS00003698', 'ISS00003699', 'ISS00003700', 'ISS00003701', 'ISS00003702', 'ISS00003703', 'ISS00003704');




update ins_issue set zhongyuan_id = 1
        where id = 1;


