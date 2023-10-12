-- PROCEDURE-9--------------------------------------------------------------------
delimiter //
create procedure factorial( number int)

begin
declare counter int;
declare factorial int;
set counter=1;
set factorial=1;
while  counter<=number do
	set factorial=factorial*counter;
    set counter=counter+1;
end while;
select factorial;

    
END
//
delimiter ;
call factorial(3);