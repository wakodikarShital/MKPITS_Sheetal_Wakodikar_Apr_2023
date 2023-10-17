-- -------- Assignment-group by--------
use sakila

-- Que9.Retrieve the total revenue generated for each city.


select sum(payment.amount) as revenue ,city.city_id  from payment
join customer
on customer.customer_id = payment.customer_id
join address
on address.address_id=customer.address_id
join city
on city.city_id=address.city_id
group by city.city_id


