select * from orders where Amt > 1000;

select Sname,City from Salespeople where Sname = 'London' and Comm>.10;

select * from costumer where City = 'Rome' or Rating<=100;

it will print all the entries except the one's who Amt is greater than 1000 and 
there date is not equal to 1990-10-03 and also cnum is greater then 2003.

5)


6) Select snum,sname,city,camm from salespeople where comm between .12 and .14;