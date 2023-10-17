-- ---------------------------- Assignment-View ---------------------
use sakila

-- Assignment 2: Complex View with Joins
-- Create a view named customer_rental_info that displays the customer's first name, last name, email, rental date, and film title for each rental transaction in the Sakila database. Utilize appropriate joins to obtain the necessary information.

create view customer_rental_info
AS
SELECT rental.rental_id,customer.first_name,customer.last_name,customer.email,rental.rental_date,film.title
FROM customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film

select * from customer_rental_info

