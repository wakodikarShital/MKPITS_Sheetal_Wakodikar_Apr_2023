-- ------------------------ OuterJoin Assignment -----------------------------
use student_managment_system
use sakila

-- Problem Statement 7: Display Rentals and Associated Customers
-- Display rental details (rental ID, rental date, and return date if available) along with the names of customers who made those rentals. Include rentals that have not been rented.

select rental.rental_id,rental.rental_date,rental.return_date,customer.first_name,customer.last_name
from rental
left join customer
on customer.customer_id=rental.customer_id
order by rental.rental_date

