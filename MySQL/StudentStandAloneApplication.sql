create database StudentStandAloneApplication
use StudentStandAloneApplication
drop table Student
create table Student(roll_Number int NOT NULL AUTO_INCREMENT , name varchar(50),address varchar(50),city varchar(40),
primary key (roll_Number)
)

select * from Student