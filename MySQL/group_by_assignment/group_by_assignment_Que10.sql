-- -------- Assignment-group by--------
use sakila

-- Que10. Calculate the count of rentals for each film language.

select language_id from film

select count(rental.rental_id) as rental_count, language.language_id 
from rental
join inventory
on rental.inventory_id=inventory.inventory_id
join film
on film.film_id=inventory.film_id
join language
on language.language_id=film.language_id
group by language.language_id


