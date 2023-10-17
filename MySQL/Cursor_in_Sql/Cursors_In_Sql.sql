-- ------------------------ MyCursors -----------------------------
-- use student_managment_system
create table details(name char(20), city varchar(20) );
insert into details values('munni' , 'morgaon');
-- show tables
select * from details
drop procedure My_Cursors
delimiter //
create procedure My_Cursors()
begin
declare name char(20);
declare S_city varchar(20);
declare done int ;
declare myCursor CURSOR for select Name_Of_Student,City from student_details;
declare continue handler for not found set done=1;
open myCursor;
lable : Loop
fetch myCursor into name,S_city;
insert into details values(name,S_city);
if done=1 then
leave lable;
end if;
end Loop;
close myCursor;
end
//
delimiter ;

call My_Cursors();
select name,city from details;