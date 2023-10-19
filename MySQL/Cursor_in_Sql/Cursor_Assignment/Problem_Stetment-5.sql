-- ------------------------ MyCursors Assignment -----------------------------
use student_managment_system
use sakila


-- Problem Statement 5: Calculate Average Film Rental Duration
-- Create a cursor to calculate the average rental duration for all films in the Sakila database.

-- show tables
select * from details
drop procedure CalculateAverageFilmRentalDuration



delimiter //
create procedure CalculateAverageFilmRentalDuration()
begin
declare Rental_duration tinyint(3);
declare Film_id smallint(5);
declare done int ;

declare myCursor2 CURSOR for select avg(film.rental_duration),film.film_id from film 
group by film_id ;
declare continue handler for not found set done=1;
open myCursor2;
totalRentalFees : Loop
fetch myCursor2 into Rental_duration,Film_id ;
insert into CalculateAverageFilmRentalDuration values ( Rental_duration,Film_id);
if done=1 then
leave totalRentalFees;
end if;
end Loop;
close myCursor2;
end
//
delimiter ;

call CalculateAverageFilmRentalDuration();
select * from CalculateAverageFilmRentalDuration
create table CalculateAverageFilmRentalDuration(Rental_duration tinyint(3), Film_id smallint(5))
drop table CalculateAverageFilmRentalDuration
select * from film








delimiter //
create procedure CalculateAverageFilmRentalDuration()
begin
declare Amount decimal(5,2);
declare Customer_Id smallint(5);
declare done int ;

declare myCursor2 CURSOR for select sum(payment.amount),payment.customer_id from payment
group by rental_id
having payment.customer_id=Customers_Id ;
declare continue handler for not found set done=1;
open myCursor2;
totalRentalFees : Loop
fetch myCursor2 into Amount,Customer_Id;
insert into CalculateTotalRentalFees values ( Amount,Customer_Id);
if done=1 then
leave totalRentalFees;
end if;
end Loop;
close myCursor2;
end
//
delimiter ;

call CalculateTotalRentalFees(2);
select * from CalculateTotalRentalFees
create table CalculateTotalRentalFees(Amount decimal(5,2),Customer_Id smallint(5))
drop table CalculateTotalRentalFees








