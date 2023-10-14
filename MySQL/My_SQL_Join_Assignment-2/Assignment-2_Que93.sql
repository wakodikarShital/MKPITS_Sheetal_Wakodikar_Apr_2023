-- -------- Assignment-2--------
use sakila
show tables

-- Que93. List the rental date and return date for all rentals made by customer "Laura rodriguez".
select rental_date from rental
select customer.first_name,customer.last_name from customer where customer.first_name='Laura' and customer.last_name='rodriguez'
select return_date from rental

select customer.first_name,customer.last_name,rental.rental_date,rental.return_date 
from customer 
join rental
on customer.customer_id=rental.customer_id  
 where customer.first_name='Laura' and customer.last_name='rodriguez'





