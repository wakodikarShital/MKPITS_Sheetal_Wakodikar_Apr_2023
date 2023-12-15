use Cricket_Managment_System
-- ------------------------------------ plyaers managment system table --------------------------------------------

create table players( player_id int NOT NULL AUTO_INCREMENT primary Key, 
					first_name varchar(50) ,
					last_name varchar(50), 
                    date_of_birth date, 
                    nationality varchar(40), 
                    city varchar(40), 
                    percentage_of_fitness double);
                    

drop table players 
ALTER TABLE Players
ADD isbowler varchar(20) default 'no';
ALTER TABLE Players
ADD isbatsman varchar(20) default 'no';
ALTER TABLE Players
ADD isallrounder varchar(20) default 'no';
ALTER TABLE Players
ADD iswicketkeeper varchar(20) default 'no';


-- ----------------------  insert players details --------------------------------------

insert into players(first_name,last_name,date_of_birth,nationality,city,percentage_of_fitness) 
														values('Nikhil','Wakodikar','2005-12-01','Indian','Nagpur',50.0),
															('Pranay ','Lute','1998-05-20','Indian','Nagpur',49.0);

-- ---------------------- display register players ----------------------------------
select * from Players





