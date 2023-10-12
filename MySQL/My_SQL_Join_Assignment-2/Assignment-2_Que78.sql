-- -------- Assignment-2--------
use sakila
show tables

-- Que78. Display the first name, last name, and email of customers who have rented the film titled "Doom Dancing".
select title from film where title='Doom Dancing'
select customer.first_name,customer.last_name from customer where customer.last_name='Dancing'


select customer.first_name,customer.last_name,email,film.title from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
where title='Doom Dancing'