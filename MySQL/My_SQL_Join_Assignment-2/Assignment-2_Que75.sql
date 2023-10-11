-- -------- Assignment-2--------
use sakila
show tables

-- Que75. Get the names of customers who have rented the film titled "Soup wisdom".
select title from film where title='Soup wisdom'
select customer.first_name,customer.last_name from customer 



select customer.customer_id,film.title  from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
on film.film_id=inventory.film_id   where title='Soup wisdom'