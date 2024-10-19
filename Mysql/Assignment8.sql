Ques 1 )
Select Orders.Onum, Salespeople.Snum, Orders.Amt*.12 Comm from Orders , Salespeople
where order.Snum = Salespeopl.Snum;

Ques 2 )
Select concat("City is :" ,City) City, concat("Highest Rating :",max(Rating)) Rating from customer
group by city; 

Ques 3)
Select Rating,Cname,Cnum from Customer order by Rating desc;

Ques 4)
select odate,count(onum) from orders group by odate order by odate;