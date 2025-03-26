/*
1. CRUD (SELECT Subquery)
2. CRUD (SELECT Subquery 연습문제 1~13)
3. CRUD (SELECT Subquery 연습문제 14~25)
________________________________________________________________
________________________________________________________________


■진행1. CRUD (SELECT Subquery)
[실습] 다음과 같이 데이터를 준비하시오
mysql> desc sub_userinfo;
+-------+-------------+------+-----+---------+----------------+
| Field | Type        | Null | Key | Default | Extra          |
+-------+-------------+------+-----+---------+----------------+
| no    | int(11)     | NO   | PRI | NULL    | auto_increment |
| name  | varchar(20) | NO   |     | NULL    |                |
| age   | int(11)     | NO   |     | NULL    |                |
| sex   | char(2)     | YES  |     | NULL    |                |
| kor   | int(11)     | YES  |     | NULL    |                |
| eng   | int(11)     | YES  |     | NULL    |                |
| math  | int(11)     | YES  |     | NULL    |                |
| ban   | char(2)     | YES  |     | NULL    |                |
| sns   | char(2)     | YES  |     | y       |                |
+-------+-------------+------+-----+---------+----------------+


mysql> select * from sub_userinfo;
+----+--------+-----+------+------+------+------+------+------+
| no | name   | age | sex  | kor  | eng  | math | ban  | sns  |
+----+--------+-----+------+------+------+------+------+------+
|  1 | first  |  11 | NULL |  100 |  100 |   99 | A    | n    |
|  2 | second |  22 | m    |   89 |   92 |   78 | B    | y    |
|  3 | third  |  33 | m    |   90 |   92 |   97 | A    | y    |
|  4 | fourth |  44 | f    |   40 |   42 |   67 | C    | n    |
|  5 | fifth  |  55 | f    |   89 |   86 |   99 | B    | y    |
|  6 | sixth  |  66 | m    |   10 |   20 |   44 | C    | n    |
+----+--------+-----+------+------+------+------+------+------+

6 rows in set (0.00 sec)
*/

/*
1. 서브쿼리
- select 구문안에 select 구문
- 서브쿼리 결과가 하나이상이 반환시  in, any, all 사용

2. 형식
select 컬럼 from 테이블명 where 컬럼 in ( select 문 );

------------------------------------------------------------
------------------------------------------------------------ [QUESTION]

--------------------------------------------------------
--------------------------------------------------------
-- BASIC1. 평균나이 이상인 레코드를 추출하시오.
+----+--------+-----+------+------+------+------+------+------+
| no | name   | age | sex  | kor  | eng  | math | ban  | sns  |
+----+--------+-----+------+------+------+------+------+------+
|  4 | fourth |  44 | f    |   40 |   42 |   67 | C    | n    |
|  5 | fifth  |  55 | f    |   89 |   86 |   99 | B    | y    |
|  6 | sixth  |  66 | m    |   10 |   20 |   44 | C    | n    |
+----+--------+-----+------+------+------+------+------+------+
3 rows in set (0.02 sec)
*/
use mbasic;
select * from sub_userinfo;

#1-1.  평균나이 이상인 레코드를 추출하시오.
--  select * from   sub_userinfo where  age >= 평균나이
#1-2.  평균나이
-- select  avg(age) from sub_userinfo;     
#1-3.   1+2
select * from   sub_userinfo where  age >= (select  avg(age) from sub_userinfo);

/*
--------------------------------------------------------
--------------------------------------------------------
-- BASIC2. first와 같은반친구들의 국어, 영어, 수학점수를 추출하시오.
+------+-------+------+------+------+
| ban  | name  | kor  | eng  | math |
+------+-------+------+------+------+
| A    | first |  100 |  100 |   99 |
| A    | third |   90 |   92 |   97 |
+------+-------+------+------+------+
2 rows in set (0.00 sec)

2-1.  first와 같은반친구들의 국어, 영어, 수학점수를 추출하시오.
2-2.  first의 반
2-3.  1+2
*/
select  ban, name, kor,eng, math from  sub_userinfo  where ban=first반;  
select  ban  from sub_userinfo where  name='first';

select  ban, name, kor,eng, math 
from  sub_userinfo  
where ban=(select  ban  from sub_userinfo where  name='first');

