-- ------------------------ OuterJoin Assignment -----------------------------
use student_managment_system
use sakila

-- Problem Statement 2: Display Films and Their Rental Count
-- Display film titles along with the number of times each film has been rented. Include films that have not been rented at all.


select film.title,count(rental.rental_id) as rental_count
from film
left join inventory
on film.film_id=inventory.film_id
left join rental
on inventory.inventory_id=rental.inventory_id
group by film.film_id
