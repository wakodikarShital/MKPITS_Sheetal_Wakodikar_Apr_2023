-- -------- Assignment-1--------
use sakila
show tables

-- Que18. Get the film titles and rental dates for all rentals made on August 10, 2005.
select rental_date from rental where date(rental_date)='2005-05-24'
select title from film 


select film.title,rental.rental_date from rental 
join inventory
on rental.inventory_id=inventory.inventory_id
join film
on film.film_id=inventory.film_id where date(rental_date)='2005-5-24'















