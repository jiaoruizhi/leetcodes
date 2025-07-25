select t1.type, count(t1.id) from pfm_work t1
where 1 = 1
group by t1.type