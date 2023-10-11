-- -------- Assignment-2--------
use sakila
show tables

-- Que52. Retrieve the rental date and return date for each rental made by customer "Laura Rodriguez".
select first_name,last_name from customer
select title from film where title='Alien center'

select customer.first_name,customer.last_name,rental.rental_date,rental.return_date from customer 
join rental
on customer.customer_id=rental.customer_id  where customer.first_name='Laura' and customer.last_name='Rodriguez'