/*
--------------------------------------------------------
--------------------------------------------------------
-- BASIC3. first와 같은반친구들의  국어평균점수, 영어평균점수, 수학평균점수를 추출하시오.
+------+---------+---------+---------+
| ban  | kor     | eng     | math    |
+------+---------+---------+---------+
| A    | 95.0000 | 96.0000 | 98.0000 |
+------+---------+---------+---------+
3-1. first와 같은반친구들의  국어평균점수, 영어평균점수, 수학평균점수를 추출하시오.
3-2. first와 같은반
3-3. 1+2
*/
select  ban, avg(kor), avg(eng), avg(math) 
from    sub_userinfo
where   ban= first반
group   by ban;

select ban  from  sub_userinfo  where  name='first';

select  ban, avg(kor), avg(eng), avg(math) 
from    sub_userinfo
where   ban= (select ban  from  sub_userinfo  where  name='first')
group   by ban;

/*
■진행2. CRUD (SELECT Subquery 연습문제1~13)  ##  1~8번까지만 체크!
--------------------------------------------------------
--------------------------------------------------------
-- 연습문제-1
-- emp 테이블에서  사원이름이 JONES 인 사원데이터를  조회하시오.
+------+
| SAL  |
+------+
| 2975 |
+------+
1 row in set (0.00 sec)
*/
select   sal  from emp  where ename='JONES';


/*
--------------------------------------------------------
--------------------------------------------------------
-- 연습문제-2
-- emp 테이블에서  급여가 2975보다 높은 사원데이터를  조회하시오.
+-------+-------+-----------+------+------------+------+------+--------+
| empno | ename | job       | mgr  | hiredate   | sal  | comm | deptno |
+-------+-------+-----------+------+------------+------+------+--------+
|  7788 | SCOTT | ANALYST   | 7566 | 1987-04-19 | 3000 | NULL |     20 |
|  7839 | KING  | PRESIDENT | NULL | 1981-11-17 | 5000 | NULL |     10 |
|  7902 | FORD  | ANALYST   | 7566 | 1981-12-03 | 3000 | NULL |     20 |
+-------+-------+-----------+------+------------+------+------+--------+
3 rows in set (0.00 sec)
*/
-- 2
select * from emp  where  sal>2975;

/*
-- 3 emp 테이블에서  사원이름이 JONES의 급여보다 높은 급여를 받는  사원데이터를  조회하시오.
--------------------------------------------------------
--------------------------------------------------------
-- 연습문제-3
-- emp 테이블에서  사원이름이 JONES의 급여보다 높은 급여를 받는  사원데이터를  조회하시오.
+-------+-------+-----------+------+------------+------+------+--------+
| empno | ename | job       | mgr  | hiredate   | sal  | comm | deptno |
+-------+-------+-----------+------+------------+------+------+--------+
|  7788 | SCOTT | ANALYST   | 7566 | 1987-04-19 | 3000 | NULL |     20 |
|  7839 | KING  | PRESIDENT | NULL | 1981-11-17 | 5000 | NULL |     10 |
|  7902 | FORD  | ANALYST   | 7566 | 1981-12-03 | 3000 | NULL |     20 |
+-------+-------+-----------+------+------------+------+------+--------+
3 rows in set (0.00 sec)
*/
-- 3-1. emp 테이블에서  사원이름이 JONES의 급여보다 높은 급여를 받는  사원데이터
select * from emp  where sal > 'JONES급여';
-- 3-2. JONES의 급여
select sal  from emp  where ename='JONES';
-- 3-3. 1+2
select * from emp  where sal > (select sal  from emp  where ename='JONES');

