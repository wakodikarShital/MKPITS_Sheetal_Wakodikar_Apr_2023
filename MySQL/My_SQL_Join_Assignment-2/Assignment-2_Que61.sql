-- -------- Assignment-2--------
use sakila
show tables

-- Que60. List the rental date and rental duration for each rental made by customer "Paul Trout".
select rental_date from rental
select rental_duration from film where title='Academy Dinosaur'
select first_name,last_name from customer where customer.first_name='Paul' and customer.last_name='Trout'

select customer.first_name,customer.last_name,film.rental_duration,rental.rental_date from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
on film.film_id=inventory.film_id where customer.first_name='Paul' and customer.last_name='Trout'