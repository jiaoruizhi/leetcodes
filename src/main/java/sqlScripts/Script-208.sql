ALTER TABLE pfm_work add COLUMN complete_pic_document_id bigint(20) comment '巡检人签字';


alter table pfm_work drop column complete_pic_document_id ;
