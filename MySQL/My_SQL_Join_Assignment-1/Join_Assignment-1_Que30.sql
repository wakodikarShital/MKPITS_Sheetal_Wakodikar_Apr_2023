-- -------- Assignment-1--------
use sakila


-- Que30. Display the first name, last name, and email of customers who have rented the film titled "Superfly trip".

select title from film where title='Superfly trip'
select customer.first_name,customer.last_name,email from customer




select customer.first_name,customer.last_name,email from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
where title='Superfly trip'