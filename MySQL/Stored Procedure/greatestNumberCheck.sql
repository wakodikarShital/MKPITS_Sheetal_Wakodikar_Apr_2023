-- PROCEDURE-6--------------------------------------------------------------------

delimiter //
create procedure greatestNumberCheck(number1 int , number2 int , number3 int )
begin
declare greatestNumber int;
	if (number1>number2) then
    if (number1>number3) then
    set greatestNumber=number1;
    else
    set greatestNumber=number3;
    end if;
    end if;
    if (number2>number1) then
    if (number2>number3) then
    set greatestNumber=number2;
    else
    set greatestNumber=number3;
    end if;
    end if;
    if (number3>number1) then
    if (number3>number2) then
    set greatestNumber=number3;
    else
    set greatestNumber=number2;
    end if;
    end if;
    select "greatest number is ",greatestNumber;
    
end
//
delimiter ;

call greatestNumberCheck(8,5,6);
