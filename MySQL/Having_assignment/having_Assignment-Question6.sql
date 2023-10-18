-- --------Having Assignment---------
use sakila
show tables

-- 6. Staff with high customer interactions:
-- List staff members who have handled more than 500 customer transactions.
select * from customer
select * from store
select * from staff

select staff.staff_id, count(staff_id) as staff_member from customer join store on
customer.address_id = store.address_id join staff on
store.store_id = staff.store_id group by staff_id having staff_member > 500



