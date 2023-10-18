-- --------Having Assignment---------
use sakila
show tables

-- 4. Stores with high revenue:-
-- Find stores with total revenue exceeding $5000.

select * from store 
select * from staff
select * from payment

select store.store_id, sum(amount) as total_revenue from store join staff on
store.store_id = staff.store_id join payment on 
staff.staff_id = payment.staff_id group by store_id having total_revenue>5000






