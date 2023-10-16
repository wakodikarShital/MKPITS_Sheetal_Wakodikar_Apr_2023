-- -----------------------------------Assignment----------------------------------

-- Problem Statement 1: Calculate Total Order Value
-- Design a user-defined function that takes order quantity and unit price as input and calculates the total order value for each order.

delimiter //
create function Calculate_total_Order_values(order_quantity int, unit_price int)
returns  int deterministic
begin
declare total_order_value int ;
set total_order_value=order_quantity * unit_price ;
return total_order_value;
end 
//
delimiter ;

select  Calculate_total_Order_values(6,30);
