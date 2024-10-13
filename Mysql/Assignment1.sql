implement init cap .

select concat(substr(fname,1,1),substr(fname,2)) from ename;

select rpad(lpad(ename,(60-length(ename))/2,'*'),(60-length(ename)*2),'*') from emp;