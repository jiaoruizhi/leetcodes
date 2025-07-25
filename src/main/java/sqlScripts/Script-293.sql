ALTER TABLE par_team_meeting ADD COLUMN main_concent text null comment '主要内容';
ALTER TABLE par_team_meeting ADD COLUMN manager bigint(20) null comment '管理人员';

ALTER TABLE par_team_meeting ADD COLUMN interphone_num varchar(20) null comment '对讲机';
ALTER TABLE par_team_meeting ADD COLUMN electricbike_num varchar(20) null comment '电动车';
ALTER TABLE par_team_meeting ADD COLUMN mobilephone_num varchar(20) null comment '手机';

