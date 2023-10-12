-- -------- Assignment-group by--------
use sakila
show tables

-- Que3. Calculate the average rental duration (in days) for each film.

select film.film_id ,round(avg(datediff(rental.return_date,rental.rental_date))) as avgInDays from film join inventory
on film.film_id=inventory.film_id 
join rental
on inventory.inventory_id=rental.inventory_id
group by film_id
having avgInDays>=max(avgInDays)


