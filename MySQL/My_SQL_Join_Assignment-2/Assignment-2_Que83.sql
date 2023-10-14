-- -------- Assignment-2--------
use sakila
show tables

-- Que83. Get the first name, last name, and email of customers who have rented more than 20 films.


select payment.customer_id,first_name,last_name,count(rental_id)
from payment join customer
on payment.customer_id=customer.customer_id
group by customer_id
having count(rental_id)>20
