-- -------------------- Stored Procedure Assignment ---------------------------

-- Problem Statement 2: 
-- Generate a Rental Receipt
-- Create a stored procedure that generates a rental receipt for a given rental ID. The receipt should include rental details,
-- customer information, and total cost. The procedure should output the receipt to the console.

use sakila
select* from rental
select* from payment 

Delimiter //
create procedure generateReceipt(rentalid int)
begin
 select rental.rental_id,first_name,last_name,customer.customer_id,rental_date,return_date,sum(amount) as 'Total cost'
 from rental join payment on payment.rental_id=rental.rental_id join
 customer on customer.customer_id=payment.customer_id 
 where rental.rental_id=rentalid;

end //
Delimiter ;

-- call stored procedure ------------
call  generateReceipt(1);