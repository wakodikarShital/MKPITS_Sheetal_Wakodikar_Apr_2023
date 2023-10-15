-- -------- Assignment-group by--------
use sakila
show tables

-- Que7. Compute the average rental rate for each film category.

select film.film_id ,round(avg(rental_rate)) as avgOfrental_rate from film join inventory
on film.film_id=inventory.film_id 
join rental
on inventory.inventory_id=rental.inventory_id
group by film_id
having avgInDays>=max(avgInDays)


