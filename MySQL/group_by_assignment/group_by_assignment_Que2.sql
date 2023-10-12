-- -------- Assignment-group by--------
use sakila
show tables

-- Que2. Determine the count of rentals for each customer.
select count(rental_id) from rental 

select customer.customer_id,first_name,last_name,count(rental_id) as Number_of_rental 
from rental join customer
on rental.customer_id=customer.customer_id
group by customer_id 
