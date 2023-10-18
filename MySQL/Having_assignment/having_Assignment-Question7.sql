-- --------Having Assignment---------
use sakila
show tables

-- 7. Active customers:
-- Identify customers who have rented in the last 30 days.
select * from customer
select * from rental

select customer.customer_id, count(rental_id) as rented_customer from customer join rental on
customer.customer_id = rental.customer_id group by customer_id having rented_customer < 30


