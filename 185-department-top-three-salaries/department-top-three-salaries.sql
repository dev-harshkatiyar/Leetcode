# Write your MySQL query statement below
select d.name as department,e.name as employee,e.salary
from department as d
join employee as e
on e.departmentid=d.id
where (
    select count(distinct salary)
    from employee as e2
    where e2.departmentid=e.departmentid and e2.salary>=e.salary
)<=3
order by department,salary desc
