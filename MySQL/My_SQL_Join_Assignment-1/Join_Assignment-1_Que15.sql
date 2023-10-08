-- -------- Assignment-1--------
use sakila
show tables

-- Que15. Retrieve the rental date and return date for each rental made by customer "Richard Davis".

select rental_date,return_date from rental 
select first_name,last_name from customer where customer.last_name='Davis'

select customer.first_name,customer.last_name,rental.rental_date,rental.return_date  from customer 
join rental
on customer.customer_id=rental.customer_id where customer.first_name='Richard' 















