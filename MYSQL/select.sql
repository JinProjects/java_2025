# 2025-03-19 복습문제
use mbasic;
use sakila;
#Q1.
create table milk(
  mno int not null auto_increment primary key,
  mname varchar(20) not null,
  mprice int not null
);
drop table milk;
insert into milk values(1, 'white',1000);
insert into milk values(2, 'choco',1200);
insert into milk values(3, 'banana',1800);
insert into milk values(4, 'melon',5000);
#Q2.
update milk set mprice=1500 where mno = 4;

#Q3.
delete from milk where mno=4 and mname = 'melon';

#Q4
select * from milk;



# part002 진도 select basic
create table userinfo_ex select * from userinfo;
desc userinfo_ex;
select * from userinfo_ex;

alter table userinfo_ex modify no int not null auto_increment primary key;

#Q1
insert into userinfo_ex (no, name, age) values (5, 'fifth', 55);
insert into userinfo_ex values (5, 'fifth', 55);
insert into userinfo_ex values (6, 'third', 66);

#Q2.
update userinfo_ex set age = 10;
#Q3.
update userinfo_ex set name = 'third', age = 33 where no=3 and age=10;

#Q4.
delete from userinfo_ex where no=3 and age=10;

#Q5.
delete from userinfo_ex;

##2-2
-- 1. 전체 데이터 검색
select * from userinfo_ex;

-- 2. 부분검색
select name, age from userinfo_ex;

-- 3. 중복제거
select distinct(name) from userinfo_ex;

-- 4. 별명
select name a from userinfo_ex;

-- 5. where 조건 ( = 같다, != <> 다르다, < <=, > >= )
select * from userinfo_ex where name = 'second';
select * from userinfo_ex where name != 'second';
select * from userinfo_ex where name <> 'second';

select * from userinfo_ex where age < 33;
select * from userinfo_ex where age <= 33;
select * from userinfo_ex where age > 33;
select * from userinfo_ex where age >= 33;

-- 6. and , between and , or  in
select * from userinfo_ex where age>=22 and age<=33;
select * from userinfo_ex where age between 22 and 33;
select * from userinfo_ex where age not between 22 and 33;

select * from userinfo_ex where age=22 or age=33;
select * from userinfo_ex where age in (22,33);
select * from userinfo_ex where age not in (22,33);


-- 7. null 검색 ( is null, is not null, not in, not between )
desc userinfo_ex;

alter table userinfo_ex modify age int null;
select * from userinfo_ex;
create table select_userinfo select * from userinfo_ex;
insert into select_userinfo (name) values ('seven');

## null 값이 비워있다라는 상태 
-- 1.age는 int형 이라 int형인 값이랑 비교해야하는데 null이라서 안됨
-- null은 
select * from select_userinfo where age = null; -- (x) 
select * from select_userinfo where age is null;

select * from select_userinfo where age != null; -- (x)
select * from select_userinfo where age is not null;

-- 8. like 문자열검색( like 'a%', '%a', '%a%', '_a%' )
select * from select_userinfo where name like 'first';
select * from select_userinfo where name like 'f%'; -- f로 시작
select * from select_userinfo where name like '%t'; -- t로 끝남
select * from select_userinfo where name like '%i%'; -- i포함
select * from select_userinfo where name like '_e%'; -- 두번째글자가 e 


create table select_emp select * from emp;
desc select_emp;
alter table select_emp modify empno int auto_increment primary key;
select * from select_emp;

#q1
select * from select_emp;
#q2
select * from select_emp
where deptno = 30;

#q3
select * from select_emp
where deptno = 30 and job = 'salesman';

#q4
select * from select_emp
where deptno = 30 or job = 'clerk';
#q5
select * from select_emp
where sal*12 = 36000;

#q6
select * from select_emp
where sal >= 3000;
#q7
select * from select_emp
where ename between 'F' and 'Z'; 

#q8
select * from select_emp
where ename <= 'ford';

-- insert into select_emp (ename) values ('find');
#q9
select * from select_emp
where sal != 3000;

#q10
select * from select_emp
where sal <> 3000;

#q11
select * from select_emp
where sal not in (3000);

