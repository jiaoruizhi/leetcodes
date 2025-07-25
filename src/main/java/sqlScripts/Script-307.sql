select t2.zhongyuan_id, t2.status, t1.* from ins_rectification t1
left join ins_issue t2 on t1.issue_id = t2.id
where t1.zhongyuan_id is null
;



select t1.id, t1.vsl_name, t1.flight, t1.trends, t1.berth_id, t1.created_time from tos_trigger_event t1
where 1 = 1
and t1.org_id = 27009365
and t1.vsl_name = "顺宇6"
and t1.trends = "SMMS_VSL_DEPARTURE"
and t1.flight = "241105"
order by t1.id desc;



select * from tos_trigger_event t1
where 1 = 1
and t1.id = 164000021
;


select * from ins_issue t1
where t1.id = 939000038;

select * from ins_rectification t1 where t1.issue_id = 939000038;


select * from log_request t1
where 1 = 1
and t1.url = '/api/exterior/issue/rectification/createForExternal'
order by t1.id desc
;






