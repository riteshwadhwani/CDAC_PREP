que 1 )delimiter //
create procedure abd()
BEGIN
declare x int default 10 ;
select sal into x from emp where empno =1;
if x between 1 and 10 THEN
insert into tempp values(x,'in between');
else 
insert into tempp values(x,'not in between');
end if;
end;//
delimiter ;

que 2 )
delimiter //
create procedure abc()
BEGIN
declare x int ;
declare y int;
declare z int;
declare c1 cursor  for select empno from emp limit 3;
open c1;
fetch c1 into x;
fetch c1 into y;
fetch c1 into z;

if x + y >= z or x + z >=y or y + z >= x THEN
insert into tempp values(1,'Triangle');
else
insert into tempp values(1,'Not Triangle');
end if ;
end;//
delimiter ;

Que 3 )
delimiter //
create procedure leap_year(val int)
BEGIN
if mod(val,4) = 0 THEN
if mod(val,100) != 0  THEN
insert into tempp values('2','leap year');
else
insert into tempp values('2','Not leap year');
end if;
elseif mod(val,400) = 0 THEN
insert into tempp values('2','leap year');
else 
insert into tempp values('2','Not leap year');
end if;
end;//

Que 4 )
delimiter //
create procedure check_present ()
BEGIN
declare x varchar(15);
declare y varchar(15);
declare ans int;
declare c1 cursor for select ename from emp order by 1 limit 2;
open c1;
fetch c1 into x;
fetch c1 into y;
set ans = instr(x,y);

if ans = 0 THEN
insert into tempp values(3,'Not present');
else 
insert into tempp values(3,'Present');
end if;
end;//
delimiter ;

----EXERCISE 3 -----
Que1 )

delimiter //
create procedure iterator()
BEGIN
declare x int default 1;
while x <= 1000 do 
if mod(x,100) = 0 THEN
insert into tempp values(x,'value');
end if;
set x = x + 1;
end while;
end ;//
delimiter ;

Que 2 )

delimiter //
create procedure cubes_digit()
BEGIN
declare i int default 1;
declare x int ;
declare s int;
declare rem int;

while i<=999 do 
set x = i;
set s = 0;
while x!=0 do 
set rem = mod(x,10);
set s = s + rem*rem*rem;
set x = x/10;
end while;
if s = i THEN
insert into tempp values(i,'digit');
end if;
set i = i + 1;
end while;
end;//

Que 3 )

delimiter //
create procedure palindrome(val char(5))
BEGIN
declare x char(5);
declare y char(5);
declare i int default 1;
declare j int default 5;
declare flag boolean default true;
while i<j do 
set x = substr(val,i,1);
set y = substr(val,j,1);
if(x != y) THEN
set flag = false;
end if;
set i = i + 1;
set j = j - 1;
end while;
if flag THEN
insert into tempp values(5,'Palindrome');
else 
insert into tempp values(5,'Not Palindrome');
end if;
end;//
delimiter ;

---- Exercise 4 -------


Que 1 )

create table customer(
meterno varchar(4) ,
metertype char(1),
prevread int(5),
currentread int(5),
customertype char(1),
lbpay char(1) check(lbpay in ('Y','N'))
);

CREATE TABLE bill (
mno varchar(4),
units float,
rate float,
amt float,
sc float,
exduty float,
net float);

create table bill_help(
amount float,
surcharge float,
net float);

insert into customer values 
('M1','T',1000,1100,'A','Y'),
('M2','T',10000,15000,'I','Y'),
('M3','S',500,800,'R','Y');

delimiter //
create procedure calculate()
BEGIN
declare mno varchar(4);
declare mty char(4);
declare cR float;
declare pR float;
declare lastP char(1);
declare cty char(1);
declare units float ;
declare rate float;
declare amount float;
declare surcharge float;
declare excise float;
declare netamt float;
declare e int;
declare i int default 0;
declare c1 cursor for select * from customer;
select count(*) into e from customer;
open c1;

