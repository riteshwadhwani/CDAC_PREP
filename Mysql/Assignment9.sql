Que 1 )
select onum,cname from orders,customers where orders.cnum = customers.cnum;

Que 2)
select cname, sname ,onum from orders,customers,salespeople where salespeople.snum = customers.snum and customers
.cnum = orders.cnum;

Que 3)
 select cname, sname,comm from customers,salespeople where customers.snum = salespeople.snum and salespeople.comm
>.12;

Que 4)
select Orders.onum , Salespeople.comm*Orders.amt as comm,sname from orders,salespeople where
    -> orders.snum = salespeople.snum;