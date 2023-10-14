-- -------- Assignment-2--------
use sakila
show tables

-- Que90. Display the first name, last name, and email of customers who have rented the film titled "Frankenstein Stranger".
 
select customer.first_name,customer.last_name,email from customer where customer.first_name='Sarah' and customer.last_name='lewis'


select film.title,customer.first_name,customer.last_name,email from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
where title='Frankenstein Stranger'