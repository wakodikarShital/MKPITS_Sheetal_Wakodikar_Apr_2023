use Cricket_Managment_System
-- ------------------------------------ plyaers managment system table --------------------------------------------

create table Players( playerId int NOT NULL AUTO_INCREMENT primary Key , 
					firstName varchar(50) ,
					lastName varchar(50), 
                    dateOfBirth date , 
                    nationality varchar(40) , 
                    city varchar(40), 
                    percentageOfFitness double);
                    
show tables



-- ----------------------  insert players details --------------------------------------

insert into Players(firstName,lastName,dateOfBirth,nationality,city,percentageOfFitness) 
														values('Nikhil','Wakodikar','2005-12-01','Indian','Nagpur',50.0),
															('Pranay ','Lute','1998-05-20','Indian','Nagpur',49.0);

-- ---------------------- display register players ----------------------------------
select * from Players





