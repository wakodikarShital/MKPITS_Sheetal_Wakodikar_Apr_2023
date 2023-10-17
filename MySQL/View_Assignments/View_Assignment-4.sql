-- ---------------------------- Assignment-View ---------------------
use sakila

-- Assignment 4: Conditional View
-- Create a view named new_release_films that displays the film_id, title, and release_year for films released after the year 2005.

create view new_release_filmss
AS
SELECT film.film_id,film.title,film.release_year
FROM film  where release_year > 2005

select * from new_release_filmss

