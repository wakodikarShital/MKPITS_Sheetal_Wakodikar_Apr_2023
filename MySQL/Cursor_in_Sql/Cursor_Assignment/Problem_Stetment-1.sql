-- ------------------------ MyCursors Assignment -----------------------------
use student_managment_system
use sakila
select first_name,last_name from customer

-- Problem Statement 1: Retrieve Customer Names and Addresses
-- Create a cursor to retrieve the names and addresses of all customers from the Sakila database.

-- show tables
select * from details
drop procedure RtriveCustomerInfo



delimiter //
create procedure RtriveCustomerInfo()
begin
declare First_name varchar(45);
declare Last_name varchar(45);
declare Address varchar(50);
declare done int ;
declare myCursor1 CURSOR for select customer.first_name,customer.last_name,address.address from customer
join address
on address.address_id=customer.address_id ;
declare continue handler for not found set done=1;
open myCursor1;
RetriveInfo : Loop
fetch myCursor1 into First_name,Last_name,Address;
insert into retriveCustomer values (First_name ,Last_name,Address);
if done=1 then
leave RetriveInfo;
end if;
end Loop;
close myCursor1;
end
//
delimiter ;

call RtriveCustomerInfo
select * from retriveCustomer
create table retriveCustomer(First_name varchar(45),Last_name varchar(45),Address varchar(50));
drop table retriveCustomer







