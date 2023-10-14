-- -------- Assignment-2--------
use sakila
show tables

-- Que99. Get the names of customers who have rented the film titled "go purple".
select title from film where title='go purple'
select customer.first_name,customer.last_name from customer 



select customer.first_name,customer.last_name,film.title from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
where film.title='go purple'