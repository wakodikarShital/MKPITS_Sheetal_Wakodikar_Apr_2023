-- PROCEDURE-20--------------------------------------------------------------------
delimiter //
create function calGst(p_amt decimal (5,2))
Returns decimal(5,2) deterministic
begin
declare gst decimal(5,2);
set gst=p_amt *0.18;
Return gst;
end
//
delimiter ;  
select calGst(0.5);

select customer_id,payment_id,amount,calGst(amount) as GST,amount+calGst(amount) as totalOfAmt from payment where customer_id=2