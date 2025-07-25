

select * from DATABASECHANGELOGLOCK
;


UPDATE DATABASECHANGELOGLOCK
SET locked = 0, lockgranted = NULL, lockedby = NULL
WHERE id = 1;
