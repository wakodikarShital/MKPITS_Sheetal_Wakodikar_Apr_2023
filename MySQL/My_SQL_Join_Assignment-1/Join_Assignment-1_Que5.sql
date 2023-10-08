-- -------- Assignment-1--------
use sakila
show tables

-- Que5. Retrieve the film titles rented by the customer with customer_id 100.
select title from film
select customer_id,first_name,last_name from customer where customer_id=100

select customer.customer_id,film.title from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
on film.film_id=inventory.film_id where customer.customer_id=100








