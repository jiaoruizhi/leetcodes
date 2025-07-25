

select
	*
from
	log_request lr
where
	1 = 1
	-- and lr.url like "%zhonyuan%"
order by
	id desc
;