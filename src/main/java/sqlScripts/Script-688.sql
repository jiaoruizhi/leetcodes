

-- 李炳梅 崔经粲 何人涛 赵绵双 潘思颖 李妮蔚 符书伟


select t1.employee_id, t2.* from employee_info t1
left join pty_person t2 on t1.id = t2.id
left join pty_party t3 on t1.id = t3.id
where 1 = 1
and t3.name in ('李炳梅','崔经粲','何人涛','赵绵双','潘思颖','李妮蔚','符书伟')


select * from login 
where 1 = 1
and employee_id in (
'GH00010401',
'GH00010402',
'GH00010403',
'GH00010404',
'GH00010405',
'GH00010406',
'GH00010440'
)
