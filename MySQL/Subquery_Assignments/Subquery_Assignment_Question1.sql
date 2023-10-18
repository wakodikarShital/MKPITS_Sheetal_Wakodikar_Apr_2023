-- -------- Assignment-SubQuery--------

use sakila
show tables

-- 1. Find customers who rented a specific film:
-- Retrieve the names of customers who rented the film with the title 'ATTACKS HATE'.

select * from customer; -- customer_id
select * from rental; -- customer_id, inventory_id
select * from inventory; -- inventory_id, film_id
select * from film; -- film_id

select first_name, last_name,title from customer join rental on
customer.customer_id = rental.customer_id join inventory on
rental.inventory_id = inventory.inventory_id join film on
inventory.film_id = film.film_id where title in (select title from film where title="ATTACKS HATE");