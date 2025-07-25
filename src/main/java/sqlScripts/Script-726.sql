



ALTER TABLE fins_food_inspection_form ADD column `inspect_method` varchar(200) NULL COMMENT '检测方法';


select * from fins_food_inspection_form
order by id desc