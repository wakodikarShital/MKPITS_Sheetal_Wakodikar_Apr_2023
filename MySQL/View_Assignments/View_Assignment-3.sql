-- ---------------------------- Assignment-View ---------------------
use sakila

-- Assignment 3: Aggregated View
-- Create a view named monthly_rental_status that displays the month, year, and the total number of rentals for each month in the rental table.

create view monthly_rental_status
AS
SELECT month(rental_date),year(rental_date),count(rental_date)
from rental


drop view film_actors_hierarchy

select * from film_actors_hierarchy

