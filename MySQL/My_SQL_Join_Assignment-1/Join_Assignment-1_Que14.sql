-- -------- Assignment-1--------
use sakila
show tables

-- Que14. List the film titles and rental dates for all rentals made by the customer with customer_id 400.
select title from film
select first_name,last_name from customer where customer.customer_id=400

select customer.customer_id,rental.rental_date,film.title from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
on film.film_id=inventory.film_id where customer.customer_id=400














