-- ------------------------ OuterJoin Assignment -----------------------------
use student_managment_system
use sakila

-- Problem Statement 3: List Customers and Their Rentals
-- List customers with their rental details (rental ID, rental date, and return date if available). Include customers who have not made any rentals.

select customer.first_name,customer.last_name,rental.rental_id,rental.rental_date,rental.return_date
from customer
left join rental
on rental.customer_id=customer.customer_id
group by customer.customer_id
