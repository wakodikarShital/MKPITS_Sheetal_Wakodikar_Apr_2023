-- ------------------------ Subquery Assignment  -----------------------------
use student_managment_system
use sakila



-- Assignment 5: Find films with rental counts above average:
-- Retrieve films with rental counts greater than the average number of rentals across all films.


select title from film -- film_id
select* from inventory -- film_id
select* from rental -- inventory_id

select film.title, count(rental_date) from rental where inventory_id in 
(select inventory_id from inventory where film_id in (select film_id from film))















