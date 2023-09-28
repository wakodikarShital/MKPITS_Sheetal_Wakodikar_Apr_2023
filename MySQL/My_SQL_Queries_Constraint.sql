-- ------- Constraint - Rules applied on table ------
use electronics_shop_managment_system

-- Constraint apply on table----
create table customer(customer_id int , First_name varchar(15) ,Last_name varchar(10) , Email varchar(20) , city char(10),
constraint c_id  primary key(customer_id)
)
show tables
select * from customer
alter table customer add Mobile_number int
alter table customer add constraint primary key (Mobile_number)    -- error Multiple primary key defind


-- Constraint add in existing table----
create table Products(Product_Id char(10),Product_Name varchar(20),Price int)
select * from Products
alter table Products add constraint primary key (Product_Id)

-- -------Not null constraint-------
-- foreign key Constraint apply on table----
create table Customers_Orders(OrderId char(10)primary key ,customer_id int, Order_Date date not null,total_ammount double,
constraint cus_id foreign key(customer_id) references customer(customer_id) 
)


-- foreign key Constraint apply on table----
create table Order_Item(Order_item_id int primary key, OrderId char(10), Product_Id char(10),Quantity int, Price int ,
constraint Or_Item foreign key(OrderId) references Customers_Orders(OrderId)
 )
 -- Constraint foreign key add in existing table----
 alter table Order_Item add constraint pro_Item foreign key(Product_Id) references Products(Product_Id)
 
 --  Unique Constraint add in existing table----
alter table customer add constraint email_unique unique(Email)

--  Check Constraint add in existing table----
alter table Order_Item add constraint check_revenue check (revenue >=0) 

--  Rename Constraint add in existing table----
alter table customer rename constraint Email to Customer_Email

--  default Constraint add in existing table----
alter table customer add constraint default_city  default  city is 'Nagpur' 









-- constraint
create database Shop_Managment
use Shop_Managment
create table customer(customer_id int , name varchar(15) , city char(10),
constraint c_id  primary key(customer_id)
)
show tables
select * from  customer