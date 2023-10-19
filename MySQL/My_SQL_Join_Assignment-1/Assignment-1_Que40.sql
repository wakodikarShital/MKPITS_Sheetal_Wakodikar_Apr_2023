 -- -------- Assignment-1------
use sakila

-- Que40. Retrieve the rental date and return date for each rental made by customer "Lisa Anderson".

select rental_date,return_date from rental

select rental.rental_date,rental.return_date from rental
join customer 
on customer.customer_id=rental.customer_id
where customer.first_name='Lisa' and customer.last_name='Anderson'





