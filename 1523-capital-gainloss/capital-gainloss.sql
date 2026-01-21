# Write your MySQL query statement below
select stock_name,
sum(if(operation="sell",price,0)-if(operation="buy",price,0)) as capital_gain_loss
from stocks
group by stock_name
