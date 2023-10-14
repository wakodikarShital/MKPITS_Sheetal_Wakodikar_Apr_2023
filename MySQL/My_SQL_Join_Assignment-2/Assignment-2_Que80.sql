-- -------- Assignment-2--------
use sakila
show tables

-- Que80. Retrieve the film titles rented by the customer with customer_id 2000.
select title from film 
select customer_id from customer where customer_id=200


select film.title from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
where customer_id=200