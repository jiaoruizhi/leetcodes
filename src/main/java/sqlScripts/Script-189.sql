

select
t1.trigger_event_id ,
t1.event_status_name,
t1.*
from pfm_work t1 where t1.id = 1084000441;


select * from tos_trigger_event t1 where t1.id = 53000003;









select
t1.*
from pfm_work t1 where t1.status = 'retract';