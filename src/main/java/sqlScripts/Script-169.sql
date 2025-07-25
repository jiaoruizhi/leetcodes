        select
        pty2.name ,pty2.id
        from pty_relationship pty1
        left join pty_party pty2 on pty1.party_id_from = pty2.id
        where pty2.type = 'company'
        and pty1.object_state ='enabled'
        and pty1.code like '001010%'
        order by pty1.id asc