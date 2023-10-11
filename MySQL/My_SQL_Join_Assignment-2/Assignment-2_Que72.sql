-- -------- Assignment-2--------
use sakila
show tables

-- Que72. Retrieve the film titles and rental dates for all rentals made by the customer with customer_id 260.
select title from film  
select customer_id from customer where customer_id='260'
select rental_date from rental


select customer.customer_id,film.title,rental.rental_date from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
on film.film_id=inventory.film_id where customer.customer_id='260'