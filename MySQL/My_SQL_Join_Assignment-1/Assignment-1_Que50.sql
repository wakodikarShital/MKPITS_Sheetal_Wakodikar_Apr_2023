 -- -------- Assignment-1------
use sakila

-- Que50. Display the film titles rented by the customer with customer_id 299.

select title from film
select customer_id from customer where customer_id=299


select film.title,customer.Customer_id from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
where customer.customer_id=299



