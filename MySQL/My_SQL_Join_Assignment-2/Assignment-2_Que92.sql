-- -------- Assignment-2--------
use sakila
show tables

-- Que92. Retrieve the film titles rented by the customer with customer_id 2300.
select title from film
select customer.customer_id from customer where customer.customer_id=350


select film.title,customer.customer_id  from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
where customer.customer_id=350