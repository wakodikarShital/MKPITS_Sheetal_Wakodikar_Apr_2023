-- -------- Assignment-1--------
use sakila
show tables

-- Que24. Retrieve the film titles and rental dates for all rentals made by the customer with customer_id 599.

select first_name,last_name from customer
select title from film
select customer_id from customer where customer.customer_id=599

select customer.customer_id,rental.rental_date,film.title from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
on film.film_id=inventory.film_id where customer.customer_id=599















