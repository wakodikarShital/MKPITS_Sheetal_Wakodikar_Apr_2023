----------- Agreegate Functions (It is commonly used functions)
use student_managment_system
show tables
select * from student_details
select * from student_marks_details
use bank_system
show tables
select * from employess_salary_structure
select * from bank_employees_details
select * from accounts_detail
select * from transaction_details
-- -------------------------------------------Single row function ------------------------------
-- --------Character Functions -------
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
select lpad(pin,10,'*') from student_details
select lpad(Roll_No,4,'A00') from student_details
select rpad(Roll_No,4,'-') from student_details
-- ----------Number Functions --------
select mod(pin,10) from student_details
-- // use bank_System database
select round(Account_Balance,2 ) from accounts_detail
select round(Account_Balance ) from accounts_detail
select Transaction_date(curdate() ,Transaction_date ) from transaction_details 					-- ---Here this is some error
select add_details(Name_Of_Student,4) from student_details										-- ---Here this is some error
-- //--
-- --------------------------------Agreegate Function--------------------
select sum(maths) from student_marks_details
select max(maths) from student_marks_details
select min(maths) from student_marks_details
select count(maths) from student_marks_details
select avg(maths) from student_marks_details