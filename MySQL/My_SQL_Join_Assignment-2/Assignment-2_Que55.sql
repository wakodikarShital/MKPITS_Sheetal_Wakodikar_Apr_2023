-- -------- Assignment-2--------
use sakila
show tables

-- Que55. Get the film titles and rental dates for all rentals made on September 5, 2005.
select rental_date from rental
select title from film where title='Spice Sorority'


select rental.rental_date,film.title from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
on film.film_id=inventory.film_id where date(rental_date)='2005-7-5'