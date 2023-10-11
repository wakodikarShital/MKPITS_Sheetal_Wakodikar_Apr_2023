-- -------- Assignment-2--------
use sakila
show tables

-- Que54.Display the first name, last name, and email of customers who have rented the film titled "Spice Sorority".
select first_name,last_name from customer
select title from film where title='Spice Sorority'


select customer.first_name,customer.last_name,customer.email,film.title from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
on film.film_id=inventory.film_id where film.title='Spice Sorority'