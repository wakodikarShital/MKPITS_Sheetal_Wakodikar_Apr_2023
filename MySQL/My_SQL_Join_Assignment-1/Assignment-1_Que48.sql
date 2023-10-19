 -- -------- Assignment-1------
use sakila

-- Que48. Retrieve the film titles and rental dates for all rentals made by the customer with customer_id 400.

-- select rental_date from rental where date(rental_date)=2005-05-25
select title from film
select customer.customer_id from customer where customer.customer_id=400
select rental_date from rental 

select customer.customer_id,film.title,rental.rental_date  from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
where customer.customer_id=400




