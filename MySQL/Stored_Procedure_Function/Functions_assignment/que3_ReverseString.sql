-- -----------------------------------Assignment----------------------------------

-- Problem Statement 3: String Reversal
-- Design a user-defined function that takes a string as input and returns the reversed string.

delimiter //
create function Reverse_String(user_string varchar(10))
returns varchar(10) deterministic
begin
declare reverse_String varchar(10);
set reverse_String=reverse(user_string);
return reverse_String;
end
//
delimiter ;
select Reverse_String('welcome');
