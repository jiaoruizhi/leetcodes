




select t1.complete_date, t1.overdue_status, t1.* from ins_issue t1
where t1.unique_code = 'ISS00013135'
;



update ins_issue t1
set t1.complete_date = '2024-11-07', t1.status = 'completed', overdue_status = 'normal'
where t1.id = 1016000034;





