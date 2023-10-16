-- PROCEDURE-19--------------------------------------------------------------------
delimiter //
create function sumOfAmount( cust_id int)
Returns integer deterministic
begin
declare amt int;
select sum(amount) into amt from payment where customer_id=cust_id;
Return amt;
end
//
delimiter ;

select myfunction(2);
