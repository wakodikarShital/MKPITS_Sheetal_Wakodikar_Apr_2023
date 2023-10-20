-- ------------------------ OuterJoin Assignment -----------------------------
use student_managment_system
use sakila

-- Problem Statement 5: Explore Rental Returns and Late Fees
-- Retrieve rental ID, return date, and any associated late fees. Include rentals that have not been returned yet, displaying a NULL return date for these rentals.

select rental.rental_id,rental.rental_date,payment.amount as late_fees 
from payment
left join rental 
on rental.rental_id=payment.rental_id
order by rental.return_date 



