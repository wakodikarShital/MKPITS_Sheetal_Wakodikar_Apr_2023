-- PROCEDURE-13--------------------------------------------------------------------
-- take a argument as a name of city and retrive the customer name belong that city
drop procedure Retrive_customer_name
select city_id from city

delimiter //
create procedure Retrive_customer_name(In city_ids int)
begin

select customer.first_name,customer.last_name,city.city,city.city_id from customer
join address
on customer.address_id=address.address_id
join city
on city.city_id=address.city_id  where city.city_id=city_ids ;


end
//
delimiter ;

call Retrive_customer_name(251)