use Cricket_Managment_System
-- -------------------------------------- create table team managment system -----------------------------------------------

create table teams(team_id varchar(50) primary key Not Null , 
					team_name varchar(40),
                    team_description varchar(200)
                    );
                    

 

-- ---------- insert  team details --------------
insert into teams(team_id,team_name,team_description) values('101' , 'India','The India mens national cricket team');
show tables

-- --------------- display team details --------------------------
select * from teams