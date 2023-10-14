-- -------- Assignment-2--------
use sakila
show tables

-- Que96. Retrieve the film titles and rental dates for all rentals made by the customer with customer_id 299.
select title from film where title='Intrigue Worst'
select customer_id from customer where customer_id=299


select customer.customer_id,film.title,rental.rental_date from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
where customer.customer_id=299