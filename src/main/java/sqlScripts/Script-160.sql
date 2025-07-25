

select t1.id, t2.name, t1.* from ins_inspection t1
left join pty_party t2 on t2.id = t1.inspect_by 
where t1.inspect_by is not null