-- --------Having Assignment---------
use sakila
show tables

-- 10. Customers with diverse film preferences:
-- Find customers who have rented films from at least 5 different categories.
select * from customer
select * from rental
select * from inventory
select * from film

select customer.customer_id,title,first_name,last_name, count(rental_id) as rented_films from customer join rental on
customer.customer_id = rental.customer_id join inventory on
rental.inventory_id = inventory.inventory_id join film on
inventory.film_id = film.film_id group by customer_id having rented_films > 5