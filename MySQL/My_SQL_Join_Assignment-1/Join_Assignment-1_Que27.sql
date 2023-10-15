-- -------- Assignment-1--------
use sakila


-- Que27. Get the names of customers who have rented the film titled "Murder Antitrust".

select title from film where title='Murder Antitrust'
select customer.first_name,customer.last_name from customer 




select film.title,customer.first_name,customer.last_name from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
where title='Murder Antitrust'