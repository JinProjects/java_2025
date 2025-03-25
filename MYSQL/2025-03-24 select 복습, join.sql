#복습문제
#https://hi-sally03915.tistory.com/1684
#Q1
create table join_userban(
	no int not null auto_increment primary key,
    name varchar(20) not null,
    ban char(2)
);
use mbasic;
insert into join_userban (name, ban) values ('first', 'A');
insert into join_userban (name, ban) values ('second', 'B');
insert into join_userban (name, ban) values ('third', 'A');
insert into join_userban (name, ban) values ('fourth', 'C');
insert into join_userban (name, ban) values ('fifth', 'B');
insert into join_userban (name, ban) values ('sixth', 'C');
insert into join_userban (name, ban) values ('fifth', 'B');
insert into join_userban (name, ban) values ('sixth', 'C');

#Q3
update join_userban set ban = 'D' where no >= 7;

#Q4
delete from join_userban where no >= 7;

#Q5
select ban, count(*)
from join_userban
group by ban;

#function 예제
#https://hi-sally03915.tistory.com/1665
select sal+ifnull(comm,0)
from emp;
#q1
select empno, ename, sal, comm ,sal+comm, if(comm is null ,0,comm), if(comm is null,sal,sal+ifnull(comm,0)) 'sal+comm'
from emp;

select ename, sal * 12
from emp;
#q2
#if
select empno, ename, comm
		,if(comm is null, 'X','O') comm
        ,if(comm is null, sal * 12, sal * 12 + if(comm is null, 0, comm)) ANNSAL
from emp;

#case
select empno, ename, comm
		,case when comm is null then 'X'
				else 'O'
                end comm
		,case when comm is null then sal * 12
				else sal * 12 + if(comm is null, 0, comm)
		end ANNSAL
from emp;

#q3
select ename
	  ,job
      ,sal
      ,case when job = 'MANAGER' then sal+(sal * 0.1)
			when job = 'SALESMAN' then sal+(sal * 0.05)
            when job = 'ANALYST' then sal
            else sal+(sal * 0.03)
            end UPSAL
from emp;

#q4
select empno, ename, comm
	  ,case when comm is null then '해당사항 없음'
		    else if(comm = 0, '수당없음', concat('수당 : ', if(comm is not null, comm, 0)))
            end COMM_TEXT
from emp;

#q5
select empno
	   ,rpad(substr(empno,1,2), length(empno), '*') mask
       ,ename
       ,rpad(substr(ename,1,1), length(ename),'*') MASKING_EN
from emp
where length(ename) = 5;

#q6 
select empno
	  ,ename
      ,sal
      ,truncate(sal/21.5,2) DAY_PAY
      ,round(sal/21.5/8,1) TIME_PAY
from emp;

#q7
select empno
	  ,ename
      ,mgr
      ,case when substr(mgr,1,2) = '75' then '5555'
            when substr(mgr,1,2) = '76' then '6666'
            when substr(mgr,1,2) = '77' then '7777'
            when substr(mgr,1,2) = '78' then '8888'
            when mgr is null then '0000'
			else mgr
            end CHG_MGR
from emp;

#q8
select empno
	  ,ename
      ,hiredate
      ,'2021-11-29'
      ,period_diff(date_format('2021-11-29','%Y%m'),date_format(hiredate,'%Y%m')) 근무월수
      ,truncate(period_diff(date_format('2021-11-29','%Y%m'),date_format(hiredate,'%Y%m'))/12,0) 근무년수
from emp;
# 데이터베이스언어 *중요
# DDL - create, alter, drop
# DML - select, insert, update, delete
# DCL - grant, revoke

# e(entity) r(relation) 속성 : pk, fk
# join *중요
-- 두개이상의  테이블들을 연결해서 데이터를 조회
-- 테이블간의 연결고리 ( pk, fk )

# 종류 : inner join,  outer join

create table join_userinfo(
	no int not null,
    name varchar(100) not null,
    age int not null
);

insert into join_userinfo values(1, 'first',11);
insert into join_userinfo values(2, 'second',22);
insert into join_userinfo values(3, 'third',33);
insert into join_userinfo values(4, 'fourth',44);

select * from join_userinfo;
select * from join_userban;


