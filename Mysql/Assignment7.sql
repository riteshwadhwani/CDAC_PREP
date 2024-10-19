Ans 1->
Select Count(Onum) form orders where Odate like '%3';

Ans 2->
Select City from Customer where City is not null;

Ans 3-> -- recheck
select Snum,min(Amt) from orders group by Snum;

Ans 4 ->
select Cnum,Cname,City,Rating,Snum from customer where Cname like 'G%' order by
2 Limit 1;
Ans 5 ->
Select City , Max(Rating) from customer group by City;

Ans 6 ->
Select Sname, Count(Onum) ,Snum from orders,salespeople where orders.Snum = salespeople.Snum
group by Sname,Snum order by Sname;