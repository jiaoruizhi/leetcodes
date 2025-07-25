



select t1.json, t1.content, t1.* from ctr_template_item t1
where 1 = 1
order by t1.id desc




ALTER TABLE `ctr_template` ADD COLUMN  `year` Integer null comment '年份';


-- sign_responsibility

select t1.store_id, t1.position, t1.process_key, t1.* from ctr_template t1
where 1=1
and t1.id = 177
order by t1.id desc

select* from ctr_template_item t1
where 1=1
and t1.template_id = 265
order by t1.id desc





select * from report_template t1
where 1 = 1
and t1.code = 'contractTemplateExport'
order by t1.id desc




select t4.store_id, t2.complete_pdf_store , t2.store_id t1.* from ctr_invitation t1
left join ctr_contract t4 on t1.id=t4.invitation_id
left join ctr_template t2 on t1.template_id = t2.id
where 1 = 1
-- and t1.template_id = 177
and t1.id = 452
;


-- 3faab006-3ee4-41bf-8dfb-754960d79d3d

-- 0e19c7cf-e888-47ad-b32c-262fe7ac5726








select t1.store_id, t1.* from ctr_contract t1
where t1.id = 452
;


select * from ctr_contract_item t1
where t1.contract_id = 452
;


select * from ctr_invitation t1
where 1 = 1
order by t1.id desc



select * from sf_task_instance t1
where 1 = 1
and t1.business_key = 452
;
