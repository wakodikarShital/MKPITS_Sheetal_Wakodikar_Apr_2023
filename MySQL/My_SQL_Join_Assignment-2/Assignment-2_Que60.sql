-- -------- Assignment-2--------
use sakila
show tables

-- Que60. Retrieve the film titles and rental dates for all rentals made by the customer with customer_id 1500.
select rental_date from rental
select title from film where title='Academy Dinosaur'


select customer.customer_id,film.title,rental.rental_date from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
on film.film_id=inventory.film_id where customer.customer_id='597'