-- --------Having Assignment---------
use sakila
show tables

-- 5. Actors in popular films:
-- Show actors who have appeared in more than 10 films.

select * from actor
select * from film_actor
select * from film

select actor.actor_id, count(actor_id) as "actors_in_film" from actor join film_actor on
actor.actor_id = film_actor.actor_id join film on
film_actor.film_id = film.film_id group by actor_id having actors_in_film>10




