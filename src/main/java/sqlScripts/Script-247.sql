





issue id 
63965


inspection id 
33532

70900 70901 70902 70903 70904 70905


select * from 

select t1.name, t2.id, t2.status from work_center t1
left join ins_rectification t2 on t1.business_key = t2.id
where t1.id in (70900, 70901, 70902, 70903, 70904, 70905)
;

select t1.name, t2.id, t2.status from work_center t1
left join ins_rectification t2 on t1.business_key = t2.id
where t1.business_key in (49965, 49966,49967,49968,49969,49970)
;

select t1.id, t1.status, t2.id from ins_issue t1
left join ins_rectification t2 on t1.id = t2.issue_id
where t2.id in (49965, 49966,49967,49968,49969,49970);


49967, 49968, 49969, 49970


update ins_rectification set status  = 'completed' where id in (49967, 49968, 49969, 49970);

select * from ins_rectification where id in (49967, 49968, 49969, 49970);


delete from work_center t1 where t1.id in (70900, 70901, 70902, 70903, 70904, 70905);