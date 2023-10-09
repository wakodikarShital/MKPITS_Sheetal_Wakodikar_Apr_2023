-- -------- Assignment-1--------
use sakila
show tables

-- Que7. Display the film titles and rental durations for all rentals made on May 25, 2005.
select rental_date from rental where date(rental_date)='2005-05-25'
select title from film 


select film.title,film.rental_duration,rental.rental_date from rental 
join inventory
on rental.inventory_id=inventory.inventory_id
join film
on film.film_id=inventory.film_id where date(rental_date)='2005-5-25'















