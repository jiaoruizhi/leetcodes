



select t1.id, t2.id, t1.code, t2.code, t1.name, t2.name, t1.org_id from rsk_risk t1
left join rsk_risk t2 on t1.id <> t2.id and t1.code = t2.code and t1.id < t2.id
where t2.id is not  null