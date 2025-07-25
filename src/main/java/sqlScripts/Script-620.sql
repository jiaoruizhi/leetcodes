






select t1.id, t1.org_id, t1.* from ins_inspection t1
where t1.unique_code = 'GHC00051484';




select t1.org_id, t1.* from ins_issue t1
where 1 = 1
and t1.inspection_id = 1119000058
;


select * from qrtz_schedule_task_item t1
where 1 = 1
and t1.name = 'OperationRegionWorkJob'
order by t1.id desc



select t1.org_id, t1.* from pfm_work t1
where 1 = 1
and t1.business_type = 'operationInspection'
order by t1.id desc;