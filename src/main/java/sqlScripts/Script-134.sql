alter table acc_accident add column little_event varchar(200);

alter table hel_violation_record add column checker_id_name varchar(20);
alter table hel_violation_record add column reviewer_name varchar(20);
alter table hel_violation_record add column rules_name varchar(20);
alter table hel_violation_record add column violator_name varchar(20);