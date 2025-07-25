

-- 海南港航鑫三利集装箱服务有限公司
-- 27009517
-- 
-- 海口港恒安装卸有限公司
-- 27009188


select* from company_info t1
where t1.id = 27009517
;

select * from pty_party t1
where 1 = 1
and t1.name like '%恒安%'
and t1.`type` = 'company'