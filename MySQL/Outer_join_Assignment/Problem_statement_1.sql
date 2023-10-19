-- ------------------------ OuterJoin Assignment -----------------------------
use student_managment_system
use sakila

-- Problem Statement 1: Retrieve Customer Information with Rental History
-- Retrieve the customer's first name, last name, and the number of rentals they have made. Include customers who have not made any rentals as well.

select customer.first_name,customer.last_name,count(rental.customer_id) as number_Of_rentals
from customer
left join rental
on customer.customer_id=rental.customer_id
group by rental.customer_id
