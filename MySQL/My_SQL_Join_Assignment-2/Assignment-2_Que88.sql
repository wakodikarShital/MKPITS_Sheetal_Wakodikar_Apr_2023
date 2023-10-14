-- -------- Assignment-2--------
use sakila
show tables

-- Que88. Retrieve the rental date and return date for each rental made by customer "Thomas Grigsby".
select rental_date from rental
select customer.first_name,customer.last_name from customer where customer.first_name='Thomas' and customer.last_name='Grigsby'
select return_date from rental

select customer.first_name,customer.last_name,rental.rental_date,rental.return_date 
from customer 
join rental
on customer.customer_id=rental.customer_id  
where customer.first_name='Thomas' and customer.last_name='Grigsby'