/*
--------------------------------------------------------
--------------------------------------------------------
-- 연습문제-4
-- emp 테이블에서   scott보다 빨리 입사한 사원목록을 조회하시오.
+-------+--------+-----------+------+------------+------+------+--------+
| empno | ename  | job       | mgr  | hiredate   | sal  | comm | deptno |
+-------+--------+-----------+------+------------+------+------+--------+
|  7369 | SMITH  | CLERK     | 7902 | 1980-12-17 |  800 | NULL |     20 |
|  7499 | ALLEN  | SALESMAN  | 7698 | 1981-02-20 | 1600 |  300 |     30 |
|  7521 | WARD   | SALESMAN  | 7698 | 1981-02-22 | 1250 |  500 |     30 |
|  7566 | JONES  | MANAGER   | 7839 | 1981-04-02 | 2975 | NULL |     20 |
|  7654 | MARTIN | SALESMAN  | 7698 | 1981-09-28 | 1250 | 1400 |     30 |
|  7698 | BLAKE  | MANAGER   | 7839 | 1981-05-01 | 2850 | NULL |     30 |
|  7782 | CLARK  | MANAGER   | 7839 | 1981-06-09 | 2450 | NULL |     10 |
|  7839 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000 | NULL |     10 |
|  7844 | TURNER | SALESMAN  | 7698 | 1981-09-08 | 1500 |    0 |     30 |
|  7900 | JAMES  | CLERK     | 7698 | 1981-12-03 |  950 | NULL |     30 |
|  7902 | FORD   | ANALYST   | 7566 | 1981-12-03 | 3000 | NULL |     20 |
|  7934 | MILLER | CLERK     | 7782 | 1982-01-23 | 1300 | NULL |     10 |
+-------+--------+-----------+------+------------+------+------+--------+
12 rows in set (0.00 sec)
*/
-- 4.    scott보다 빨리 입사한 사원목록을 조회
-- 4-1.  scott보다 빨리 입사한 사원목록을 조회
select * from emp where hiredate < 'scott입사날짜';
-- 4-2. scott입사날짜
select  hiredate  from emp  where  ename='SCOTT';
-- 4-3. 1+2
select * from emp where hiredate < (select  hiredate  from emp  where  ename='SCOTT');


/*
--------------------------------------------------------
--------------------------------------------------------
-- 연습문제-5
-- emp 테이블에서  20번 부서에 속한 사원중
-- 전체 사원의 평균급여보다 높은 급여를 받는 사원정보와 소속부서 정보를 조회하시오.
+-------+-------+---------+------+--------+----------+--------+
| EMPNO | ENAME | JOB     | SAL  | DEPTNO | DNAME    | LOC    |
+-------+-------+---------+------+--------+----------+--------+
|  7902 | FORD  | ANALYST | 3000 |     20 | RESEARCH | DALLAS |
|  7788 | SCOTT | ANALYST | 3000 |     20 | RESEARCH | DALLAS |
|  7566 | JONES | MANAGER | 2975 |     20 | RESEARCH | DALLAS |
+-------+-------+---------+------+--------+----------+--------+
3 rows in set (0.00 sec)
*/
-- 5. emp 테이블에서  20번 부서에 속한 사원중 전체 사원의 평균급여보다 높은 급여를 받는 사원정보와 소속부서 정보를 조회하시오.
-- 5-1.  emp 테이블에서  20번 부서에 속한 사원중 전체 사원의 평균급여보다 높은 급여를 받는 사원정보와 소속부서 정보를 조회
select   EMPNO , ENAME , JOB    , SAL  , e.DEPTNO , DNAME   , LOC
from     emp e, dept d 
where    e.deptno = d.deptno  and e.deptno=20  and sal > 평균급여
order   by  empno  desc;
-- 5-2.  평균급여
select  avg(sal)  from emp;
-- 5-3   1+2
select   EMPNO , ENAME , JOB    , SAL  , e.DEPTNO , DNAME   , LOC
from     emp e, dept d 
where    e.deptno = d.deptno  and e.deptno=20  and sal > (select  avg(sal)  from emp)
order   by  empno  desc;


/*
--------------------------------------------------------
--------------------------------------------------------
-- 연습문제-6
-- emp 테이블에서  부서번호가 20 또는 30인 사원정보를  조회하시오.
+-------+--------+----------+------+------------+------+------+--------+
| empno | ename  | job      | mgr  | hiredate   | sal  | comm | deptno |
+-------+--------+----------+------+------------+------+------+--------+
|  7369 | SMITH  | CLERK    | 7902 | 1980-12-17 |  800 | NULL |     20 |
|  7499 | ALLEN  | SALESMAN | 7698 | 1981-02-20 | 1600 |  300 |     30 |
|  7521 | WARD   | SALESMAN | 7698 | 1981-02-22 | 1250 |  500 |     30 |
|  7566 | JONES  | MANAGER  | 7839 | 1981-04-02 | 2975 | NULL |     20 |
|  7654 | MARTIN | SALESMAN | 7698 | 1981-09-28 | 1250 | 1400 |     30 |
|  7698 | BLAKE  | MANAGER  | 7839 | 1981-05-01 | 2850 | NULL |     30 |
|  7788 | SCOTT  | ANALYST  | 7566 | 1987-04-19 | 3000 | NULL |     20 |
|  7844 | TURNER | SALESMAN | 7698 | 1981-09-08 | 1500 |    0 |     30 |
|  7876 | ADAMS  | CLERK    | 7788 | 1987-05-23 | 1100 | NULL |     20 |
|  7900 | JAMES  | CLERK    | 7698 | 1981-12-03 |  950 | NULL |     30 |
|  7902 | FORD   | ANALYST  | 7566 | 1981-12-03 | 3000 | NULL |     20 |
+-------+--------+----------+------+------------+------+------+--------+
11 rows in set (0.00 sec)
*/ 
select * from emp  where   deptno =20 or  deptno=30;
select * from emp  where   deptno  in  (20,30);   -- ##



