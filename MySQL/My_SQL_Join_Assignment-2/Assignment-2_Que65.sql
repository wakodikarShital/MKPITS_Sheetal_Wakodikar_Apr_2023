-- -------- Assignment-2--------
use sakila
show tables

-- Que65. List the film titles and rental dates for all rentals made by customer "Robert Baughman".
select title from film  
select rental_date from rental
select first_name,last_name from customer where customer.first_name='Robert' and customer.last_name='Baughman'

select film.title,rental_date,customer.first_name,customer.last_name from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
on film.film_id=inventory.film_id where customer.first_name='Robert' and customer.last_name='Baughman'