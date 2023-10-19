 -- -------- Assignment-1------
use sakila

-- Que47. Get the first name, last name, and email of customers who have rented more than 12 films.

-- select rental_date from rental where date(rental_date)=2005-05-25
select title from film where film.title='agent truman'
select customer.customer_id from customer where customer.customer_id=399

select payment.customer_id,customer.first_name,customer.last_name,customer.email,count(rental_id)
from payment join customer
on payment.customer_id=customer.customer_id
group by customer_id
having count(rental_id)>12




