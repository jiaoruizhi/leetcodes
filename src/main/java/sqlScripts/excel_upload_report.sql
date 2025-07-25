



--excel_upload_report 


select
	*
from
	excel_upload_report t1
where
	1 = 1
	and t1.`type` = "hazard"
	and t1.status = "loading"
order by
	t1.id desc