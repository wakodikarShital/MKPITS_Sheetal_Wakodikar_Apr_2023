-- --------Having Assignment---------
use sakila
show tables

-- 9. Highly rented films:
-- Identify films that have been rented more than 30 times.
select * from film
select * from inventory
select * from rental

select film.film_id,title, count(rental_id) as film_rented from film join inventory on
film.film_id = inventory.film_id join rental on
inventory.inventory_id = rental.inventory_id group by film_id having film_rented > 30