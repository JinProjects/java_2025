use mbasic;
#복습

#Q1.
select * from emp
where deptno = 30 and ename like '%E%'
and sal not between 1000 and 2000;

#Q2.
select * from emp
where mgr is not null 
and job in('MANAGER','CLERK')
AND ename not like '_L%';

select * from select_userinfo;
 
 
## ■ 1. order by + limit
/*
select  필드1, 필드2
from   테이블명
where  조건식
order by  기준필드 [asc(1,2,3 오름차순) | desc(3,2,1 내림차순)]
limit  몇개
*/
-- 1-2. 정렬
select * from select_userinfo order by age desc;
select * from select_userinfo order by age asc;

-- 나이많은 3명
select * 
from select_userinfo 
order by age desc 
limit 3;

-- no가 높은순으로 4명
select *
from select_userinfo
order by no desc
limit 4;
#-----------------------------------
#q2
select * from select_emp
where job = 'salesman';

#q3
select ename, mgr, sal from select_emp;

#q4
select ename, mgr, sal from select_emp
where job = 'SALESMAN';

#q5
select * from select_emp 
order by sal desc;

#q6
select * from select_emp
order by job asc, sal desc;

#q7
select ename, sal, empno select_empno from select_emp
where sal >= 2000
order by select_empno desc;

#q8
select distinct job from select_emp;

#q9
select empno 사원번호, ename 이름, job 담당업무 from select_emp;

#q10
select * from select_emp
order by sal asc;

#q11
select * from select_emp
order by sal desc;

#q12
select * from select_emp
order by deptno asc, sal desc;

#q13
select empno select_empLOYEE_NO, ename select_empLOYEE_NAME, JOB, mgr MANAGER, HIREDATE,
		sal SALARY, comm COMMISSION, deptno DEPARTMENT_NO
FROM select_emp;


#------------------------
#집계함수
create table group_userinfo(
  no int not null auto_increment primary key,
  name varchar(20) not null,
  age int not null,
  sex char(2),
  kor int,
  eng int,
  math int,
  ban char(2),
  sns char(2) default 'y'
);

insert into group_userinfo (name, age, sex, kor, eng, math, ban, sns)values('first',11,null,100,100,99,'A','n');
insert into group_userinfo (name, age, sex, kor, eng, math, ban, sns)values('second',22,'m',89,92,78,'B','y');
insert into group_userinfo (name, age, sex, kor, eng, math, ban, sns)values('third',33,'m',90,92,97,'A','y');
insert into group_userinfo (name, age, sex, kor, eng, math, ban, sns)values('fourth',44,'f',40,42,67,'C','n');
insert into group_userinfo (name, age, sex, kor, eng, math, ban, sns)values('fifth',55,'f',89,86,99,'B','y');
insert into group_userinfo (name, age, sex, kor, eng, math, ban, sns)values('sixth',66,'m',10,20,44,'C','n');

select * from group_userinfo;

select  @@sql_mode;
set  SESSION  sql_mode='STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

select * from group_userinfo group by ban;

/*  
select   필드1, 필드2
from     테이블명
where    조건식 
group by  그룹핑
having    조건식
order by 기준필드  [asc(1,2,3오름차순) | desc(3,2,1 내림차순)]
limit    몇개

avg(컬럼명) 평균, max 최대값, min 최소값 , sum 합계 , count 갯수

*/

select ban, sum(age), avg(age) 평균나이
from group_userinfo
group by ban
having avg(age) >= 35
order by 평균나이 desc;


#Q1. 
select avg(age)
from group_userinfo;
#Q2.
select ban, count(*)
from group_userinfo
group by ban;

#Q3.
select ban, sum(kor), sum(eng), sum(math)
from group_userinfo
group by ban;

#Q4.
select ban, avg(kor), avg(eng), avg(math)
from group_userinfo
group by ban;

#Q5.
select ban, sum(age), avg(age), max(age), min(age)
from group_userinfo
group by ban;

#Q6.
select ban, avg(kor), avg(eng), avg(math)
from group_userinfo
group by ban
HAVING avg(kor) >= 89;

#Q7.
select ban, sum(age), avg(age), max(age), min(age)
from group_userinfo
group by ban
having avg(age) >= 30;

#Q8.
select ban, sum(age) 나이총합, avg(age) 나이평균, max(age) 최고나이, min(age) 최저나이
from group_userinfo
group by ban
having avg(age) >= 30
order by avg(age) desc;
select * from group_userinfo;
#Q9
select ban, sum(case when age < 20 then 1 else 0 end) 
from group_userinfo
group by ban;

SELECT g1.ban, 
       COALESCE(COUNT(g2.age), 0) AS minor_count
FROM (SELECT DISTINCT ban FROM group_userinfo) g1
LEFT JOIN group_userinfo g2
ON g1.ban = g2.ban AND g2.age < 20
GROUP BY g1.ban;

#10
select ban, sum(case when sns = 'n' then 1 else 0 end) sns수신거부수
from group_userinfo
group by ban;

#11
select max(hiredate) '20부서 최근입사일'
from emp
where deptno = 20;

#12
select min(hiredate) '부서20 제일오래 된 입사일'
from emp
where deptno = 20;

#13
select avg(sal)
from emp
where deptno = 30;

#14
select avg(distinct sal)
from emp
where deptno = 30; 

#15
select deptno, avg(sal)
from emp
group by deptno
order by deptno;

#16
select deptno, job, avg(sal) 평균급여
from emp
group by deptno, job
order by deptno;

#17
select deptno, job, avg(sal) 평균급여
from emp
group by deptno, job
having 평균급여 >= 2000
order by deptno;

#18 where절에 집계함수 사용 할 수 없다
select deptno, job, avg(sal)
from emp
where avg(sal) >= 2000
group by deptno, job
order by deptno, job;

#19
select deptno, job, avg(sal) 평균급여
from emp
where sal <=3000
group by deptno, job
having 평균급여 >= 2000
order by deptno;

#20
select deptno, job, count(*) 사원수, max(sal), sum(sal), avg(sal)
from emp
group by deptno, job
order by deptno;

