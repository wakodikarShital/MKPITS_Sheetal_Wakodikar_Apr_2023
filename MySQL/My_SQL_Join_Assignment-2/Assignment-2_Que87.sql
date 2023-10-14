-- -------- Assignment-2--------
use sakila
show tables

-- Que87. Get the names of customers who have rented the film titled "Glass dying".
select customer.first_name,customer.last_name from customer 
select title from film where title='Glass dying'


select film.title,customer.first_name,customer.last_name from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
 where title='Glass dying'