-- -------- Assignment-group by--------
use sakila
show tables

-- Que8. Determine the count of rentals for each film.

select film.film_id ,count(rental_id) as countOfrental_id from film join inventory
on film.film_id=inventory.film_id 
join rental
on inventory.inventory_id=rental.inventory_id
group by film_id



