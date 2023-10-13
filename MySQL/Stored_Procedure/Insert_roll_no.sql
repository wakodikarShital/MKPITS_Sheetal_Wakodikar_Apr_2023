-- PROCEDURE-16--------------------------------------------------------------------
-- create a table roll_no and create a procedure to insert a roll number from 1 to 100

create table Roll_number(roll_number int)

delimiter //
create procedure insert_roll_no_1_To_100()
begin
declare number int;
set number=1;
label : loop
 insert into Roll_number values (number);
 set number=number+1;
if number>100 then
leave label;
end if;
end loop;
end
//
delimiter ;
call insert_roll_no_1_To_100();
drop procedure insert_roll_no_1_To_100

select roll_number from Roll_number
