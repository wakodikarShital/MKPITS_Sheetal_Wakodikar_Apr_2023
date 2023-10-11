-- -------- Assignment-2--------
use sakila
show tables

-- Que66. Display the first name, last name, and email of customers who have rented the film titled "Mars Roman".
select title from film  where title='Mars Roman'
select first_name,last_name,email from customer 

select customer.first_name,customer.last_name,customer.email from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
on film.film_id=inventory.film_id where title='Mars Roman'