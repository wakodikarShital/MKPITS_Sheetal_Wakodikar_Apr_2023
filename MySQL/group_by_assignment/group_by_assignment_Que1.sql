-- -------- Assignment-group by--------
use sakila

-- Que1. Retrieve the total revenue generated for each film category.


select film.film_id ,sum(payment.amount) as revenue from film
join inventory
on film.film_id=inventory.film_id
join rental
on rental.inventory_id=inventory.inventory_id
join payment
on payment.rental_id=rental.rental_id
group by film.film_id

