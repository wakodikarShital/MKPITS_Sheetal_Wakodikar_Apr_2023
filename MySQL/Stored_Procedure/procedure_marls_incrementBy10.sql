-- PROCEDURE-18--------------------------------------------------------------------
-- retrive the marks from each student and the marks increment by 10
select Roll_No,maths,physics,chemistry from student_marks_details
delimiter //
create procedure MarksIncreament(In s_id char(5),in incr int)
begin

update student_marks_details set physics=physics+incr , chemistry=chemistry+incr , maths=maths+incr 
where Roll_No=s_id ;

end
//
delimiter ;

call MarksIncreament(7,10);
drop procedure MarksIncreament