-- -------- Assignment-1--------
use sakila
show tables

-- Que31. Get the film titles and rental dates for all rentals made on may 26, 2005.
select title from film
select rental_date from rental 

select film.title,rental.rental_date from rental
join inventory
on inventory.inventory_id=rental.inventory_id
join film
on film.film_id=inventory.film_id where date(rental_date)='2005-05-26'