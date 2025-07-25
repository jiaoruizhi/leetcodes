

select * from dev_ins_checkform_item t1
where t1.external_code  is not null
order by t1.id desc

select t1.start_date , t1.* from dev_device t1
where t1.external_code  is not null
order by t1.id desc


select t1.* from ins_inspection t1
-- where t1.external_code  is not null
order by t1.id desc

select t1.* from ins_inspection t1
-- where t1.external_code  is not null
group by t1.result
order by t1.id desc




select t1.result, t1.* from ins_inspection_item t1
left join ins_inspection t2 on t1.inspection_id = t2.id
where t2.external_code  is not null
-- group by t1.result
order by t1.id desc



select t1.type from ins_issue t1
-- where t1.external_code  is not null
group by t1.type
order by t1.id desc






资质证照
特种设备基础管理
职业卫生基础管理
相关方基础管理
其他基础管理
特种设备现场管理
生产设备设施及工艺
场所环境
从业人员操作行为
消防安全
用电安全
安全生产管理机构及人员
职业卫生现场安全
有限空间现场安全
辅助动力系统
相关方现场管理
其他现场管理
安全生产责任制
安全生产管理制度
安全操作规程
教育培训
安全生产管理档案
安全生产投入
应急管理


待整改	created
整改中	submitted
待复核	resolved
非隐患	notIssue
已整改	completed
草稿 draft
已作废	disuse
待审核 beConfirmed















