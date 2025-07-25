

-- workMeeting

select t1.department , t1.* from par_team_meeting t1
where 1 = 1
-- and id = 64
and org_id = 27009093
;


describe par_team_meeting
;


ALTER TABLE par_team_meeting ADD COLUMN `scheduling_teams_id` bigint(20) null comment '班组ID';


-- team meeting


select * from par_team_meeting
where scheduling_teams_id is null
;


select
	*
from
	par_team_meeting t1
where
	1 = 1
-- 	and t1.id = 77
	;


