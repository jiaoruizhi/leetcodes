





select t1.* from ref_reference t1
where 1 = 1
and t1.element_code = "bpmProcessListener" -- assignmentSelfIssueStartPerson
order by t1.id asc
;






select * from ins_inspection t1
where t1.id = 1071000053;

select * from ins_inspection_item t1
where t1.inspection_id = 1071000053;


select * from ins_issue t1
where t1.inspection_id = 1071000053;


select * from ins_rectification t1
where t1.issue_id = 964000041;










select * from work_center wc
where 1 = 1
order by wc.id desc

