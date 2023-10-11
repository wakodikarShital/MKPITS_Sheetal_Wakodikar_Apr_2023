-- -------- Assignment-2--------
use sakila
show tables

-- -----------------Stored Procedure----------------------

DELIMITER //
CREATE PROCEDURE sp_GetMovies()
BEGIN
	select title,description,release_year,rating from film;
END
//
DELIMITER ;

CALL sp_GetMovies()



delimiter //
create procedure GetStudentRecords()
begin
	select customer.first_name,customer.last_name,film.title from customer 
join rental
on customer.customer_id=rental.customer_id 
join inventory
on inventory.inventory_id=rental.inventory_id
join film
on film.film_id=inventory.film_id where film.title='Alien center';
end
//
delimiter ;

call GetStudentRecords()








