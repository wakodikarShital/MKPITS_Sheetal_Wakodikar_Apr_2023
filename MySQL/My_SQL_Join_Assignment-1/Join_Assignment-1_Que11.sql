-- -------- Assignment-1--------
use sakila
show tables

-- Que11. List the film titles and rental dates for all rentals made by customer "Mary smith".
select title from film
select first_name,last_name from customer where customer.first_name='Mary' and customer.last_name='smith'
select rental_date from rental


select customer.first_name,customer.last_name,rental.rental_date,film.title from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
on film.film_id=inventory.film_id where customer.first_name='Mary' and customer.last_name='smith'














