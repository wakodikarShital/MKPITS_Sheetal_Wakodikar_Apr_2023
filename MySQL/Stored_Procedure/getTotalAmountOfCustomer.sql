-- PROCEDURE-14--------------------------------------------------------------------
-- get total amount of customer

delimiter //
create procedure getTotalAmountOfCustomer(in customers_id int)
begin
select sum(amount) from payment where customer_id=customers_id;
end
//
delimiter ;

call getTotalAmountOfCustomer(1);