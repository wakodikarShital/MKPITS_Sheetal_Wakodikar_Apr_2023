-- -------- Assignment-1--------
use sakila
show tables

-- Que10. Retrieve the rental date and rental duration for each rental made by customer "Linda Williams".
select rental_duration from film
select first_name,last_name from customer where customer.first_name='Linda' 
select rental_date from rental


select customer.first_name,customer.last_name,rental.rental_date,film.rental_duration  from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
on film.film_id=inventory.film_id where customer.first_name='Linda'