while i<e do 
fetch c1 into mno,mty,pR,cR,cty,lastP;
set units = cR - pR;
if cty = 'A' THEN
set rate = 1;
else if cty = 'I' THEN
set rate = 1.25;
else if cty = 'C' then
set rate = 1.50; 
else 
set rate = 1.30;
end if;
if mty = 'T' then
set surcharge = .5;
else
set surcharge = .10;
end if;
set amount = rate * units;
set excise = (amount + surcharge)*.30;
set netamt = amount + surcharge + excise;

insert into bill values
(mno,units,rate,amount,surcharge,excise,netamt);
insert into bill_help values
(amount,surcharge,excise,netamt);
set i = i + 1;
end while;
close c1;
end;//


delimiter //
create procedure calculate()
BEGIN
declare mno varchar(4);
declare mty char(4);
declare cR float;
declare pR float;
declare lastP char(1);
declare cty char(1);
declare units float ;
declare rate float;
declare amount float;
declare surcharge float;
declare excise float;
declare netamt float;
declare e int;
declare i int default 0;
declare c1 cursor for select * from customer;
select count(*) into e from customer;
open c1;

while i<e do 
fetch c1 into mno,mty,pR,cR,cty,lastP;
set units = cR - pR;

set rate = 1.30;
set surcharge = .10;
set amount = rate * units;
set excise = (amount + surcharge)*.30;
set netamt = amount + surcharge + excise;

insert into bill values
(mno,units,rate,amount,surcharge,excise,netamt);
insert into bill_help values
(amount,surcharge,netamt);
set i = i + 1;
end while;
close c1;
end;//

----EXERCISE 5 -----
Ques 1)
delimiter //
create function check_triangle(a float , b float , c float)
returns boolean
deterministic
BEGIN
declare sum1 float;
declare sum2 float ;
declare sum3 float ;
declare ans boolean default true;
set sum1 = a + b;
set sum2 = b + c;
set sum3 = c + a;
if sum1 < a or sum1 < b or sum1 < c then
return false;
end if;
if sum2 < a or sum2 < b or sum2 < c then
return false;
end if;
if sum3 < a or sum3 < b or sum3 < c then
return false;
else 
return true;
end if;

end;//


Ques 2)

delimiter //
create function swap(val varchar(5))
returns varchar(5)
deterministic
BEGIN
declare l int;
declare s int default 1;
declare temp varchar(1);
declare e int default 5;
declare i int default 0;
set l = length(val);

while i<l do 
set temp = substr(val,s,1);
set val = replace(val,substr(val,s,1),substr(val,e,1));
set temp = trim(temp);
set val = replace(val,substr(val,e,1),temp);
set s = s + 1;
set e = e - 1;
set i = i + 1;
end while;
return val;
end;//
delimiter ;



delimiter //
create function swap(val varchar(5))
returns varchar(5)
deterministic
BEGIN
declare l int;
declare s int default 1;
declare temp varchar(5);
declare e int default 5;
declare i int default 0;
set l = length(val);

while i<l do 
set temp = substr(val,s,1);
replace(val,substr(val,s,1),substr(val,e,1));
set s = s + 1;
set e = e - 1;
set i = i + 1;
end while;

return val;
end;//
delimiter ;


----Exercies 6 --------



delimiter //
create function cal(val date)
returns int
deterministic 
BEGIN
declare x int ;
set x = round(datediff(now(),val)/(12*30));
return x;
end;//

delimiter //
create procedure age_calc(val date)
BEGIN
declare x int;
set x = cal(val) ;
insert into tempp values(x,'Age');
end;//
delimiter ;

delimiter //
create procedure use_cursor()
BEGIN
declare a int;
declare b varchar(20);
declare c int ;
declare d int;
declare i int default 0;
declare y int;
declare c1 cursor for select * from emp;
select count(*) into y from emp;
open c1;
while i < y do
fetch c1 into a,b,c,d;
insert into tempp values(a,b);
set i = i + 1;
end while;
end;//
delimiter ;

