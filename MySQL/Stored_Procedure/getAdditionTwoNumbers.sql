-- PROCEDURE-3--------------------------------------------------------------------

delimiter //
create procedure Sp_getAdditionsTwoNumbers(In number1 int , In number2 int )
begin
		declare sum int;
        set sum=number1+number2;
        select sum;
        
end
//
delimiter ;

call Sp_getAdditionsTwoNumbers(10,10);
