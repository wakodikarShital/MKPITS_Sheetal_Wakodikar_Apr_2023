-- -------- Assignment-2--------
use sakila
show tables

-- Que4. Get the titles of all films rented by the customer named "William Brown".
select title from film
select * from rental
select last_name from customer  where last_name='brown'

select last_name,title from customer join inventory  on 
customer.store_id = inventory.store_id join film on
film.film_id=inventory.film_id where last_name='brown' 
