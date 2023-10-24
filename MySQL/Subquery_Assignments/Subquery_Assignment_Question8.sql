-- ------------------------ Subquery Assignment  -----------------------------
use student_managment_system
use sakila



-- Assignment 8:  Find actors who have appeared in the same film:
-- Retrieve actors who have appeared in the same film as a specific actor 
-- (based on actor_id).

select* from actor 
select* from film_actor -- actor_id, film_id
select * from film

select first_name,last_name from film where film_id in
(select f.film_id from film as f join 
film_actor as fa on f.film_id=fa.film_id 
where actor_id in
(select actor_id from film_actor as fa join film as f on f.film_id=fa.film_id))













