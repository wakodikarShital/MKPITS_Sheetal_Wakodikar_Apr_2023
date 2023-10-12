-- PROCEDURE-4--------------------------------------------------------------------

delimiter //
create procedure Sp_getConditionsForMarks(In mark int )
begin
		if mark >50 then 
        select "Pass";
        else
        select "Fail";
        end if;

end
//
delimiter ;

call Sp_getConditionsForMarks(40);
