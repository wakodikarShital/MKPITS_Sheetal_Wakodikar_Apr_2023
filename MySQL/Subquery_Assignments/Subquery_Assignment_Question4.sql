-- -------- Assignment-SubQuery--------

use sakila
show tables

-- 4. Find the average rental duration compared to the overall average:
-- Compare the average rental duration of films in a specific category with the overall average rental duration.
select * from category;
select * from film_category;
select * from film;

select avg(rental_duration) as "average_of_specific_rental_duration",
(select avg(rental_duration) as "overall_average_rental_duration" from film)
from film join film_category on
film.film_id = film_category.film_id join category on
film_category.category_id = category.category_id where name="Action";