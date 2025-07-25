





select t1.object_state, t1.* from dev_device t1
where 1 = 1
and t1.org_id = 27009169
and t1.code in ('SD1-001','SD1-002','SD1-003','SD1-004','SD1-005','SD1-006','SD1-007','SD1-008','SD1-009')
order by t1.id desc