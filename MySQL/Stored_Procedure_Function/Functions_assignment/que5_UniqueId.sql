-- -----------------------------------Assignment----------------------------------

-- Problem Statement 5: Generate a Unique Customer ID
-- Design a user-defined function that generates a unique customer ID based on a predefined pattern and the customer's personal details.

delimiter //
create function unique_customer_id(first_name varchar(20) , last_name varchar(20) , date_Of_birth int)
returns varchar(50) deterministic
begin
declare unique_customer_id varchar(50);
set unique_customer_id = concat(first_name,last_name,date_Of_birth);
return  unique_customer_id ;
end
//
delimiter ; 
-- drop function unique_customer_id
select unique_customer_id('si','kho@','2001');