

select t1.party_group_id, pp.name  from pfm_work t1
left join pty_party pp on pp.id = t1.party_group_id 
group by t1.party_group_id 
;