-- -------- Assignment-1--------
use sakila


-- Que29. List the film titles and rental dates for all rentals made by customer "Michael silverman"

select title from film where 
select customer.first_name,customer.last_name from customer where customer.first_name='Michael' and customer.last_name='silverman'




select customer.first_name,customer.last_name,rental.rental_date,film.title from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
where customer.first_name='Michael' and customer.last_name='silverman'