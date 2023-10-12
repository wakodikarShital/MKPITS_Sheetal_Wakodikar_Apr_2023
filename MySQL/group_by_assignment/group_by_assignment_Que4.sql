-- -------- Assignment-group by--------
use sakila
show tables

-- Que4.  Find the total revenue generated for each month.
select sum(amount) from payment

select month(payment_date),sum(amount)
from payment
 group by month(payment_date)