-- ------------------------ OuterJoin Assignment -----------------------------
use student_managment_system
use sakila

-- Problem Statement 8: List Payments with Customer Information
-- List payment details (payment ID, amount, and payment date) along with the names of customers who made those payments. Include payments that have not been made.

select payment.payment_id,payment.amount,payment.payment_date,customer.first_name,customer.last_name
from payment
left join customer
on customer.customer_id=payment.customer_id
order by payment_date

