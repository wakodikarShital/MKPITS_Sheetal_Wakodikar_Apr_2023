-- -------- Assignment-2--------
use sakila
show tables

-- Que58. Display the names of customers who have rented the film titled "Academy Dinosaur".

select title from film where title='Academy Dinosaur'


select film.title,customer.first_name,customer.last_name from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
on film.film_id=inventory.film_id where film.title='Academy Dinosaur'