-- ------------------------ MyCursors Assignment -----------------------------
use student_managment_system
use sakila
select first_name,last_name from customer

-- Problem Statement 2: Calculate Total Rental Fees for a Customer
-- Create a cursor to calculate the total rental fees paid by a specific customer in the Sakila database.
-- show tables
select * from details
drop procedure CalculateTotalRentalFees



delimiter //
create procedure CalculateTotalRentalFees(Customers_Id smallint(5) )
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