/*
 --------------------------------------------------------
--------------------------------------------------------
-- 연습문제-7
-- emp 테이블에서  부서번호 별로 최대급여를 조회하시오.
+----------+
| MAX(SAL) |
+----------+
|     5000 |
|     3000 |
|     2850 |
+----------+
3 rows in set (0.00 sec)
*/
-- 7
select deptno, max(sal)  from  emp  group by deptno order by max(sal) desc;



/*
--------------------------------------------------------
--------------------------------------------------------
-- 연습문제-8
-- emp 테이블에서  각 부서별 최고 급여와 동일한 급여를 받는 사원정보를   조회하시오.
+-------+-------+-----------+------+------------+------+------+--------+
| empno | ename | job       | mgr  | hiredate   | sal  | comm | deptno |
+-------+-------+-----------+------+------------+------+------+--------+
|  7698 | BLAKE | MANAGER   | 7839 | 1981-05-01 | 2850 | NULL |     30 |
|  7788 | SCOTT | ANALYST   | 7566 | 1987-04-19 | 3000 | NULL |     20 |
|  7839 | KING  | PRESIDENT | NULL | 1981-11-17 | 5000 | NULL |     10 |
|  7902 | FORD  | ANALYST   | 7566 | 1981-12-03 | 3000 | NULL |     20 |
+-------+-------+-----------+------+------------+------+------+--------+
4 rows in set (0.00 sec)
*/
-- 8  emp 테이블에서  각 부서별 최고 급여와 동일한 급여를 받는 사원정보
-- 8-1.  emp 테이블에서  각 부서별 최고 급여와 동일한 급여를 받는 사원정보
-- select * from emp  where  sal in ( 각부서별 최고급여 );
-- 8-2. 각부서별 최고급여
select max(sal)  from  emp  group by deptno;
-- 8-3 1+2
select * from emp  where  sal in ( select max(sal)  from  emp  group by deptno);



/*
1. 다중행 연산자
-  in , any(some) ,  all
2. in  : 서브쿼리의 결과가 하나라도 일치하면 true
3. any : 서브쿼리의 결과가 하나이상이면 true
4. all : 서브쿼리의 결과가 모두 만족하면  true

2. any : 하나라도 일치하면 참  (선한개)
컬럼명  < any(1,2,3)            |(1)   |(2)   |(3)  ★     최대값보다 작다.
컬럼명  > any(1,2,3)          ★ |(1)   |(2)   |(3)  최소값보다 크다

3. all : 모두가 일치하면 참 (선 3개)
컬럼명  < all(1,2,3)          ★ |(1)   |(2)   |(3)        최소값보다 작다  
컬럼명  > all(1,2,3)             |(1)   |(2)   |(3)  ★       최대값보다 크다
*/

create  table atest  as           select 1 num  from dual
					   union all  select 2      from dual 
					   union all  select 3      from dual 
					   union all  select 4      from dual 
					   union all  select 5      from dual 
					   union all  select 6      from dual;
                       
select * from atest;

select num  from atest where  num < any(select num from atest  where num in(3,4,5)) order by num;
-- 최대값보다 작다          5보다 작다  -> 결과값  1,2,3,4

select num  from atest where  num > any(select num from atest  where num in(3,4,5)) order by num;
-- 최소값보다 크다          3보다 크다 -> 결과값 4, 5 ,6

