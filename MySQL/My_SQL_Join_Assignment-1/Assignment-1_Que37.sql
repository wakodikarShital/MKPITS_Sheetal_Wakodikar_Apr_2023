 -- -------- Assignment-1------
use sakila

-- Que37. List the rental date and rental duration for each rental made by customer "Charles Kowalski".

select rental_duration from film 
select first_name,last_name from customer where first_name='Charles'
select rental_date from rental


select rental.rental_date,film.rental_duration from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
where customer.first_name='Charles' and customer.last_name='Kowalski'






