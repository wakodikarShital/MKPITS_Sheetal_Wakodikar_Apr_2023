use Cricket_Managment_System
-- -------------------------------------- create table team managment system -----------------------------------------------

create table teams(teamId varchar(50) primary key Not Null , 
					teamName varchar(40),
                    teamCoach varchar(50),
                    teamCountry varchar(40),
                    teamCaptain varchar(50));
                    
drop table teams
-- ---------- insert  team details --------------
insert into teams(teamId,teamName,teamCoach,teamCountry) values('101' , 'India','RV singh','India');
show tables

-- --------------- display team details --------------------------
select * from teams