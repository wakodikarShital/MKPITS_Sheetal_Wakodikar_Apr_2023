use Cricket_Managment_System
-- -------------------------------------- create table team managment system -----------------------------------------------

create table teams(teamId varchar(30), teamName varchar(40));

-- ---------- insert  team details --------------

insert into teams(teamId,teamName) values('team-A' , 'India');
show tables

-- --------------- display team details --------------------------
select * from teams