-- Assignment-2------
use sakila
show tables

-- Que1. Retrieve the names of all customers and the titles of the films they have rented.
select * from film
select * from customer
select * from rental
select * from category

select first_name,last_name from customer
select title from film 

select first_name,last_name,rental_date
from customer join rental 
on rental.customer_id=customer.customer_id
