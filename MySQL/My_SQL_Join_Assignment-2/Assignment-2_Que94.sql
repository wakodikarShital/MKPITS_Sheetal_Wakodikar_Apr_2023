-- -------- Assignment-2--------
use sakila
show tables

-- Que94. Display the names of customers who have rented the film titled "Intrigue Worst".
select title from film where title='Intrigue Worst'
select customer.first_name,customer.last_name from customer 


select film.title,customer.first_name,customer.last_name from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
where title='Intrigue Worst'