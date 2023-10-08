-- -------- Assignment-1--------
use sakila
show tables

-- Que9. Display the first name, last name, and email of customers who have rented the film titled "Flight Lies".
select title from film
select first_name,last_name from customer

select customer.last_name,customer.first_name,customer.email,film.title from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
on film.film_id=inventory.film_id where title='Flight Lies' 














