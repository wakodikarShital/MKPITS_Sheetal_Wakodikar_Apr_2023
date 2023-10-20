-- ------------------------ OuterJoin Assignment -----------------------------
use student_managment_system
use sakila

-- Problem Statement 6: Retrieve Films and Rental Details
-- Retrieve film titles and rental details (rental ID, rental date, and return date if available). Include films that have not been rented.

select film.title,rental.rental_id,rental.rental_date,rental.return_date
from rental
left join inventory
on inventory.inventory_id=rental.inventory_id
left join film
on film.film_id=inventory.film_id





