-- -------- Assignment-2--------
use sakila
show tables

-- Que51. Get the names of customers who have rented the film titled "Alter Victory".
select first_name,last_name from customer
select title from film where title='Alien center'

select customer.first_name,customer.last_name,film.title from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
on film.film_id=inventory.film_id where film.title='Alien center'
















