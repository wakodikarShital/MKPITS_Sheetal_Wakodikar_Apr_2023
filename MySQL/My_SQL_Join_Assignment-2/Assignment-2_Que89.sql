-- -------- Assignment-2--------
use sakila
show tables

-- Que89. List the film titles and rental dates for all rentals made by customer "Sarah lewis".
select customer.first_name,customer.last_name from customer 
select customer.first_name,customer.last_name from customer where customer.first_name='Sarah' and customer.last_name='lewis'


select film.title,rental_date,customer.first_name,customer.last_name from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
where customer.first_name='Sarah' and customer.last_name='lewis'