-- -----------------------------------Assignment----------------------------------

-- Problem Statement 2: Calculate Age from Birthdate
-- Develop a user-defined function that takes a person's birthdate as input and calculates their current age in years.

-- --------------- 1) Type1 by datediff()

delimiter //
create function  calculates_Age(person_birthdate date , current_dates date)
returns int deterministic
begin 
declare age_in_year int;
set age_in_year=DateDiff(current_dates,person_birthdate)/365;
return age_in_year;
end
//
delimiter ;

select  calculates_Age('2050-03-23','2023-10-16');
drop function calculates_Age;

-- -------------- 2)Type2 by timestampdiff()

delimiter //
create function  calculates_AgeBy(person_birthdate date)
returns int deterministic
begin 
declare age_in_year int;
set age_in_year=timestampdiff(year,person_birthdate,current_date());
return age_in_year;
end
//
delimiter ;

select  calculates_AgeBy('2001-03-20');
drop function calculates_AgeBy;

