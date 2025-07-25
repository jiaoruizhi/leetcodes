


-- 

select pp.name, t1.*
from sch_scheduling_arrangement t1
left join pty_party pp on T1.person_id = PP.id 
where 1 = 1
-- and org_id = 27009153
-- and t1.classes_id = 4000002
-- and t1.work_date = "2024-07-29"
and t1.classes_id = 18
-- and t1.teams_id = 27
order by t1.id desc





-- 27009377
-- 5000003

select
pty2.id,
	*
from
	pty_person_contact t2
left join sch_scheduling_arrangement t1 on
	t2.person_id = t1.person_id
left join pty_relationship relat on
	relat.party_id_from = t1.org_id
	and relat.role_type_from = 'company'
	and relat.object_state = 'enabled'
left join pty_party pty1 on
	pty1.id = t2.person_id
left join sch_scheduling_classes t3 on
	t3.id = t1.classes_id
	            left join pty_relationship relat2 on relat2.party_id_from = t2.person_id
            and relat2.role_type_to = 'department'
            and relat2.object_state = 'enabled'
            left join pty_party pty2 on pty2.id = relat2.party_id_to
where 1 = 1
and t2.business_type = 'schedulingTeams'
and t2.object_state = 'enabled'
and t3.id is not null
and t1.classes_id = 5000003
and t1.work_date = '2024-12-11'
-- and pty2.id = 27009377











