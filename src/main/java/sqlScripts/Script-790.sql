







delete from ins_inspection t1 where t1.id in (4192,4194);



delete from ins_issue t1 where t1.description in ('111', '222', '333', '444')





delete from sf_task_instance t1
where t1.business_key in (
select t1.id from ins_issue t1 where t1.description in ('111', '222', '333', '444')
);

