-- -------- Assignment-1--------
use sakila


-- Que28. Retrieve the rental date and rental duration for each rental made by customer "Joseph joy".

select title from film where 
select customer.first_name,customer.last_name from customer where customer.first_name='Joseph' and customer.last_name='joy'




select customer.first_name,customer.last_name,rental.rental_date,film.rental_duration from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
where customer.first_name='Joseph' and customer.last_name='joy'