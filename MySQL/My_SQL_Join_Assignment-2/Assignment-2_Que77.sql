-- -------- Assignment-2--------
use sakila
show tables

-- Que77. List the film titles and rental dates for all rentals made by customer "Laura Rodriguez".
select title from film 
select customer.first_name,customer.last_name from customer where customer.first_name='Laura' and customer.last_name='Rodriguez'
select return_date from rental

select customer.first_name,customer.last_name,film.title,rental.rental_date  from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
where customer.first_name='Laura' and customer.last_name='Rodriguez'