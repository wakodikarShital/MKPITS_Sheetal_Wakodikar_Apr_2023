 -- -------- Assignment-1------
use sakila

-- Que38. Display the film titles rented by the customer with customer_id 500.

select title from film 

select film.title,customer.customer_id from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
where customer.customer_id=500






