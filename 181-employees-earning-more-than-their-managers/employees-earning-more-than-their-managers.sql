select e.name as Employee
from employee as e
join employee as b
on e.managerId=b.id
where e.salary>b.salary