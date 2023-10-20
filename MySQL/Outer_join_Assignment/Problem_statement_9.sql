-- ------------------------ OuterJoin Assignment -----------------------------
use student_managment_system
use sakila

-- Problem Statement 9: Show Actors and Films They Acted In
-- Display actor names and the titles of films they have acted in. Include actors who have not acted in any films.

select actor.first_name,actor.last_name,film.title
from actor
left join film_actor
on film_actor.actor_id=actor.actor_id
left join film
on film.film_id=film_actor.film_id


