-- -------- Assignment-2--------
use sakila
show tables

-- Que67. Get the film titles and rental dates for all rentals made on May 31, 2005.
select title from film  
select rental_date from rental where date(rental_date)='2005-5-31'


select film.title,rental.rental_date from rental
join inventory
on inventory.inventory_id=rental.inventory_id
join film
on film.film_id=inventory.film_id where date(rental_date)='2005-5-31'