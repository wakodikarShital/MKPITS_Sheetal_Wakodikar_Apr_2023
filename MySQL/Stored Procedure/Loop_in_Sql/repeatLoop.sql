-- PROCEDURE-10--------------------------------------------------------------------


delimiter //
create procedure repeatLoop()

begin
declare counter int;
set counter=10;
repeat
select counter;
set counter = counter - 1;
until counter=0
end repeat;

    
END
//
delimiter ;

call repeatLoop();