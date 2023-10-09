-- -------- Assignment-1--------
use sakila
show tables

-- Que17.List the names of customers who have rented the film titled "Silence Kane".

select title from film where title = 'Silence Kane'
select first_name,last_name from customer 

select film.title,customer.first_name,customer.last_name from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
on film.film_id=inventory.film_id where film.title='Silence Kane'