/* question1) join을 이용하여 join_userinfo
  학생의 번호, 이름, 나이, 반을 출력하시오.
+----+--------+-----+------+
| no | name   | age | ban  |
+----+--------+-----+------+
|  1 | first  |  11 | A    |
|  2 | second |  22 | B    |
|  3 | third  |  33 | A    |
|  4 | fourth |  44 | C    |
+----+--------+-----+------+
>>> (1) = join

>>> (2) join  on

>>> (3) join  using

>>> (4) natural join
*/ 
select * from join_userinfo;
select * from join_userban;
#q1
select a.no, a.name, a.age, b.ban
from join_userinfo a, join_userban b
where a.no = b.no;
#q2
select `join_userinfo`.no, `join_userinfo`.name, `join_userinfo`.age, `join_userban`.ban
from join_userinfo inner join join_userban
on `join_userinfo`.no = `join_userban`.no;

#q3
select a.no, a.name, a.age, b.ban
from join_userinfo a inner join join_userban b
using (no);

#q4 연결되는 키 찾아서 알아서 조인함
select no, name, age, ban
from join_userinfo natural join join_userban;

#q2
select * from join_userinfo;
select * from join_userban;
-- (1) = join
select a.no, a.name, a.age, b.ban
from join_userinfo a, join_userban b
where a.no = b.no
and a.age between 20 and 40;
-- (2) join on
select `join_userinfo`.no, `join_userinfo`.name, `join_userinfo`.age,`join_userban`.ban
from join_userinfo inner join join_userban
on `join_userinfo`.no = `join_userban`.no
where `join_userinfo`.age between 20 and 40;

-- (3) join using
select a.no, a.name, a.age, b.ban
from join_userinfo a inner join join_userban b
using(no)
where a.age between 20 and 40;

-- (4) natural join
select no, name, age, ban
from join_userinfo natural join join_userban
where age between 20 and 40;

#Q3
select a.no, a.name, b.ban, a.age
from join_userinfo a right join join_userban b -- 오른쪽 테이블 값 보장
on a.no = b.no;
select * from join_userinfo;
select * from join_userban;
#Q4
select b.no, b.name, b.ban, a.age
from join_userinfo a right join join_userban b
on a.no = b.no;

# join 연습문제
#Q1
-- 조인조건이 없으면 행을 전부 곱한다
select * 
from emp, dept
order by empno;

select * from dept;
#Q2
select a.empno
	  ,a.ename
      ,a.job
      ,a.mgr
      ,a.hiredate
      ,a.sal
      ,a.comm
      ,a.deptno
      ,b.deptno
      ,b.dname
      ,b.loc
from emp a, dept b
where a.deptno = b.deptno;

#Q3
select E.empno, E.ename, E.job, E.mgr, E.hiredate, E.sal, E.comm, E.deptno, D.deptno, D.dname, D.loc
from emp E, dept D
where E.deptno = D.deptno;

#Q4 Error Code: 1052. Column 'deptno' in field list is ambiguous
select empno, ename, deptno, dname, loc
from emp E, dept d
where E.deptno = D.deptno;

#Q5
select E.empno, E.ename, E.deptno, D.dname, D.loc
from emp E, dept d
where E.deptno = D.deptno;

#Q6
select E.empno, E.ename, E.sal, E.deptno, D.dname, d.loc
from emp E, dept D
where E.deptno = D.deptno
and E.sal >= 3000;


select * from emp;
select * from salgrade;
#Q7
select E.empno, E.ename, E.job, E.mgr, E.hiredate, E.sal, E.comm, E.deptno, S.grade, S.losal, S.hisal
from emp E, salgrade S
where E.sal between S.losal and S.hisal
order by sal;

select * from emp;
#Q8
select e1.empno, e1.ename, e2.empno, e2.ename
from emp e1, emp e2
where e1.mgr = e2.empno
order by e1.mgr;

#Q9
select e1.empno, e1.ename, e1.mgr, e2.empno, e2.ename
from emp e1 left join emp e2
on e1.mgr = e2.empno;

#Q10 -- 직속상관에 포함하는 사원이 없는 데이터도 조회
select e1.empno, e1.ename, e1.mgr, e2.empno, e2.ename
from emp e1 right join emp e2
on e1.mgr = e2.empno
order by e1.empno;

