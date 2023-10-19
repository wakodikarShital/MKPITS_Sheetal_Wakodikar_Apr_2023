 -- -------- Assignment-1------
use sakila

-- Que44. Retrieve the film titles rented by the customer with customer_id 399.

-- select rental_date from rental where date(rental_date)=2005-05-25
select title from film 
select customer.customer_id from customer where customer.customer_id=399

select film.title,customer.customer_id from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
where customer.customer_id=399




