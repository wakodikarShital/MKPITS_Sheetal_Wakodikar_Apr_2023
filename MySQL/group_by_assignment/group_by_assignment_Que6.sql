-- -------- Assignment-group by--------
use sakila
show tables

-- Que6. Calculate the count of rentals handled by each staff member.

select staff_id,count(rental_id) as rentals_handled
from rental
group by staff_id