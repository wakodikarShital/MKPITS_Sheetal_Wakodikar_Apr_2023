-- --------Having Assignment---------
use sakila
show tables

-- 2. Customers with many rentals:
-- Identify customers who have rented more than 30 films.

select payment.customer_id,first_name,last_name,count(rental_id)
from payment join customer
on payment.customer_id=customer.customer_id
group by customer_id
having count(rental_id)>5





