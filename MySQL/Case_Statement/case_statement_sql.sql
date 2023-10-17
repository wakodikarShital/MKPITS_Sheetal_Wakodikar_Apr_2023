-- Using case Statement
use sakila
select staff_id,first_name from staff
delimiter //
create procedure caseStatement()

begin
select staff_id,first_name ,
case staff_id when staff_id=1 then first_name='Mike'
			when staff_id=2 then first_name='maan'
            else 'invalid'
            end as details from staff ;
end
//
delimiter ;

call caseStatement();
drop procedure caseStatement
            