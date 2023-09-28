----------- Agreegate Functions (It is commonly used functions)
use student_managment_system
show tables
select * from student_details
select * from student_marks_details

select upper(Name_Of_Student)  from student_details 
select lower(Name_Of_Student)  from student_details 
select upper(Name_Of_Student),upper(city) from student_details 
select upper(Name_Of_Student) as Students_Name,upper(city) as Location from student_details 
select Name_Of_Student,City from student_details 
select Roll_No, concat(Name_Of_Student,' Location is ',City) as Student_Details from student_details 
select length(Name_Of_Student) from student_details
select length(City) from student_details where Name_Of_Student like 'p%'
select City from student_details where City like 'T%'
select * from student_details where City like 'T%'
select Roll_No,City from student_details where City like '_a%'
select City from student_details where City like 'N_g%'
select substr(Name_Of_Student,1,2) from student_details
select length(Name_Of_Student) from student_details where City='Tandapeth'
select length(Name_Of_Student) as length_Of_Student_Name, concat(Name_Of_Student,' Location is ',City) as Student_Details from student_details 
select length(City) as length_Of_City, concat(Name_Of_Student,' Location is ',City) as Student_Details from student_details
