-- PROCEDURE-15--------------------------------------------------------------------
-- get total amount of customer storing in other variable

delimiter //
create procedure getTotalAmountOfCustomerStored(in customers_id int , out storing_variable int)
begin
select sum(amount) into storing_variable from payment where customer_id=customers_id;
end
//
delimiter ;

call getTotalAmountOfCustomerStored(1,@storing_variable);
select @storing_variable;
