 -- -------- Assignment-1------
use sakila

-- Que41. List the film titles and rental dates for all rentals made by customer "Matthew mahan".

select title from film 
select first_name,last_name from customer where customer.first_name='Matthew' and customer.last_name='mahan'

select film.title,rental.rental_date from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
where customer.first_name='Matthew' and customer.last_name='mahan'





