


select
	pty1.name, t2.person_id, t1.work_date, t1.*
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
	where 1 = 1
	and t1.org_id = 27009323
	and pty1.name = '林少芳'