#q12
select * from select_emp
where job = 'MANAGER' or job = 'SALESMAN' or job ='CLERK';

#q13
select * from select_emp
where job in('MANAGER','SALESMAN','CLERK');

#q14
select * from select_emp
where job != 'MANAGER' and job != 'SALESMAN' and job <> 'CLERK';

#q15
select * from select_emp
where job not in ('MANAGER','SALESMAN', 'CLERK');

#q16
select * from select_emp
where sal >= 2000 and sal <= 3000;

#q17
select * from select_emp
where sal between 2000 and 3000;

#q18
select * from select_emp
where sal not between 2000 and 3000;

#q19
select * from select_emp
where sal < 2000 or sal > 3000;

#q20
select * from select_emp
where empno = 7499 and deptno =30;

#q21
select * from select_emp
where deptno = 20 or job = 'SALESMAN';

#q22
select * from select_emp
where sal >= 2500 and job = 'ANALYST';

#q23
select * from select_emp
where deptno in (10,20);

#q24
select * from select_emp
where deptno not in (10,20);

#q25
select * from select_emp
where ename like 'S%';

#q26
select * from select_emp
where ename like '_L%';

#q27
select * from select_emp
where ename like '%AM%';

#q28
select * from select_emp
where ename not like '%AM%';

#q29
select ename, sal, (sal*12)+ifnull(comm,0) ANNSAL, comm from select_emp
where ename like '%AM%';

#q30
select * from select_emp
where comm is null;

#q31
select * from select_emp
where comm is null;

#q32
select * from select_emp
where mgr is not null;

#q33
select * from select_emp
where sal > null;

#q34
select * from select_emp
where sal > null
   or comm is null;
   
#q35
select * from select_emp
where ename like '%S';

#q36
select * from select_emp
where deptno = 30 and job = 'SALESMAN';

#q37
select * from select_emp
where deptno in (20, 30)
and sal > 2000;

#q38
select * from select_emp
where sal < 2000 or sal > 3000;

#q39
select * from select_emp
where deptno = 30
 and ename like '%E%'
 and (sal < 1000 or sal > 2000);
 
#q40
select * from select_emp
where comm is null
and mgr is not null
and job in('MANAGER','CLERK')
and ename not like '_L%';


#------------------------

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

#------------------------------
#q1.
select sum(sal) from select_emp;

#q2.
select sum(comm) from select_emp;

#q3.
select sum(distinct sal), sum(all sal), sum(sal) from select_emp;

#q4.
select count(*) from select_emp;

#q5.
select count(*) from select_emp
where deptno = 30;

#q6.
select count(distinct sal), count(all sal), count(sal)
from select_emp;

#q7
select count(comm) from select_emp;

#q8
select count(*) from select_emp
where comm is not null;

#q9
select max(sal) from select_emp
where deptno = 10;

#q10
select min(sal) from select_emp
where deptno = 10;


create table fn_select_userinfo2 (
  no int not null default 0,
  name varchar(20) not null,
  age int not null,
  email varchar(20) not null
);

drop table fn_select_userinfo2;
desc fn_select_userinfo2;

insert into fn_select_userinfo2 values (1, 'aaa',11,'aaa@gmail.com');
insert into fn_select_userinfo2 values (2, 'bbb',22,'bbb@gmail.com');
insert into fn_select_userinfo2 values (3, 'ccc',33,'ccc@gmail.com');
insert into fn_select_userinfo2 values (4, 'ddd',44,'ddd@gmail.com');
insert into fn_select_userinfo2 values (5, 'abc',55,'abc@gmail.com');
insert into fn_select_userinfo2 values (6, 'bca',66,'bca@gmail.com');

#q1.
select name, length(name) 
from fn_select_userinfo2;

#q2
select name, left(name,1), right(name,1)
from fn_select_userinfo2;

#q3
select name, replace(name,'aaa','aaa 1등')
from fn_select_userinfo2;
select *
from fn_select_userinfo2;
#q4
select concat(name,"는 개발자입니다.")
from fn_select_userinfo2;

#q5
select upper(name)
from fn_select_userinfo2;

#q6
select lower(name)
from fn_select_userinfo2;


#q7
select name, instr( )
from fn_select_userinfo2
where age >= 40;
