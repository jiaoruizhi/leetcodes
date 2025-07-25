


select t1.* from ins_inspection t1 where t1.ganghang_id is not null;
delete from ins_inspection t1 where t1.ganghang_id is not null;

select count(*) from ins_inspection_item t1 where t1.inspection_id in (
select t2.id from ins_inspection t2 where t2.ganghang_id is not null
);

delete from ins_inspection_item t1 where t1.inspection_id in (
select t2.id from ins_inspection t2 where t2.ganghang_id is not null
);

select count(*) from ins_issue t1 where t1.ganghang_id is not null;
delete from ins_issue t1 where t1.ganghang_id is not null;











