-- ------------------------ MyCursors Assignment -----------------------------
use student_managment_system
use sakila


-- Problem Statement 4: Retrieve Film Information by Category
-- Create a cursor to retrieve film details for a specific film category from the Sakila database.


delimiter //
create procedure Retrive_Film_Info()
begin
declare description_s text;
declare title_s varchar(128);
declare films_id smallint(5);
declare done int ;

declare myCursor3 CURSOR for select film.description,film.title,film.film_id from film 
where film.film_id=5;
declare continue handler for not found set done=1;
open myCursor3;
film_Info : Loop
fetch myCursor3 into description_s,title_s,films_id ;
insert into Film_Info values (description_s,title_s, films_id);
if done=1 then
leave film_Info;
end if;
end Loop;
close myCursor3;
end
//
delimiter ;

call Retrive_Film_Info();
drop procedure Retrive_Film_Info

create table Film_Info(description_s text, title_s varchar(128),films_id smallint(5))
select * from Film_Info
drop table Film_Info