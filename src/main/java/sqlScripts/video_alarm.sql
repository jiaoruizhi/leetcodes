

-- video_alarm


describe video_alarm;


select count(*), alarm_site from video_alarm
group by alarm_site
;
select count(*), alarm_type from video_alarm
group by alarm_type
;


select *  from video_alarm
where 1 = 1
-- and org_id = "272001529"
-- and pic_document_id is not null
-- and org_id is not null
-- 27009093
and org_id is null

;

update video_alarm set org_id = "27009093"
where id in (
select id  from video_alarm
where 1 = 1
and org_id is null
);




select
	count(t1.id) as countValue,
	t1.alarm_site as groupValue
from
	video_alarm t1
left join pty_relationship relat on
	relat.party_id_from = t1.org_id
	and relat.role_type_from = 'company'
	and relat.object_state = 'enabled'
where
	1 = 1
	and t1.org_id = 27009093
group by
	t1.alarm_site
;




select
	t1.id,
	t1.camera_name,
	t1.alarm_site,
	t1.base_img,
	t1.video_ip,
	t1.alarm_content,
	t1.alarm_scene,
	t1.alarm_type,
	t1.equipment_name,
	t1.equipment_ip,
	t1.create_time,
	t1.pic_document_id ,
	t1.org_id,
	case
		when t1.handler_id is null then '未处理'
		else '已处理'
	end as handleStatus,
	p1.name as handlerName,
	t1.handler_id,
	t1.handle_time,
	t1.handle_opinion,
	t1.handle_result
from
	video_alarm t1
left join pty_party p1 on
	p1.id = t1.handler_id
where
	t1.id = 6



	
	
	
	
	