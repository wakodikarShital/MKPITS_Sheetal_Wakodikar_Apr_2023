 -- -------- Assignment-1------
use sakila

-- Que49. List the rental date and rental duration for each rental made by customer "David Royal".

select rental_duration from film
select first_name,last_name from customer where customer.first_name='David' and customer.last_name='Royal'
select rental_date from rental 

select film.rental_duration,rental.rental_date  from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
where customer.first_name='David' and customer.last_name='Royal'



