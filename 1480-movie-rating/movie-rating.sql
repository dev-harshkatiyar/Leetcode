# Write your MySQL query statement below
(select name as results
from users as u
join movierating as m
on u.user_id=m.user_id
group by name
order by count(*) desc,name
limit 1)

UNION ALL

(select title as results
from movies as m
join movierating as mr
on m.movie_id=mr.movie_id
where month(mr.created_at)=2 and year(mr.created_at)=2020
group by title
order by avg(mr.rating) desc,title
limit 1
)