use Cricket_Managment_System
-- ------------------------------------ plyaers managment system table --------------------------------------------

create table Players( playerId varchar(30) primary Key , name varchar(50) , dateOfBirth date , nationaly varchar(40) , city varchar(40) , teamId varchar(40) default null);
show tables

-- ----------------------  insert players details --------------------------------------

insert into Players(playerId,name,dateOfBirth,nationaly,city) values('001','Nikhil Wakodikar','2005-12-01','Indian','Nagpur'),
																	('002','Pranay Lute','1998-05-20','Indian','Nagpur');

-- ---------------------- display register players ----------------------------------
select * from Players

-- ------------------------------- assign team to players -------------------------------------
update players set teamId='team-A' where playerId='001'



