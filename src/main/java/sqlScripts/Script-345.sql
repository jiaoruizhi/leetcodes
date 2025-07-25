



select t1.* from ins_issue t1
where t1.id in (956000030, 954000030, 934000063)
;


select t1.id, t1.*  from ins_inspection t1
where t1.id in (1050000001, 1059000020, 1027000104)
;


select t1.description, t1.* from ins_issue t1
where t1.inspection_id in (1050000001, 1059000020, 1027000104)
order by t1.inspection_id asc
;