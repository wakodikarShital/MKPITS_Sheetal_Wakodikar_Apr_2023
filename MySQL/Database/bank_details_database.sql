create database bank_details
use bank_details

create table account_details(customerUserId char(20) primary key , password varchar(20) ,customerName varchar(40) ,address varchar(45), city varchar(40), accountBalance double) 

create table tansaction(customerUserId char(20), transactionDate date, ammount double , transactionType varchar(30)
constraint f_k foreign key(customerUserId)  references  account_details(customerUserId)
)
