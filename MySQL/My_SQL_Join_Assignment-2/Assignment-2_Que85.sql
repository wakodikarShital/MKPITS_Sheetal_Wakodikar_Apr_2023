-- -------- Assignment-2--------
use sakila
show tables

-- Que85. List the rental date and rental duration for each rental made by customer "Nancy Thomas".
select rental_date from rental
select customer.first_name,customer.last_name from customer where customer.first_name='Nancy' and customer.last_name='Thomas'
select rental_duration from film 



select customer.first_name,customer.last_name,rental_duration,rental.rental_date  from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
 where customer.first_name='Nancy' and customer.last_name='Thomas'