-- -------------------- Stored Procedure Assignment-1 ---------------------------

-- Problem Statement 1: 
-- Calculate Late Fees for Rental Design a stored procedure that calculates late fees for rentals based on the return date and the due date.
 -- The procedure should take the rental ID as input and update the late fee for the corresponding rental.

use sakila
show tables
select * from rental
select * from payment

drop procedure calculateLateFees
-- ----------create store procedure----------
Delimiter //
create procedure calculateLateFees(rentalId int)
begin
declare fees int;
set fees=30;

if (datediff(return_date,rental_date) >3) then
  select rental.rental_id,rental_id,sum(amount+fees) as 'Late Fees' from
  payment join rental on rental.rental_id=payment.rental_id where rental_id=rentalId;
end if;

end //
Delimiter ;

-- ----------calling store procedure--------
call calculateLateFees(1)