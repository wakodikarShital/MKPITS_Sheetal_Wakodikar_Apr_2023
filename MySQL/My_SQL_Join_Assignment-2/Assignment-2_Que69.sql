-- -------- Assignment-2--------
use sakila
show tables

-- Que69. List the rental date and return date for all rentals made by customer "Donald Mahon". 
select rental_date,return_date from rental
select customer.first_name,customer.last_name from customer where customer.first_name='Donald' and customer.last_name='mahon'

select customer.first_name,customer.last_name,rental.rental_date,rental.return_date 
from customer 
join rental
on customer.customer_id=rental.customer_id  
where customer.first_name='Donald' and customer.last_name='mahon'







