-- Assignment-1---------
use sakila
show tables

-- Que7. Retrieve the most recent rentals   *****
select * from rental order by last_update desc
select * from rental where return_date is null



