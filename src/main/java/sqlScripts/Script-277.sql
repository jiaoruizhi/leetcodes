



select * from log_request t1
where 1 = 1
order by t1.id desc



select * from video_alarm t1
where 1 = 1
-- and t1.camera_name like "%通用%"
and t1.alarm_site = "港务"
order by t1.id desc


update video_alarm t1 set t1.org_id = 27009365 where 1 = 1
and t1.alarm_site = "港务"
;

