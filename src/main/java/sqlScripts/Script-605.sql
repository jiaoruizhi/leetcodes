





select t1.org_id, t1.* from video_alarm t1
where 1 = 1
order by t1.id desc



select t1.status, t1.* from log_request t1
where 1= 1
and url = '/ganghang/api/external/videoAlarm/create'
and t1.status = '失败'
order by t1.id desc