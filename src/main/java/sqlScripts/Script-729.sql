


select * from sche_plan t1
where t1.plan_end_time < now()


select t1.workbill_no, t1.work_type_nam, t1.proc_nam,t1.way_nam, t1.bag_nam, t1.cargo_txt, t1.* from tos_trigger_event t1
where t1.id = 301

select t1.event_status_name, t1.trigger_event_id, t1.complete_time, t1.status, t1.id, t1.party_group_id, t1.* from pfm_work t1
where t1.trigger_event_id = 301