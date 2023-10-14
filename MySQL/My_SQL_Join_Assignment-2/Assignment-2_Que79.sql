-- -------- Assignment-2--------
use sakila
show tables

-- Que79. Get the film titles and rental dates for all rentals made on December 12, 2005.
select title from film
select rental_date from rental 

select film.title,rental.rental_date from rental
join inventory
on inventory.inventory_id=rental.inventory_id
join film
on film.film_id=inventory.film_id where date(rental_date)='2005-05-26'