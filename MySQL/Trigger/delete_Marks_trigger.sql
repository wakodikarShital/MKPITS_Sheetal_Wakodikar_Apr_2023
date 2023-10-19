-- Trigger in SQL -----------------------------------------------------------------

-- Trigger-1--------------------------------------------------------------------
create database MarksAdded
use  MarksAdded
show tables

-- --------------delete _----------------------------------------

-- firstly create a database and a create table for Marksdetails

create table Marksdetails(roll_no int , physics int , chemistry int , maths int )
select * from Marksdetails

-- create second table for total_details

create table total_details(roll_no int , total_Of_marks int)
select * from total_details

delimiter //
create trigger delete_marks
after
delete on Marksdetails
for each row
begin
delete from total_details where roll_no=New.roll_no;                    
end
//
delimiter ;

drop trigger update_marks

select * from Marksdetails
delete from Marksdetails where roll_no=3;

select * from total_details




