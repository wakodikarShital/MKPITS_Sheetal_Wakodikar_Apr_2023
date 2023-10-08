-- -------- Assignment-1--------
use sakila
show tables

-- Que1. Get the titles of all films rented by the customer named "William Brown".
select title from film
select first_name,last_name from customer

select first_name,last_name,title from customer
join rental
on customer.customer_id=rental.customer_id
join inventory
on inventory.inventory_id=rental.inventory_id
join film
on film.film_id=inventory.film_id




'




