-- -------- Assignment-2--------
use sakila
show tables

-- Que2. Display the rental date and return date for each rental along with the customer's first name and last name.
select * from film
select * from customer
select * from rental
select * from category

select first_name,last_name from customer
select rental_date,return_date from rental 

select first_name,last_name,rental_date,return_date
from customer join rental 
on rental.customer_id=customer.customer_id