#Q11 같은 컬럼을 찾아서 조인시킴, 데이텉타입, 이름이 같아야 한다
select e.empno, e.job, e.mgr, e.hiredate, e.sal, e.comm, e.deptno, d.dname, d.loc
from emp e natural join dept d
order by e.deptno;

#Q12
select empno, ename, job, mgr, hiredate, sal, comm, deptno, dname, loc
from emp inner join dept
using(deptno)
where sal >= 3000
order by sal desc;

#Q13
select e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm, e.deptno, d.dname, d.loc
from emp e inner join dept d
where e.deptno = d.deptno
and e.sal <= 3000
order by deptno;

#Q14
select e.deptno, d.dname, e.empno, e.ename, e.sal
from emp e, dept d
where e.deptno = d.deptno
and e.sal > 2000;

#Q15
select deptno, dname, empno, ename, sal
from emp natural join dept
where sal > 2000;

#Q16
select e.deptno, d.dname, avg(e.sal) AVG_SAL, max(sal) MAX_SAL, min(sal) MIN_SAL, count(*) CNT
from emp e, dept d
where e.deptno = d.deptno
group by e.deptno, d.dname
order by deptno;

#Q17
select e.deptno, d.dname, avg(e.sal) AVG_SAL, max(sal) MAX_SAL, min(sal) MIN_SAL, count(*) CNT
from emp e join dept d
using(deptno)
group by e.deptno, d.dname
order by e.deptno;

#Q18
select d.deptno, d.dname, e.empno, e.ename, e.job, e.sal
from dept d left join emp e 
on e.deptno = d.deptno
order by d.deptno;

#Q19
select d.deptno, d.dname, e.empno, e.ename, e.job, e.sal
from emp e right join dept d
on e.deptno = d.deptno
order by d.deptno;

#Q20
select d.deptno, d.dname
	  , e1.empno, e1.ename, e1.mgr, e1.sal, e1.deptno
      , s.losal, s.hisal, s.grade
      , e2.empno mgr_empno, e2.ename mgr_ename
from emp e1 right join dept d
on e1.deptno = d.deptno
left join emp e2
on e1.mgr = e2.empno
left join salgrade s
on e1.sal between s.losal and s.hisal
order by d.deptno, e1.empno;


#select 정리문제
#https://hi-sally03915.tistory.com/1666
select * from emp;
select * from dept;
#Q1 'CHICAGO'
select ename, job
from emp e, dept d
where e.deptno = d.deptno
and e.deptno = 30
and d.loc = 'CHICAGO'
and (e.ename like 'A%' or e.ename like 'W%');

#Q2
select ename, sal, comm, if(comm is null, 0,comm)+sal
from emp;

#Q3
select ename, job, date_format(hiredate,'%Y/%m/%d') 입사일
from emp;

#Q4
select ename, sal, if(comm is null, 0,comm), sal+comm 총급여, truncate((sal+comm)*0.03,-1) 세금 
from emp
group by ename, sal, comm;

#Q5
select ename, hiredate, concat(period_diff(date_format('2021-11-30','%Y%m'),date_format(hiredate,'%Y%m')),'개월') 근무월수
from emp
where deptno = 30
having 근무월수 >= 450;

#Q6
select ename, hiredate, floor(period_diff(date_format('2021-11-30','%Y%m'),date_format(hiredate,'%Y%m'))/12) 근무년수
from emp
having 근무년수 >= 35;

#Q7 
select now() - weekday(date(now()))  sunday;
select weekday;

select datediff(now(),'2025-03-23');
select now()-((weekday(now())>=4) * 7 - 8);
select date_add(now(),interval 1 day);

#Q8

select ename, sal, repeat('*',if(length(sal)=4,substr(sal,1,1),0)) graph
from emp;

#Q9
select deptno, job, count(*)
from emp
group by deptno, job
order by deptno;

#Q10
select deptno 부서, count(*) 인원수
	  ,rank() over(order by count(*) desc) 순위
from emp
group by 1;

#Q11
select floor(avg(sal)), sum(sal)
from emp;

#Q12
-- select avg(sal), count(*) 
select floor(avg(sal)) 평균급여, count(*) 인원수
from emp
where sal >= ( select avg(sal) from emp );

#Q13