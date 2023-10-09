-- -------- Assignment-1--------
use sakila
show tables

-- Que22. Display the names of customers who have rented the film titled "PATSY DAVIDSON".

select first_name,last_name from customer where customer.last_name='DAVIDSON'
select title from film

select customer.first_name,customer.last_name,film.title from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
on film.film_id=inventory.film_id where customer.first_name='PATSY' and customer.last_name='DAVIDSON'















