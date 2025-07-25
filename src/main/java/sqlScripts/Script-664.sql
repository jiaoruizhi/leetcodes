








        select
        t1.org_id,
        t1.typhoon_id,
        concat(concat(t1.business_type, '_'), t2.effect_type) as mapKey,
        t1.business_type,
        t2.effect_type,
        sum(t2.count) as countValue
        from typh_effected_state_report t1
        left join typh_effected_state_report_item t2 on t1.id = t2.report_id
        <where>
            1 = 1
            and t1.object_state = 'enabled'
            and t2.object_state = 'enabled'
            <if test="orgIds != null and orgIds.size() > 0">
                and t1.org_id in
                <foreach item="item" index="index" collection="orgIds" open="(" separator="," close=")">
                    #{item}
                </foreach>
            </if>
            <if test="typhoonIds != null and typhoonIds.size() > 0">
                and t1.typhoon_id in
                <foreach item="item" index="index" collection="typhoonIds" open="(" separator="," close=")">
                    #{item}
                </foreach>
            </if>
        </where>
        group by t1.org_id, t1.typhoon_id, t1.business_type, t2.effect_type
