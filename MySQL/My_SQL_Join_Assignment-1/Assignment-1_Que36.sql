 -- -------- Assignment-1------
use sakila

-- Que36.Retrieve the film titles and rental dates for all rentals made by the customer with customer_id 599.

select title from film 
select customer.customer_id from customer




select customer.customer_id,film.title,rental.rental_date from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
where customer.customer_id=599

select title from film 
select customer.customer_id from customer




select customer.customer_id,film.title from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
where customer.customer_id=400