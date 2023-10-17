-- Procedure 1 -----------------------------------------------------

delimiter //
create procedure fetch_dataByWhile_loop()
begin
declare  done int;
declare name char(20);
declare S_city varchar(20);
declare myCursorsBy_loop CURSOR for select Name_Of_Student,City from student_details;
declare continue handler for not found set done=1;
open myCursorsBy_loop;
while done=1 do
fetch myCursorsBy_loop into name,S_city;
insert into details values(name,S_city);
end while;
close myCursorsBy_loop;
end
//
delimiter ;

call  fetch_dataByWhile_loop();
select name,city from details; 
