#Q1
select sal
from emp
where ename = 'JONES';

#Q2
select empno, ename, job, mgr, hiredate, sal, comm, deptno
from emp
where sal > 2975;

#Q3
select empno, ename, job, mgr, hiredate, sal, comm, deptno
from emp
where sal > (select sal from emp where ename = 'JONES');

#Q4
select empno, ename, job, mgr, hiredate, sal, comm, deptno
from emp
where hiredate < (select hiredate from emp where ename = 'scott');
select * from salgrade;
#Q5
select e.empno, e.ename, e.job, e.sal, d.deptno, d.dname, d.loc
from emp e inner join dept d
on e.deptno = d.deptno
where e.sal > (select avg(sal) from emp)
and e.deptno = 20
order by empno desc;

#Q6
select empno, ename, job, mgr, hiredate, sal, comm, deptno
from emp
where deptno in (20,30);

#Q7
select max(sal)
from emp
group by deptno
order by max(sal) desc;

#Q8
select empno, ename, job, mgr, hiredate, sal, comm, deptno
from emp 
where sal in (select max(sal) from emp group by deptno);

#Q9
select empno, ename, job, mgr, hiredate, sal, comm, deptno
from emp
where sal = ANY (select max(sal) from emp group by deptno);

#Q10
select empno, ename, job, mgr, hiredate, sal, comm, deptno
from emp
where sal = some (select max(sal) from emp group by deptno);

#Q11
select sal
from emp
where deptno = 30;

#Q12
select empno, ename, job, mgr, hiredate, sal, comm, deptno
from emp 
where sal < all (select max(sal) from emp group by deptno);
select max(sal) from emp group by deptno;

#Q13
select empno, ename, job, mgr, hiredate, sal, comm, deptno
from emp
where sal > any (select min(sal) from emp where deptno = 30)
order by sal desc;