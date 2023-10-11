-- -------- Assignment-2--------
use sakila
show tables

-- Que64. Retrieve the rental date and return date for each rental made by customer "Mary Smith".
select first_name,last_name from customer where customer.first_name='Mary' and customer.last_name='Smith'

select customer.first_name,customer.last_name,rental.rental_date,rental.return_date 
from customer 
join rental
on customer.customer_id=rental.customer_id  
where customer.first_name='Mary' and customer.last_name='Smith'








