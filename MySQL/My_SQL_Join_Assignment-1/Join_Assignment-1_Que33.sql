-- -------- Assignment-1--------
use sakila


-- Que33. List the rental date and return date for all rentals made by customer "Barbara jones".
select rental_date from rental
select customer.first_name,customer.last_name from customer where customer.first_name='Barbara' and customer.last_name='jones'
select return_date from rental

select customer.first_name,customer.last_name,rental.rental_date,rental.return_date 
from customer 
join rental
on customer.customer_id=rental.customer_id  
where customer.first_name='Barbara' and customer.last_name='jones'





