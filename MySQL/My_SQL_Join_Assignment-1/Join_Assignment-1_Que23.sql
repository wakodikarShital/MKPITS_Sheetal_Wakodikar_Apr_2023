-- -------- Assignment-1--------
use sakila
show tables

-- Que23. Get the first name, last name, and email of customers who have rented more than 10 films.

select first_name,last_name from customer


select payment.customer_id,customer.first_name,customer.last_name,customer.email,count(rental_id)
from payment join customer
on payment.customer_id=customer.customer_id
group by customer_id
having count(rental_id)>10















