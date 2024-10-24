Que 1 )
select min(distinct sal) from emp where sal >(select min(distinct sal) from emp where
 sal >(select min(distinct sal) from emp));