select num  from atest where  num < all(select num from atest  where num in(3,4,5)) order by num;
-- 최소값보다 작다 (all #)  3보다 작다 -> 결과값 1,2

select num  from atest where  num > all(select num from atest  where num in(3,4,5)) order by num;
-- 최대값보다 크다 (all #)  5보다 크다 -> 결과값  6



/*
--------------------------------------------------------
--------------------------------------------------------
-- 연습문제-9
-- emp 테이블에서  ANY를 이용하여 각 부서별 최고 급여와 동일한 급여를 받는 사원정보를   조회하시오.
-- ※ ANY , SOME 연산자는 서브쿼리가 반환한 여러결과값 중
-- 메인쿼리와 조건식을 사용한 결과가 하나라도 TRUE라면 메인쿼리조건식을 TRUE로 반환해주는 연산자
+-------+-------+-----------+------+------------+------+------+--------+
| empno | ename | job       | mgr  | hiredate   | sal  | comm | deptno |
+-------+-------+-----------+------+------------+------+------+--------+
|  7698 | BLAKE | MANAGER   | 7839 | 1981-05-01 | 2850 | NULL |     30 |
|  7788 | SCOTT | ANALYST   | 7566 | 1987-04-19 | 3000 | NULL |     20 |
|  7839 | KING  | PRESIDENT | NULL | 1981-11-17 | 5000 | NULL |     10 |
|  7902 | FORD  | ANALYST   | 7566 | 1981-12-03 | 3000 | NULL |     20 |
+-------+-------+-----------+------+------------+------+------+--------+
4 rows in set (0.00 sec)
*/
-- 9 emp 테이블에서  ANY를 이용하여 각 부서별 최고 급여와 동일한 급여를 받는 사원정보를   조회하시오.
-- any 최대값 작다 / 최소값 크다
-- all 최소값 작다 / 최대값 크다
-- 9-1  select * from emp  where sal= (최고급여)
-- 9-2  any 다중행함수   (최고급여)  각 부서별 최고 급여와 동일한 급여
select max(sal) from emp  group by deptno;   -- (3000,2850,5000)
-- 9-3  1+ 2
select * from emp  where sal = any(select max(sal) from emp  group by deptno);

/*
--------------------------------------------------------
--------------------------------------------------------
-- 연습문제-10
-- emp 테이블에서 SOME를 이용하여 각 부서별 최고 급여와 동일한 급여를 받는 사원정보를   조회하시오.
-- ※ ANY , SOME 연산자는 서브쿼리가 반환한 여러결과값 중
-- 메인쿼리와 조건식을 사용한 결과가 하나라도 TRUE라면 메인쿼리조건식을 TRUE로 반환해주는 연산자
+-------+-------+-----------+------+------------+------+------+--------+
| empno | ename | job       | mgr  | hiredate   | sal  | comm | deptno |
+-------+-------+-----------+------+------------+------+------+--------+
|  7698 | BLAKE | MANAGER   | 7839 | 1981-05-01 | 2850 | NULL |     30 |
|  7788 | SCOTT | ANALYST   | 7566 | 1987-04-19 | 3000 | NULL |     20 |
|  7839 | KING  | PRESIDENT | NULL | 1981-11-17 | 5000 | NULL |     10 |
|  7902 | FORD  | ANALYST   | 7566 | 1981-12-03 | 3000 | NULL |     20 |
+-------+-------+-----------+------+------------+------+------+--------+
4 rows in set (0.00 sec)
*/
-- 10 emp 테이블에서  SOME를 이용하여 각 부서별 최고 급여와 동일한 급여를 받는 사원정보를   조회하시오.
-- any 최대값 작다 / 최소값 크다
-- all 최소값 작다 / 최대값 크다
-- 10-1  select * from emp  where sal= (최고급여)
-- 10-2  any 다중행함수   (최고급여)  각 부서별 최고 급여와 동일한 급여
select max(sal) from emp  group by deptno;   -- (3000,2850,5000)
-- 10-3  1+ 2
select * from emp  where sal = some(select max(sal) from emp  group by deptno);


/*
--------------------------------------------------------
--------------------------------------------------------
-- 연습문제-11
-- emp 테이블에서  부서번호가 30인 사원의 급여를  조회하시오.
+------+
| SAL  |
+------+
| 1600 |
| 1250 |
| 1250 |
| 2850 |
| 1500 |
|  950 |
+------+
6 rows in set (0.00 sec)
*/
select sal  from emp  where deptno=30;

 

/*
--------------------------------------------------------
--------------------------------------------------------
-- 연습문제-12  부서번호가 30인 사원의 최대급여보다  작은 급여를 받는 사원의 데이터를 조회하시오. 
-- emp 테이블에서  ANY 또는  all를 이용하여 아래와 같이 결과가 나오게 만들어주세요!
-- ※ ANY , SOME 연산자는 서브쿼리가 반환한 여러결과값 중
-- 메인쿼리와 조건식을 사용한 결과가 하나라도 TRUE라면 메인쿼리조건식을 TRUE로 반환해주는 연산자
+-------+--------+----------+------+------------+------+------+--------+
| empno | ename  | job      | mgr  | hiredate   | sal  | comm | deptno |
+-------+--------+----------+------+------------+------+------+--------+
|  7369 | SMITH  | CLERK    | 7902 | 1980-12-17 |  800 | NULL |     20 |
|  7900 | JAMES  | CLERK    | 7698 | 1981-12-03 |  950 | NULL |     30 |
|  7876 | ADAMS  | CLERK    | 7788 | 1987-05-23 | 1100 | NULL |     20 |
|  7521 | WARD   | SALESMAN | 7698 | 1981-02-22 | 1250 |  500 |     30 |
|  7654 | MARTIN | SALESMAN | 7698 | 1981-09-28 | 1250 | 1400 |     30 |
|  7934 | MILLER | CLERK    | 7782 | 1982-01-23 | 1300 | NULL |     10 |
|  7844 | TURNER | SALESMAN | 7698 | 1981-09-08 | 1500 |    0 |     30 |
|  7499 | ALLEN  | SALESMAN | 7698 | 1981-02-20 | 1600 |  300 |     30 |
|  7782 | CLARK  | MANAGER  | 7839 | 1981-06-09 | 2450 | NULL |     10 |
+-------+--------+----------+------+------------+------+------+--------+
9 rows in set (0.00 sec)
*/
-- any 최대값 작다 # 2850 보다 / 최소값 크다    (1600,  1250 , 2850 , 1500 950 )
-- all 최소값 작다 / 최대값 크다
-- 12-1.  emp 테이블에서  부서번호가 30인 사원의 급여를  조회하시오.  (1600,  1250 , 2850 , 1500 950 ) 
-- 12-2.  부서번호가 30인 사원의 최대급여보다  작은 급여를 받는 사원의 데이터를 조회하시오. 
select * from emp  where  sal  < any (  select sal  from emp  where deptno=30 )  order by sal;



/*
--------------------------------------------------------
--------------------------------------------------------
-- 연습문제-13
-- emp 테이블에서  30번 부서 사원들의 최소급여보다 많은 급여를 받는  사원데이터를  조회하시오.
+-------+--------+-----------+------+------------+------+------+--------+
| empno | ename  | job       | mgr  | hiredate   | sal  | comm | deptno |
+-------+--------+-----------+------+------------+------+------+--------+
|  7839 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000 | NULL |     10 |
|  7788 | SCOTT  | ANALYST   | 7566 | 1987-04-19 | 3000 | NULL |     20 |
|  7902 | FORD   | ANALYST   | 7566 | 1981-12-03 | 3000 | NULL |     20 |
|  7566 | JONES  | MANAGER   | 7839 | 1981-04-02 | 2975 | NULL |     20 |
|  7698 | BLAKE  | MANAGER   | 7839 | 1981-05-01 | 2850 | NULL |     30 |
|  7782 | CLARK  | MANAGER   | 7839 | 1981-06-09 | 2450 | NULL |     10 |
|  7499 | ALLEN  | SALESMAN  | 7698 | 1981-02-20 | 1600 |  300 |     30 |
|  7844 | TURNER | SALESMAN  | 7698 | 1981-09-08 | 1500 |    0 |     30 |
|  7934 | MILLER | CLERK     | 7782 | 1982-01-23 | 1300 | NULL |     10 |
|  7521 | WARD   | SALESMAN  | 7698 | 1981-02-22 | 1250 |  500 |     30 |
|  7654 | MARTIN | SALESMAN  | 7698 | 1981-09-28 | 1250 | 1400 |     30 |
|  7876 | ADAMS  | CLERK     | 7788 | 1987-05-23 | 1100 | NULL |     20 |
+-------+--------+-----------+------+------------+------+------+--------+
12 rows in set (0.00 sec)

*/

-- any 최대값 작다 / 최소값 크다    (1600,  1250 , 2850 , 1500 950 )
-- all 최소값 작다 / 최대값 크다

select *
from   emp 
where  sal >  any( select sal from emp  where deptno=30)
order by sal  desc;


