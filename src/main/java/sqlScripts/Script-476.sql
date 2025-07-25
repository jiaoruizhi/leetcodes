
select * from lebs_illegal_behavior lib
;

select * from lebs_inspection_opinion t1
;

select t1.id, t2.id, t1.Check_action_code, t2.case_Id, t2.* from lebs_action_information t1
left join check_hidden_danger t2 on t1.Check_action_code = t2.case_Id 
;

select * from check_hidden_danger
;

-- B11246123013000010

select * from lebs_action_information t1
where t1.case_Id = 'B11246123013000010' or t1.Check_action_code = 'B11246123013000010'
;






select * from company_info t1
;

select * from company_info_external t1
;



select * from ins_inspection t1
;
select * from ins_inspection_external t1
;


select * from ins_issue t1
;
select * from ins_inspection_external t1
;



select t1.classify, t1.* from company_info t1
;
select * from ins_inspection_external t1
;











