-- --------Having Assignment---------
use sakila
show tables

-- 8. Long rentals:
-- List films with an average rental duration of more than 7 days.

-- select * from rental
-- select * from inventory
select * from film
select film.film_id, avg(rental_duration) as rentals from rental join inventory on
rental.inventory_id = inventory.inventory_id join film on
inventory.film_id = film.film_id group by film_id having rentals > 7
