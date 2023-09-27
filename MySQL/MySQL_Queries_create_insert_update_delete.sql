create database Student_Managment_System
use Student_Managment_System
create table Student_Details
(Roll_No char(5) primary key, Name_Of_Student char(15))
show tables
select * from Student_Details
  
insert into Student_Details() values('7','rahul')
create table Student_Marks_Details(Roll_No char(5),physics int ,chemistry int , maths int,
constraint s_m foreign key(Roll_No) references Student_Details(Roll_No)
)
insert into Student_Marks_Details values('7',68,70,56)
select * from Student_Marks_Details






//  sql queries for condition
select Name_Of_Student from Student_Details
select maths from Student_Marks_Details where maths = 99
select physics from Student_Marks_Details where physics >=88
select physics from Student_Marks_Details where physics between 60 and 90
select physics from Student_Marks_Details where physics NOT between 60 and 90

//-- udate(Modifie) query
update Student_Marks_Details set maths = maths+10
update Student_Marks_Details set physics=100 where Roll_No=1


//-- Deleting data
delete from Student_Marks_Details where maths = 30  
delete from Student_Details where roll_no=5

delete from Student_Details where Roll_no=2  -- it will be gives the error because we are trying to deleted perent row but sucessfully deleted when we are not apply primary key

-- trunate se full table delete hota hai only field can shoe of table all records are deleted

//-- alter for field add in table
alter table Student_Details add pin char(8)
alter table Student_Details add City varchar(15)
alter table Student_Details add dob
// -- for add in feild in data
update Student_Details set pin = '440017'
update Student_Details set pin = '440002' where Roll_no in(1,2,6,7)
update Student_Details set City = 'Nagpur' where pin in('440017')
update Student_Details set City = 'Tandapeth' where City is null
// -- delete the existing field
alter table Student_Details drop dob






create database Bank_System
use Bank_System
create table Accounts_Detail(Account_Holder_Name varchar(20) ,Account_Number char(15) primary key  ,Accout_Type varchar(10),Account_Balance double)
accounts_detailaccounts_detail
show tables
select * from Accounts_Detail
insert into Accounts_Detail values('Shital Wakodikar' , '123456789123645', 'current',1000.60)

create table Transaction_Details(Account_Number char(15),Transaction_id varchar(20), Transaction_type varchar(20), Transaction_date DATE,
constraint b_saccounts_detailstudent_marks_detailsstudent_detailss_ms_m foreign key(Account_Number) references Accounts_Detail(Account_Number) 
)
show tables
select * from Transaction_Details
insert into  Transaction_Details values('123456789123645' , '1' , 'Debit' , '2023-9-25')





create table Bank_Employee(Employee_Id char(10) , Employee_Name varchar(20),Employee_salary int )
insert into Bank_Employee values('1','neha',12000)

select * from Bank_Employee
delete from Bank_Employee where Employee_Id=1   -- data it is successfully deleted when we are not apply primary key
truncate table Bank_Employee 