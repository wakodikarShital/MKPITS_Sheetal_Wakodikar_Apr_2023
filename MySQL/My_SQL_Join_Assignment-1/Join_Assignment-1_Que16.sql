-- -------- Assignment-1--------
use sakila
show tables

-- Que16. Display the first name, last name, and email of customers who have rented the film titled "Dinosaur Secretary".

select title from film where title = 'Dinosaur Secretary'
select first_name,last_name from customer where customer.last_name=''

select film.title,customer.first_name,customer.last_name,customer.email from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
on film.film_id=inventory.film_id where film.title='Dinosaur Secretary'















