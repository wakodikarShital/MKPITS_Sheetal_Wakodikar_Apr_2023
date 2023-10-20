-- ------------------------ OuterJoin Assignment -----------------------------
use student_managment_system
use sakila

-- Problem Statement 4: Show Films and Customers Who Rented Them
-- Display film titles and the names of customers who have rented each film. Include films that have not been rented.

select film.title,customer.first_name,customer.last_name from customer 
left join rental
on customer.customer_id=rental.customer_id 
left join inventory
on inventory.inventory_id=rental.inventory_id
join film 
on inventory.film_id=film.film_id
group by film.film_id

