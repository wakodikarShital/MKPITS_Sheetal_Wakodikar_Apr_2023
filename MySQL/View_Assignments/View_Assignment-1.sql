-- ---------------------------- Assignment-View ---------------------
use sakila

-- Assignment 1: Basic View Creation
-- Create a view named film_titles that displays the film_id, title, and release_year for all films in the Sakila database.

create view film_titles 
AS
SELECT film_id, title, release_year
FROM 
film;

select * from film_titles

