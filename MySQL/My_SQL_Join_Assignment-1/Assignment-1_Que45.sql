 -- -------- Assignment-1------
use sakila

-- Que45. List the rental date and return date for all rentals made by customer "Jennifer davis".

select rental_date,return_date from rental

select rental.rental_date,rental.return_date,customer.first_name,customer.last_name from rental
join customer 
on customer.customer_id=rental.customer_id
where customer.first_name='Jennifer' and customer.last_name='davis'





