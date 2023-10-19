 -- -------- Assignment-1------
use sakila

-- Que39. Get the names of customers who have rented the film titled "Ace goldfinger".

select title from film where title='Ace goldfinger'

select film.title,customer.first_name,customer.last_name from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
where title='Ace goldfinger'






