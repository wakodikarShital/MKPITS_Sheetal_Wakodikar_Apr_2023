-- PROCEDURE-8--------------------------------------------------------------------
delimiter //
create procedure BasicLoopCounter()

begin
declare counter int;
set counter=0;
lable:loop
   
   set counter=counter+1;
   select counter;
   
	if counter>=10 then 
    leave lable;
    end if;
    end loop;
    
END
//
delimiter ;

call BasicLoopCounter();
