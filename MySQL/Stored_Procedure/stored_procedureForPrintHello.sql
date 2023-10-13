-- PROCEDURE-11--------------------------------------------------------------------
drop procedure evenProcedure
delimiter //
create procedure Print_hello()
begin
declare counter int;
set counter=0;
lable : loop
	select counter;
 if counter<10 then
 set counter=counter+1;
	select "Hello";
    leave lable;
end if;

end loop;
end
//
delimiter ;

call Print_hello();