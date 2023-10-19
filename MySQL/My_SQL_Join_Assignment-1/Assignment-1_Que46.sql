 -- -------- Assignment-1------
use sakila

-- Que46. Display the names of customers who have rented the film titled "agent truman".

-- select rental_date from rental where date(rental_date)=2005-05-25
select title from film where film.title='agent truman'
select customer.customer_id from customer where customer.customer_id=399

select customer.first_name,customer.last_name from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
where film.title='agent truman'




