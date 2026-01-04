# Write your MySQL query statement below
select b.book_id,b.title,b.author,b.genre,b.pages,max(rs.session_rating)-min(rs.session_rating) as rating_spread,
round(sum(case 
when rs.session_rating>=4 or rs.session_rating<=2 then 1 else 0 
end)/count(rs.session_rating),2) as polarization_score
from books as b
left join reading_sessions as rs
on b.book_id=rs.book_id
group by b.book_id,b.title,b.author,b.genre,b.pages
having count(rs.session_rating)>=5
and sum(case when rs.session_rating>=4 then 1 else 0 end)>0
and sum(case when rs.session_rating<=2 then 1 else 0 end)>0
and polarization_score>=0.6
order by polarization_score desc,title desc