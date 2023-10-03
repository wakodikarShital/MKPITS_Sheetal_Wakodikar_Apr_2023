-- -------- Assignment-2--------
use sakila
show tables

-- Que3. List the names of actors who have appeared in the film titled "Chamber Italian".

select * from inventory
select * from film
select * from actor

select first_name,last_name,title from film_actor join actor on
film_actor.actor_id=actor.actor_id join film on
film_actor.film_id=film.film_id where title='Chamber Italian'
