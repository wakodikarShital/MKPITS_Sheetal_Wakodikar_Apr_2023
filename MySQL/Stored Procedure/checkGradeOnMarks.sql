-- PROCEDURE-5--------------------------------------------------------------------

delimiter //
create procedure Sp_GradesOnMark(In mark int )
begin

		if (mark<30) then 
        select "fail";
        else
        if (mark>=30 and mark<=60) then 
        select "pass";
       else
        select "Distiction";
        end if;
        end if;
        
        
end
//

delimiter ;

call Sp_GradesOnMark(75);
