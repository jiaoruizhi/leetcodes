

ALTER TABLE spa_space drop column coordinate;


select * from dev_ins_checkform_item

describe dev_ins_checkform_item;

alter table dev_ins_checkform_item add column device_id bigint(20) null;