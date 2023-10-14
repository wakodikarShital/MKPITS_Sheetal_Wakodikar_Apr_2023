-- -------- Assignment-2--------
use sakila
show tables

-- Que86. Display the film titles rented by the customer with customer_id 300.

select customer.customer_id from customer where customer.customer_id=300
select title from film 



select film.title,customer.customer_id  from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
where customer.customer_id=300