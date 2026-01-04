# Write your MySQL query statement below
select l.book_id,l.title,l.author,l.genre,l.publication_year,total_copies as current_borrowers
from library_books as l
left join borrowing_records as b
on l.book_id=b.book_id
where b.return_date is null
group by l.title
having count(b.record_id)=l.total_copies
order by current_borrowers desc,title 