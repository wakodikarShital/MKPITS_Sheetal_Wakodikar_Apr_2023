-- --------Having Assignment---------
use sakila
show tables

-- 1. High revenue categories:
-- Find categories with an average rental revenue greater than $10.

select rental.rental_id,avg(payment.amount) as rental_revenue from payment
join rental
on 
rental.rental_id=payment.rental_id
group by rental_id
having avg(rental_revenue) > 10


