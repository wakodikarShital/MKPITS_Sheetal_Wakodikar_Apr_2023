-- ------------------------ Subquery Assignment  -----------------------------
use student_managment_system
use sakila



-- Assignment 7:  Find customers who have rented from both stores:
-- Identify customers who have rented films from both store_id 1 and store_id 2.

select* from rental -- customer_id
select* from customer -- store_id
select * from store

select customer.first_name,customer.last_name from rental as rent join customer as cust_id on 
rent.customer_id=cust_id.customer_id
where store_id in (1,2)













