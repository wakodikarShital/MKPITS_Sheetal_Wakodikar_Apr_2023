use Bank_managment_System;
create table log(timeStamps timestamp,activity varchar(50),customerUserId varchar(50),
constraint p_k foreign key (customerUserId) references Account_details(customerUserId)
)
select * from log