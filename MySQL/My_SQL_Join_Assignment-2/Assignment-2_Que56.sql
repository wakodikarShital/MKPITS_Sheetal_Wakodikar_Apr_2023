-- -------- Assignment-2--------
use sakila
show tables

-- Que56. Retrieve the film titles rented by the customer with customer_id 597.
select rental_date from rental
select title from film where title='Spice Sorority'


select customer.customer_id,film.title from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
on film.film_id=inventory.film_id where customer.customer_id='597'