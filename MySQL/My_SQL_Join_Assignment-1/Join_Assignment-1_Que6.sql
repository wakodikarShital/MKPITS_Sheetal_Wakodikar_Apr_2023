-- -------- Assignment-1--------
use sakila
show tables

-- Que6. List the film titles and rental dates for all rentals made by the customer with customer_id 200.
select title from film
select customer_id,first_name,last_name from customer 
select rental.customer_id,rental.rental_date from rental where customer_id=200

select rental.customer_id,rental.rental_date,film.title from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
on film.film_id=inventory.film_id where customer.customer_id=200








