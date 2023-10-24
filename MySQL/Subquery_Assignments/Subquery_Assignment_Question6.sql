-- ------------------------ Subquery Assignment  -----------------------------
use student_managment_system
use sakila



-- Assignment 6: Find customers who rented the same film as another customer:
-- Identify customers who rented the same film as a specific customer (based on customer_id).

use sakila
select title from film -- film_id
select* from inventory -- film_id
select* from rental -- inventory_id,customer_id
select* from customer

select first_name,last_name,title from customer where customer_id in(select customer_id)














