-- -------- Assignment-1--------
use sakila
show tables

-- Que21. List the film titles and rental dates for all rentals made by customer "Steven Curley".
select rental_date from rental
select first_name,last_name from customer where customer.first_name='Steven'
select title from film

select customer.first_name,customer.last_name,rental.rental_date,film.title from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
on film.film_id=inventory.film_id where customer.first_name='Steven' and customer.last_name='Curley'















