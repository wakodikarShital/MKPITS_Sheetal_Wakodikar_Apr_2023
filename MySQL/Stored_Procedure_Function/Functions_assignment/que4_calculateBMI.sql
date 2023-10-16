-- -----------------------------------Assignment----------------------------------

-- Problem Statement 4: Calculate BMI (Body Mass Index)
-- Create a user-defined function that takes a person's weight (in kilograms) and height (in meters) as input and calculates their BMI.

delimiter //
create function calculate_BMI(persons_weight float,Persons_height float)
returns double deterministic
begin
declare calculate_BMI float;
set calculate_BMI=round(persons_weight*Persons_height) ;
return calculate_BMI ;
end
//
delimiter ;

select calculate_BMI(48.2,5.2);
drop function calculate_BMI
