-- PROCEDURE-7--------------------------------------------------------------------
delimiter //
create procedure printTenNumbers()

begin
declare counter int;
set counter=0;
    while(counter<10) do
	select counter;
    set counter = counter+1;
end while;
select  counter;
    
END
//
delimiter ;

call printTenNumbers();
