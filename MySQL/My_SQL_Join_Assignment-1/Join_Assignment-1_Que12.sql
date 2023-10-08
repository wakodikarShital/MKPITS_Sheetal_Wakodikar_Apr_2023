-- -------- Assignment-1--------
use sakila
show tables

-- Que12. Display the film titles rented by the customer with customer_id 300.
select title from film
select first_name,last_name from customer where customer.customer_id=300

select customer.customer_id,film.title from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
on film.film_id=inventory.film_id where customer.customer_id=300














