-- -------- Assignment-1--------
use sakila


-- Que32. Retrieve the film titles rented by the customer with customer_id 800.

select title from film 
select customer.customer_id from customer




select customer.customer_id,film.title from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
where customer.customer_id=400