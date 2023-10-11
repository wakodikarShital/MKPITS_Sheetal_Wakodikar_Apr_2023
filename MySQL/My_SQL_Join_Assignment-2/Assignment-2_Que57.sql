-- -------- Assignment-2--------
use sakila
show tables

-- Que57. List the rental date and return date for all rentals made by customer "Sarah lewis".
select first_name,last_name from customer where customer.first_name='Sarah'
select title from film where title='Alien center'

select customer.first_name,customer.last_name,rental.rental_date,rental.return_date from customer 
join rental
on customer.customer_id=rental.customer_id  where customer.first_name='Sarah' and customer.last_name='lewis'








