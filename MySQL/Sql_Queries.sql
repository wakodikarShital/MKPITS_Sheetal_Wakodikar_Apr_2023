
create database Bank_System
use Bank_System
create table Accounts_Detail(Account_Holder_Name varchar(20) ,Account_Number char(15) primary key  ,Accout_Type varchar(10),Account_Balance double)
accounts_detailaccounts_detail
show tables
select * from Accounts_Detail
insert into Accounts_Detail values('ruhi rathod' , '123456789123647', 'current',1000.60),
									('juhi rathod' , '123456789123648', 'current',1005.60),
                                    ('niki wakodikar' , '123456789123649', 'saving',1005.60)

create table Transaction_Details(Account_Number char(15),Transaction_id varchar(20), Transaction_type varchar(20), Transaction_date DATE,
constraint b_saccounts_detailstudent_marks_detailsstudent_detailss_ms_m foreign key(Account_Number) references Accounts_Detail(Account_Number) 
)
show tables
select * from Transaction_Details
insert into  Transaction_Details values('123456789123647' , '3' , 'credit' , '2023-9-26'),
										('123456789123648' , '4' , 'Debit' , '2023-9-28'),
                                        ('123456789123649' , '5' , 'credit' , '2023-10-2')
                                        


create table Bank_Employees_Details(Employee_Id char(10) primary key , Employee_Name varchar(20),Address varchar(20), Pincode int)
insert into Bank_Employees_Details values('21','shamli',null,440017)
show tables
select * from Bank_Employees_Details 
create table Employess_Salary_Structure(Employee_Id char(10),Employee_Salary double , Account_Name varchar(15),
constraint Employess_Salary foreign key(Employee_Id) references Bank_Employees_Details(Employee_Id)
)
insert into Employess_Salary_Structure values('2',20000,'SBI'),
												('3',20500,'vijaya'),
                                                ('4',30000,'bob'),
												('5',20000,'bob'),
												('6',20000,'SBI'),
												('7',30000,'bob'),
												('8',25000,'pnb'),
												('9',60000,'vijaya')

select * from Employess_Salary_Structure


// -- sql queries from Bank_System database on table of Employess_Salary_Structure
//-- update
update Employess_Salary_Structure set Employee_Salary = 60000 where Employee_Id=1
update Bank_Employees_Details set Address = 'Nagpur' where Address is null

//-- alter for field add in table
alter table Employess_Salary_Structure add date_transaction DATE
update Employess_Salary_Structure set date_transaction = '2023-9-15 ' where Account_Name = 'SBI'
update Employess_Salary_Structure set date_transaction = '2023-9-25 ' where Employee_Id in(3,5,6)
update Employess_Salary_Structure set date_transaction = '2023-9-22 ' where Employee_Salary between 30000 and 60000
update Employess_Salary_Structure set date_transaction = '2023-9-29 ' where date_transaction is null


















create table Bank_Employee(Employee_Id char(10) , Employee_Name varchar(20),Employee_salary int )
insert into Bank_Employee values('1','neha',12000)

select * from Bank_Employee
delete from Bank_Employee where Employee_Id=1   -- data it is successfully deleted when we are not apply primary key
truncate table Bank_Employee 
drop table Bank_Employee





