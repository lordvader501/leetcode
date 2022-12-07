-- https://leetcode.com/problems/duplicate-emails/
select email as Email from Person as p
group by Email having count(p.Email)>1;
--or
select Email from(
select Email , count(Email) as nums from Person
    group by Email
)as Email 
where nums > 1;
