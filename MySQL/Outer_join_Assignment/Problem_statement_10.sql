-- ------------------------ OuterJoin Assignment -----------------------------
use student_managment_system
use sakila

-- Problem Statement 10: Explore Staff and Their Associated Stores
-- Retrieve staff details (staff ID, first name, last name) and the store they are associated with. Include staff who are not associated with any store.

select staff.staff_id,staff.first_name,staff.last_name,store.store_id
from staff
left join store
on staff.store_id=store.store_id
order by staff_id


