-- -------- Assignment-2--------
use sakila
show tables

-- Que53. List the film titles and rental dates for all rentals made by customer "John Farnsworth".
select first_name,last_name from customer
select title from film where title='Alien center'


select customer.first_name,customer.last_name,rental.rental_date,film.title from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
on film.film_id=inventory.film_id where customer.first_name='John' and customer.last_name='Farnsworth' 