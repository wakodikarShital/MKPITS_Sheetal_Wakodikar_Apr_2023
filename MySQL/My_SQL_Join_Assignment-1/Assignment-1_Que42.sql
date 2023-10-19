 -- -------- Assignment-1------
use sakila

-- Que42.Display the first name, last name, and email of customers who have rented the film titled "Innocent Usual".

select title from film where title='Innocent Usual'
select first_name,last_name from customer where customer.first_name='Matthew' and customer.last_name='mahan'

select customer.first_name,customer.last_name,email from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
where title='Innocent Usual'





