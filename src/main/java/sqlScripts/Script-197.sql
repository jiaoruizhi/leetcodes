













select
	b.data_code as code,
	b.data_name as name,
	IFNULL(a.count, 0) as count,
	a.insYear
from
	(
	select
		data_code,
		data_name
	from
		ref_reference a
	where
		element_code = 'work_type'
	order by
		data_sequence
        ) b
left join
        (
	select
		t1.type,
		ref1.data_name,
		count(*) count,
		DATE_FORMAT(t1.created_time, '%Y-%m-%d') as insYear
	from
		pfm_work t1
	left join ref_reference ref1 on
		ref1.data_code = t1.type
		and ref1.element_code = 'work_type'
	left join pty_relationship relat on
		relat.party_id_from = t1.org_id
		and relat.role_type_from = 'company'
		and
        relat.object_state = 'enabled'
	where
		t1.object_state = 'enabled'
		and (t1.business_type = 'patrol'
			or t1.business_type = 'operationInspection'
			or t1.business_type = 'periodicInspection' )
		and (t1.due_status is null
			or t1.due_status != 'overdue')
        <include refid = "searchForm"></ include>
        <if test = "status != null and status != ''">
		and t1.status like CONCAT('%', #{status},'%')
        </ if>
        <if test = "statusList != null and statusList.size() > 0">
            and t1.status in
            <foreach item = "item" index = "index" collection = "statusList" open = "(" separator = "," close = ")">
                #{item}
            </ foreach>
        </ if>
        <if test = "type != null and type != ''">
            and t1.type like CONCAT('%', #{type},'%')
        </ if>
        group by t1.type, DATE_FORMAT(t1.created_time, '%Y-%m-%d')
        ) a on a.type = b.data_code
        where b.data_code != 'periodicInspection' and a.insYear is not null
        order by a.insYear asc