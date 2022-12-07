-- https://leetcode.com/problems/customers-who-never-order/
SELECT name AS Customers
FROM Customers C
WHERE NOT EXISTS(
    SELECT customerId
    FROM Orders
    WHERE customerId = C.id
)
--or
select c.name as Customers from Customers as c
where c.id not in (select customerId from Orders);
--or
select c.name as Customers from Customers as c
left join Orders as o
on c.id = o.customerId
where o.customerId is Null;
