

-- tra_trace



describe tra_trace;

select business_key, count(*) from tra_trace
where 1 = 1
-- and business_key = "1792847"
-- and business_type = "ope_inspection_work"
-- group by business_key 
;

-- delete from tra_trace where business_key = "1792846";


select * from tra_trace
where 1 = 1
order by id desc