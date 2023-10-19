-- Trigger in SQL -----------------------------------------------------------------

-- Trigger-1--------------------------------------------------------------------
create database MarksAdded
use  MarksAdded
show tables

-- --------------insert _----------------------------------------

-- firstly create a database and a create table for Marksdetails

create table Marksdetails(roll_no int , physics int , chemistry int , maths int )
select * from Marksdetails

-- create second table for total_details

create table total_details(roll_no int , total_Of_marks int)
select * from total_details

delimiter //
create trigger insert_marks
after
insert on Marksdetails
for each row
begin
insert into total_details values(New.roll_no , New.physics+New.chemistry+New.maths);
end
//
delimiter ;

drop trigger update_marks

select * from Marksdetails
insert into Marksdetails values(03,10,20,30);
insert into Marksdetails values(04,20,20,30);
insert into Marksdetails values(06,20,20,20);

select * from total_details




