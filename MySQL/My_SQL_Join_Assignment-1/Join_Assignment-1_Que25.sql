-- -------- Assignment-1--------
use sakila
show tables

-- Que25. List the rental date and return date for all rentals made by customer "Susan Wilson".
select first_name,last_name from customer

select customer.first_name,last_name,rental.rental_date,rental.return_date from rental
join customer
on rental.customer_id=customer.customer_id where customer.first_name='Susan' 















